package simplePrograms;
import java.util.*;
public class PalindromeUsingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number ");
		int num=sc.nextInt();
		int temp=num,rev=0;
		int remin=0;
		 while(num>0)
		  {
			rev=rev*10 ;
			rev=rev+num % 10;
			num=num/10;
		  }
		  if(rev==temp)
		  {
			  System.out.println("Palindrome !!!");
		  }
		  else
		  {
			  System.out.println("Not a Palindrome  :(");
		  }
		  sc.close();
	}

}
