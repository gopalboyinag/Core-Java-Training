package corejava;

public class ArraysTest {

	public static void main(String[] args) {
		
		String str[] = new String[100];//0 1 2 3 4 5 6
		
		char c='d';
		
		str[0] ="12";
		str[1] ="Selenium";
		System.out.println(str[1]);
		
		int arr[]= new int[5];
		
		arr[0]=10;// ---------->>> 10
		arr[1]=20;
		arr[3]=30;
		
		System.out.println(arr[3]);
		
		//0  -->(12)
		//1  -->(20)
		//99 -->(89)
		
	/*	int x=100;
		
		System.out.println(x); //25
*/
	}

}
