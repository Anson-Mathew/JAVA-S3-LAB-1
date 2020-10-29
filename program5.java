import java.io.*;
import java.util.Scanner;

public class program5 
{
	public static void main(String[] args)
	{
		program5 obj=new program5();
		obj.Sum_of_n();
	}
	
	void Sum_of_n()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n=sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		System.out.println("SUM of n numbers :-"+sum);
		sc.close();
		
	}

}
