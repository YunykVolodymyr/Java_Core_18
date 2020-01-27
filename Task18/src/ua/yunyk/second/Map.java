package ua.yunyk.second;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Map<K, V> {

	Set<MyEntry<K, V>> set = new HashSet<MyEntry<K, V>>();

	public V put(K key, V value) {
		Iterator<MyEntry<K, V>> iterator = set.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> next = iterator.next();
			if (next.getKey().equals(key)) {
				V old = next.getValue();
				next.setValue(value);
				return old;
			}
		}
		set.add(new MyEntry<K, V>(key, value));
		return null;
	}

	public V remove(K key) {
		Iterator<MyEntry<K, V>> iterator = set.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> next = iterator.next();
			if (next.getKey().equals(key)) {
				V old = next.getValue();
				iterator.remove();
				return old;
			}
		}
		return null;
	}

	public K removeByValue(V value) {
		Iterator<MyEntry<K, V>> iterator = set.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> next = iterator.next();
			if (next.getValue().equals(value)) {
				K old = next.getKey();
				iterator.remove();
				return old;
			}
		}
		return null;
	}

	public void printKeySet() {
		Set<K> keys = new HashSet<K>();
		Iterator<MyEntry<K, V>> iterator = set.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> next = iterator.next();
			keys.add(next.getKey());
		}
		System.out.println(keys);
	}

	public void printValues() {

		List<V> values = new ArrayList<V>();
		Iterator<MyEntry<K, V>> iterator = set.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> next = iterator.next();
			values.add(next.getValue());
		}
		System.out.println(values);
	}

	public void print() {
		Iterator<MyEntry<K, V>> iterator = set.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> next = iterator.next();
			System.out.println(next);
		}
	}

}
