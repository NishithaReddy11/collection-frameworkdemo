package project1;
import java.util.*;
public class StreamLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> years=Arrays.asList(2011,2006,2010,2016,2018,2020,1996,2000);
		years.stream().filter(s->(s%4==0||(s%100==0 && s%400==0))).forEach(s->System.out.println(s));
	}

}
