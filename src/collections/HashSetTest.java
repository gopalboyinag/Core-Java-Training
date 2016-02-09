package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<Integer> set =  new HashSet<Integer>();
		
		set.add(100);
		set.add(200);
		set.add(200);
		set.add(400);
		set.add(500);
		
		Iterator<Integer> itr=set.iterator();
		
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		/*while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		

	}

}
