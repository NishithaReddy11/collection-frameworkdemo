package project1;
import java.util.Arrays;
import java.util.List;
public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(5,2,1,3,10);
		int sum=nums.stream().filter((i)->i%2!=0).mapToInt((i)->i*i).sum();
		System.out.println("Sum is:"+sum);
		
	}

}
