package org.egitim.data;

import java.util.Collection;
/*
 * The IRepo is a repository to do various CRUD operations.
 * It can take any type.
 */
public interface IRepo<K, T> {
	Collection<T> find();

	T find(K id);

	K save(T value);

	void update(T value);

	void delete(T value);

}
