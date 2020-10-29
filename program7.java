import java.io.*;
import java.util.Scanner;
public class program7 
{
   public static void main(String[] args)
   {
	   program7 obj=new program7();
	   obj.fib();
   }
   
   void fib()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number of terms : -");
	   int n=sc.nextInt();
	   int n1=0,n2=1;
	   System.out.println("FIBONACCI SERIES :-");
	   for(int i=0;i<n;i++)
	   {
		   System.out.println(n1);
			int temp = n1 + n2;
			n1 = n2;
			n2 = temp; 
	   }
	   sc.close();
   }
}
