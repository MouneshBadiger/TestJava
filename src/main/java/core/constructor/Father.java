package core.constructor;

public class Father extends GrandFather{
	
		
	/*
	 * public Father() { System.out.println("--Father NO arg-constr-"); }
	 */
	public Father(String name) {
		System.out.println("--Father arg-constr-"+name);
	}
	@Override
	public void listenMusic() {
		//super.listenMusic();
		System.out.println("---listning Bollyhood Music---");
	}

}
