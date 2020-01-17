package project1;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection items=new ArrayList();
		items.add("Mahesh");
		items.add(25);
		items.add(true);
		items.add(20.6);
		
		for(Object item:items)
		{
			System.out.println(item);
		}
		items.remove(25);
		System.out.println("After removing");
		for(Object item:items)
		{
			System.out.println(item);
		}
		
		System.out.println();
	}

}
