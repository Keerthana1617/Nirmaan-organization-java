package keerthanacorejava;
import java.util.Scanner;
public class Loops {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks:");
		int mark=sc.nextInt();
	    if(mark>=35)
	    {
			if(mark>=90)
			{
				System.out.println("Grade A");
			}
			else if(mark>=70)
			{
				System.out.println("Grade B");
			}
			else if(mark>=50)
			{
				System.out.println("Grade c");
				
			}
		}
	    else
	    {
	    	System.out.println("Fail");
	    }
		
	}

}
