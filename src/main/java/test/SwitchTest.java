package test;

/**
 * @author MOUNESHBADIGERBadige
 *There can be one or N number of case values for a switch expression.
The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
The case values must be unique. In case of duplicate value, it renders compile-time error.
The Java switch expression must be of byte, short, int, long (with its Wrapper type),
 enums and string.
Each case statement can have a break statement which is optional.
*When control reaches to the break statement, it jumps the control after the switch expression.
 If a break statement is not found, it executes the next case.
The case value can have a default label which is optional.
 */
public class SwitchTest {
	
	
	public static void main(String[] args) {
		Family member=Family.FATHER;
			switch(member) {
			case FATHER:System.out.println("Guru");
			case MOTHER:System.out.println("Yashodha");
			default:System.out.println("default");
		}
		
	}

}
enum Family{
	
	FATHER,
	MOTHER,
	DAUGHTER,
	SON;
	
}