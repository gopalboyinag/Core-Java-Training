package collections;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		int x=10;
		
		/*ArrayList list = new ArrayList(); 
		
		list.add(10); // 0
		list.add("selenium");//1
		list.add(87878787l);//2
		list.add(8.87787);//3
		
	System.out.println(list.get(10));*/
		
		int arr[] ={10,20,30,40};
		
		ArrayList<Integer> list = new ArrayList<Integer>();//first way
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();//second way
		
		for(int i=0; i<arr.length; i++)
		{
			list.add(arr[i]);
			System.out.println(list1.get(i));
		}

	}

}
