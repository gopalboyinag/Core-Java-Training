package corejavaadvaced;

public class ExceptionHandlingTest {

	
	public static void main(String[] args) {
		
		try{
			int x=12/0;
			System.out.println(x);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("intx");
		
	}
}
	
		


