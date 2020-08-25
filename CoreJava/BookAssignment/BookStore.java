
public class BookStore {
	Book[] getBooks() {
		Book[] books = new Book[5];
		books[0] = new Book(98663567,"Book1","P1","A1");
		books[1] = new Book(9654567,"Book2","P2","A2");
		books[2] = new Book(1248567,"Book3","P3","A3");
		books[3] = new Book(35798567,"Book4","P4","A4");
		books[4] = new Book(21356787,"Book5","P5","A5");
		return books;
	}
	Book findBookById(Book[] books,long ID) {
		for(Book book : books) {
			if(book.getIsbn()==ID) {
				return book;
			}
			else {
				System.out.println("Sorry, Book not found!!");
			}
		}
		return new Book();
	}
	Book updateBook(Book[] books, long ID, double price) {
		for(Book book : books) {
			if(book.getIsbn() == ID) {
				book.setPrice(price);
				return book;
			}
		}
		return new Book();
	}
}
