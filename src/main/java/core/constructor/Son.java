package core.constructor;

/**
 * @author MOUNESHBADIGERBadige
 *1.Java Compiler Adds Default No argument constructor when No construcot has been provided
 *2.Compiler adds super() to each Parameterized constructor
 *3.If there is argumented constructor Compiler wont add any constructor.
 * So if You have parameterized constructor in child and parent doest not have a default constructor super() will fail and its compiler error
 *
 */
public class Son extends Father {
	
	public Son() {
		this("Mounesh");
		System.out.println("--Son no arg-constr-");
	}
	public Son(String name) {
		super(name);
		System.out.println("--Son arg-constr-"+name);
	}
	
	@Override
	public void listenMusic() {
		// TODO Auto-generated method stub
		//super.listenMusic();
		System.out.println("---listning HIP-HOP Music---");
	}

}
