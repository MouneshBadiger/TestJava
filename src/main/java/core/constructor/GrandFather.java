package core.constructor;

public class GrandFather implements Enjoyable{
	
	public GrandFather() {
		// TODO Auto-generated constructor stub
		System.out.println("--GrandFather NO arg-constr-");
	}
	public GrandFather(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("--GrandFather no arg-constr-"+name);
	}
	
	@Override
	public void listenMusic() {
		System.out.println("---listning Classical Music---");
		
	}

}
