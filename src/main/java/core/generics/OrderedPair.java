package core.generics;

public class OrderedPair<K,V> implements Pair<K, V> {

	K key;
	V value;
	
	
	public OrderedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
