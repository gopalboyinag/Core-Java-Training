package oops1;

public class CalTest {

	public static void main(String[] args) {
		
		CalTest cal = new CalTest();
		cal.add(10, 20,30);
		
		StringBuffer buffer = new StringBuffer();
		
		
	}

	public void add(int x, int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	
	public void add(int x, int y, int z)
	{
		int c=x+y+z;
		System.out.println(c);
	}

}
