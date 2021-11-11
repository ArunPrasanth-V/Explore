package simplePrograms;
import java.util.*;
public class SumOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			sum+=rem;   
			num/=10;
		}
		System.out.println(sum);

	}

}
