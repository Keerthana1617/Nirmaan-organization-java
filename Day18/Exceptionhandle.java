package Day18;

import java.util.Scanner;

public class Exceptionhandle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Value");
		int a=sc.nextInt();
		
		System.out.println("Enter B Value");
		int b=sc.nextInt();
		int c=0;
		try {
		c=a/b;
		
		}catch(Exception e) {
		   System.out.println(e);
		}
		System.out.println(c);
		sc.close();
		
	
	
	
	
	}
 
}



