import java.io.*;
import java.util.Scanner;

public class program4 
{
  public static void main(String[] args)
  {
	  program4 obj=new program4();
	  obj.prime();
  }
  
  void prime()
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :-");
	int n;
	n = sc.nextInt();
    int flag=0;
    for(int i=2;i<=n/2;i++)
    {
    	if(n%i==0)
    	{
    		flag=1;
    		break;
    	}	
    	
    }

    if(flag==0)
		System.out.println("The number is Prime.");
	else 
		System.out.println("The number is not Prime.");			
	  sc.close();
  }	  
	  
}
				