package simplePrograms;
import java.util.*;
public class PalindromeUsingString {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String word1=sc.nextLine();
	String word2="";
	for(int i=word1.length()-1;i>=0;i--)
	{
		word2+=word1.charAt(i);
		
	}
	if(word1.equals(word2))
		System.out.println("palindrome");
	else
		System.out.println("not a Palindrome");
}
}
