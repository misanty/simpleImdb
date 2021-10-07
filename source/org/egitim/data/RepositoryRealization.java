package org.egitim.data;

import java.util.Collection;
import java.util.Collections;
import org.springframework.stereotype.Component;

@Component
public abstract class RepositoryRealization<T, K> implements IRepo<K, T> {

 private Collection<T> collection;
	
	@Override
	public Collection<T> find() {
		
		return collection != null ? collection : Collections.emptyList();
	}

	

}
