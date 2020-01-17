package project1;
import java.util.*;
public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> charOcc=new HashMap<>();
		String str="Nishitha Reddy";
		for(char c:str.toCharArray())
		{
			if(charOcc.containsKey(c))
			{
				int oc=charOcc.get(c)+1;
				charOcc.put(c, oc);
			}
			else
			{
				charOcc.put(c, 1);
			}
		}
		charOcc.forEach((c,oc)->System.out.println(c+"->"+oc));
	}

}
