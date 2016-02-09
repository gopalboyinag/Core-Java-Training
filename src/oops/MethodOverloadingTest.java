package oops;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		

		MethodOverloadingTest mo = new MethodOverloadingTest();
	
	}
	
	public void testMethod(int x, String str)
	{
		System.out.println("printing x value");
	}
	public void testMethod(String str, int y)
	{
		System.out.println("printing x and y values");
	}

}
