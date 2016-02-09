package oops;


public class BankTest {

	public static void main(String[] args) {
		
		//---------------------Admin-----------
		EncapTest  test = new EncapTest();
		test.setAcctNumber(6756);
		test.setAddress("HYD");
		test.setName("Selenium");
		
		
		//------------customer-------------
		
		String name=test.getName();
		String address=test.getAddress();
		int accNum=test.getAcctNumber();
		
		System.out.println(name+"-- "+address+" --"+accNum);
		
		
		
	}

}
