package simplePrograms;

public class multiplySomthing {
 public static void main (String args[])
 {
	 int n=1000;
	 int sum=0;
	 for(int i=0;i<1000;i++)
	 {
		 if(i%3==0||i%5==0)
		 {
			 sum+=i;
		 }
		
	 }
	 System.out.println("The Number  "+sum);
	 //neega ethu mathiri yana sonniga our doubt ta irrku
 }
}
