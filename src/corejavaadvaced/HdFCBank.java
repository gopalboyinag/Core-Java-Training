package corejavaadvaced;

public class HdFCBank {

	String firstName;
	String lastName;
	String address;
	int phoneNumber;
	
	HdFCBank(String cFirstName, String cLastName, String cAddress, int cPhoneNumber)
	{
		
		firstName=cFirstName;
		lastName=cLastName;
		address=cAddress;
		phoneNumber=cPhoneNumber;
	}
	public static void main(String[] args) {
		
		
	}
	
	public void opneAccount()
	{
		System.out.println(firstName);
		
	}

}
