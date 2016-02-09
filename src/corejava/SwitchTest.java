package corejava;

public class SwitchTest {

	SwitchTest()
	{
		System.out.println("Browser opening.......");
	}
	
	SwitchTest(int x, int y)
	{
		System.out.println(x+ "---"+ y);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		chooseOption(20);
	}
	
	public static void chooseOption(int x)
	{
		switch (x) {
		
		case 1:
			
			System.out.println("Hello Tunes");
			
			break;
			
		case 2:
			
			System.out.println("Broadband Connection");
			
			break;
			
		case 3:
			
			System.out.println("Customer Care");
			
			break;

		default:
			
			System.out.println("closing");
			
			break;
		}
	}

}
