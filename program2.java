import java.io.*;
import java.util.Scanner;
public class program2 
{
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the two numbers to add:-");
	  int n1= sc.nextInt();
	  int n2= sc.nextInt();
	  System.out.println("SUM IS :- "+(n1+n2));
	  sc.close();
  }
}
