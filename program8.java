import java.io.*;
import java.util.Scanner;
public class program8 
{
	public static void main(String[] args)
	{
		program8 obj=new program8();
		obj.fact();
	}
	
	void fact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n= sc.nextInt();
		int f= 1;
		for(int i=1 ; i<=n; i++) {
			for(int j=1 ; j<=i ; j++) {
				f *= j;
			}
			System.out.println("Factorial of "+i+" is "+f);
			f= 1;
		}
		sc.close();
	}

}
