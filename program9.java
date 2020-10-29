import java.io.*;
import java.util.Scanner;
public class program9
{
  public static void main(String[] args)
  {
	  program9 obj=new program9();
	  obj.Palindrome();
  }
  
  void Palindrome()
  {
	  Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int copy = num;
		int rev=0,rem;
		while(num>0) {
			rem = num % 10;
			rev = (rev*10) + rem;
			num = num / 10;	
		}
		if(rev==copy)
			System.out.println("The given number is Palindrome");
		else
			System.out.println("The given number is not a Palindrome");
		sc.close();
  }
}
