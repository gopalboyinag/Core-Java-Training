package corejava;

public class ArrayDemoTest {

	public static void main(String[] args) {
		
		int arr[] ={10, 20, 30, 40}; //second way
		
		String name[] ={"HYD","PUNE","BANG","CHICAGO"};
		
		/*for(int i=0; i<arr.length;i++)
		{	
			System.out.println(arr[i]);
		}*/
		
		//System.out.println(arr[0]);
		
		/*for(int x:arr)//for-each loop
		{
			System.out.println(x);
		}*/
		
		/*for(String x:name)
		{
			System.out.println(x);
		}*/
		
		Object obj[] = new Object[5];
		
		obj[0]="Selenium";
		obj[1]=7878;
		obj[2]=9.98798798;
		obj[3]="goapl@gmail.com";
		obj[4]='e';
		
	}

}
