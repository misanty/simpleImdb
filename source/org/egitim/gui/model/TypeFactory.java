package org.egitim.gui.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TypeFactory {
	/*
	 * Once the spring is run this class variable will be loaded with all the child
	 * classes of this class to hold into
	 */
	private final Map<String, WhichType> typeBag = new HashMap<>();

	@Autowired
	ApplicationContext context;

	/*
	 * This piece of method works just after the this class initialized
	 */
	@PostConstruct
	public void initilizeType() {
		populateTypeBag(context.getBeansOfType(WhichType.class).values().iterator());
	}

	/*
	 * This populates the typebag from the context of the child classes of this
	 * factory class
	 */
	private void populateTypeBag(final Iterator<WhichType> typeIterator) {
		while (typeIterator.hasNext()) {
			WhichType type = typeIterator.next();
			typeBag.put(type.getClass().getName(), type);
		}
	}

}
