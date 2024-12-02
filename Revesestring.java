package Day9;

import java.util.Scanner;

public class Revesestring {
	public static void main(String args[]) {
//		String name ="Keerthana";
//		for(int i=5;i>=0;i--) {
//			System.out.println(i);
//		}
		
		
		
		
//		System.out.println(name.charAt(8));
//		System.out.println(name.charAt(7));
//		System.out.println(name.charAt(6));
//		System.out.println(name.charAt(5));
//		System.out.println(name.charAt(4));
//		System.out.println(name.charAt(3));
//		System.out.println(name.charAt(2));
//		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(0));
//		for(int i=8;i>=0;i--) {
//		System.out.println(i);
//		}
//		
//		for(int i=5;i>=0;i--) {
//	 		System.out.println(name.charAt(i));
//		}
// 		System.out.println(name.length()-1);
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String name = sc.nextLine();
		
		for(int i= name.length()-1; i>=0;i--) {
			System.out.print(name.charAt(i));
		}

		
	}

}
