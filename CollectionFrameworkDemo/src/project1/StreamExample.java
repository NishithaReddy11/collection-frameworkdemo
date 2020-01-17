package project1;
import java.util.*;
public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> items=Arrays.asList("Abhi","payel","rahul","mohan");
		items.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
