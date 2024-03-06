package initial_code;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("mango");
		a.add("apple");
		a.add("papaya");
		a.add("kiwi");
		System.out.println(a);
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		a.set(1,"sitafal");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.add("coconut");
		System.out.println(a);
	}

}
