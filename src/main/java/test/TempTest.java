package test;

public class TempTest {
	public static void main(String[] args) {
		String name="mounesh\nbadige王";
		System.out.println(name);
		name=name.replaceAll("[^\\x00-\\x7F]", "");
		name=name.replaceAll("\n", "");
		System.out.println(name);
	}

}
