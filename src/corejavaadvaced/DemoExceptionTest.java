package corejavaadvaced;

import java.io.FileNotFoundException;

public class DemoExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ExceptionTest test = new ExceptionTest();
		try {
			test.testMethod();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
