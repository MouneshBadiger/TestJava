package core.generics;

public class Box<T> {
	T t;
	
	public Box(T t) {
		super();
		this.t = t;
	}
	public T getItem() {
		return t;
	}
	public void  setItem(T t) {
		this.t=t;
	}
	@Override
	public String toString() {
		return t.toString();
	}
	
	public <U extends Number>void inspect(U u) {
		System.out.println(" U type:"+u.getClass().getName());
		
	}
}
