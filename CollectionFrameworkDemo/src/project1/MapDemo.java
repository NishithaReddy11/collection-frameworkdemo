package project1;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> trainees=new HashMap<>();
		trainees.put("Nishitha","Warangal");
		trainees.put("Teju", "Hyderabad");
		trainees.put("Parul", "odisa");
		trainees.put("chetna", "odisa");
//		System.out.println(trainees.get("Nishitha"));
//		System.out.println("Enter a name:");
//		String name=new Scanner(System.in).nextLine();
//		System.out.println("Location is:"+trainees.get(name));

		
		
//		for(String key:trainees.keySet())
//		{
//			System.out.println("Name :"+key+"\tLocation :"+trainees.get(key));
//		}
		trainees.forEach((k,v)->System.out.println("Name :"+k+"\tLocation :"+v));
	}

}
