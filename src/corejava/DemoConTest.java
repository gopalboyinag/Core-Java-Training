package corejava;

public class DemoConTest {
	
	int mobileNumber;
	String name;
	String address;
	
	DemoConTest(int mNumber, String cname, String caddress)
	{
		this.mobileNumber=mNumber;
		this.name=cname;
		this.address=caddress;
	}
	

	public static void main(String[] args) {
		
	}
	public void testDemo()
	{
		System.out.println(mobileNumber+" -- "+name+" -- "+address);
	}

}
