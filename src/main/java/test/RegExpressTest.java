package test;

public class RegExpressTest {
	public static void main(String[] args) {
		
		//String str="[11/11/19 22:00:09:016 EST] 000000ec SystemErr     R java.sql.SQLException: Login failed for user 'CPC_User1'. ClientConnectionId:758f8659-eb12-4bf6-a04a-44ec87be1284 DSRA0010E: SQL State = S0001, Error Code = 18,456";
		String str=".Exception";
		if(str.matches("\\?\\.Exception")) {
			System.out.println("true");
		}
	}

}
