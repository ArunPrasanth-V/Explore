package simplePrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String args[])
	{
		//here every number is calculated based on
		//addition of previous number
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number !");
    int n=sc.nextInt();
    int a=0,b=1,c;
   
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(a+" ");
	    	//a-->current value then,b-->next value
	    	c=a+b;//by add these c become next next value
	    	a=b;
	    	b=c;
	    
	    			
	    }
	}
}
