package simplePrograms;

import java.util.Arrays;

public class ReverseAnArray {
public static void main(String args[])
{
	int arr[]= {1,2,3,4,5,6,7,8,9};
	int l=arr.length-1;
	int start=0;
	while(start<l)
	{
		int temp=arr[start];
		arr[start]=arr[l];
		arr[l]=temp;
		start++;
		l--;
	}
	Arrays.stream(arr).forEach(System.out::println);
}
	
}
