	package Day20;

	public class Book {
	
		private String BookName;
		private String BookAuthor;
		private double BookPrice;
		private int noofcopies;
		public String getBookName() {
			return BookName;
		}
		public void setBookName(String bookName) {
			BookName = bookName;
		}
		public String getBookAuthor() {
			return BookAuthor;
		}
		public void setBookAuthor(String bookAuthor) {
			BookAuthor = bookAuthor;
		}
		public String getBookPrice() {
			return BookPrice;
		}
		public void setBookPrice(double bookPrice) {
			BookPrice = bookPrice;
		}
		public int getNoofcopies() {
			return noofcopies;
		}
		public void setNoofcopies(int noofcopies) {
			this.noofcopies = noofcopies;
		}
		@Override
		public String toString() {
			return "Book [BookName=" + BookName + ", BookAuthor=" + BookAuthor + ", BookPrice=" + BookPrice
					+ ", noofcopies=" + noofcopies + "]";
		}
		public Book(String bookName, String bookAuthor, double bookPrice, int noofcopies) {
			super();
			BookName = bookName;
			BookAuthor = bookAuthor;
			BookPrice = bookPrice;
			this.noofcopies = noofcopies;
		}
		public Book() {
			super();
		}
		
	}


