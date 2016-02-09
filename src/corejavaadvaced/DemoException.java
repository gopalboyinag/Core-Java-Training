package corejavaadvaced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoException {

	public static void main(String[] args) throws FileNotFoundException  {
	
		throw new FileNotFoundException("Gopal had give some thing by zero");
	

	}
	public void testMethod() 
	{
		try {
			FileInputStream fis = new FileInputStream("");
			
			int x=12/0;
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		 }catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
