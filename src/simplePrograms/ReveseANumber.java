package simplePrograms;
import java.util.*;
public class ReveseANumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rev=0,remin=0;//1354
    while(num>=1)
	{
		remin=num%10;
		rev=rev*10+remin;//453
		num=num/10;
	}
	System.out.println(rev);

	}

}
// not work eg:-644 the o/p like 0..