import java.io.*;
import java.util.Scanner;
public class program6
{
  public static void main(String[] args)
  {
	  program6 obj= new program6();
	  obj.find_factor();
  }
  
 
  void find_factor()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number:-");
	  int n;
	  n=sc.nextInt();
	  System.out.println("The factors of the number are :-");
	  for(int i=1;i<=n/2;i++)
	  {
		  if(n%i==0)
		  System.out.println(i);
	  }
	  sc.close();
  }
  
 }
