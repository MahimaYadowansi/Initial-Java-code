package initial_code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Example {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		System.out.println(list);
		System.out.println(list.size());
		
		//HOW TO ADD VALUE IN LIST
		list.add(10);
		list.add("mahima");
		list.add(10.25);
		list.add('m');
		list.add("mahima");
		list.add(true);
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		
		//HOW TO FETCH VALUE FROM LIST
		
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		
		//REMOVE VALUE FROM LIST
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.size());
		
		//ITTIRATE THROUG THE LIST
	/*	for(int i=0;i<=list.size();i++)
		{
			System.out.println(list.get(i));
		}*/
		//2nd typ
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//3rd typ
			/*for(Object var:list)
			{
				System.out.println(var);
			}*/
				
				
	}

}
