import java.io.*;
import java.util.Scanner;
public class program10
{
  public static void main(String[] args)
  {
	  program10 obj=new program10();
	  obj.armstrong();
  }
   void armstrong()
  {
	  int num,digit,rev,i,sum=0;
	  System.out.println("Enter the number:-");
	  Scanner sc=new Scanner(System.in);
	  num=sc.nextInt();
	  for(i=num;i>0;i=i/10)
	  {
		  digit=i%10;
		  sum=sum+(digit*digit*digit);
	  }
	  if(sum==num)
		  System.out.println("The number is ARMSTRONG");
	  else
		  System.out.println("The number is not ARMSTRONG");
	  sc.close();
  }  
}
