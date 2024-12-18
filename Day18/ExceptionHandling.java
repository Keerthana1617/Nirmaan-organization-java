package Day18;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Value");
		int a=sc.nextInt();
		System.out.println("Enter B Value");
		int b=sc.nextInt();
		int c=a/b;
		try {
			System.out.println(c);
}
		       catch (Exception e)
		       {
		    	   System.out.println("Zero");
		       }
		
	}

}
