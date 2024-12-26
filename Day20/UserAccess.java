package Day20;
import java.util.ArrayList;
import java.util.Scanner;
public class UserAccess {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Book book = new Book();
		ArrayList<Book> al= new ArrayList<>();
		boolean isTrue = true;
		while(isTrue) {
			
		System.out.println("Enter the Choice:");
		System.out.println("Enter 1 for Add:");
		System.out.println("Enter 2 for Show:");
		System.out.println("Enter 3 for Update:");
		System.out.println("Enter 0 for Exit:");
		int key=sc.nextInt();
		
		sc.nextLine();
		
		if(key==1) {
			System.out.println("Enter the Book name:");
			String name = sc.nextLine();
			System.out.println("Enter the BookAuthor:");
			String author = sc.nextLine();
			System.out.println("Enter the BookPrice:");
			double price = sc.nextDouble();
			System.out.println("Enter the number of copies:");
			int copies = sc.nextInt();
			al.add(book = new Book(name, author, price, copies));
		}
		
		else if(key==2){
			System.out.println(al);
			
		}
		else if(key==3) {
			System.out.println("Enter the Book name:");
			String name = sc.nextLine();
			for(Book book1:al) {
				if(name.equalsIgnoreCase(book1.getBookName()));
				System.out.println("Rename the Book Name:");
				String name1 = sc.nextLine();
				book1.setBookName(name);
				System.out.println("Enter the BookAuthor");
				String author = sc.nextLine();
				book1.setBookAuthor(author);
				System.out.println("Enter the BookPrice");
				double price = sc.nextDouble();
				book1.setBookPrice(price);
				System.out.println("Enter the number of copies");
				int copies = sc.nextInt();
				book1.setNoofcopies(copies);
				break;
				
			}
		}
		else if(key==0){

			isTrue=false;
			System.out.println("Thank you!");
		}
		else {
			isTrue=false;
			System.out.println("Enter your correct Choice:");
			break;
			
	
		
		
		
		
	
		
		
	}

}
		sc.close();
}
}
