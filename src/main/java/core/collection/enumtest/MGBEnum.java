package core.collection.enumtest;

public class MGBEnum {
	
	ClassAsEnum first=ClassAsEnum.FIRST;
	
	

}
//https://stackoverflow.com/questions/4709175/what-are-enums-and-why-are-they-useful
class ClassAsEnum{
	public static ClassAsEnum FIRST=new ClassAsEnum(1);
	public static ClassAsEnum SECOND=new ClassAsEnum(2);
	public static ClassAsEnum THIRD=new ClassAsEnum(3);
	public static ClassAsEnum FOURTH=new ClassAsEnum(4);
	//if you have abstract methods use anonymous class to implemnt it
	int enumConstant;
	private ClassAsEnum(int enumConstant) {
		this.enumConstant=enumConstant;
	}
	
	
	
	
}