
public class BookStoreMethods {
	public static void main(String[] args) {
		BookStore bookstore = new BookStore();
		Book[] books = bookstore.getBooks();
		for (Book book : books) {
			book.display();
			System.out.println("-------------------------");
		}
		Book findbook = bookstore.findBookById(books, 1248567);
		if (findbook.getName() == null) {
			System.out.println("Sorry, Book not found!!");
		} else {
			System.out.println("Name of book is : " + findbook.getName());
		}
		Book updateprice = bookstore.updateBook(books, 1248567, 600);
		if (updateprice.getName() == null) {
			System.out.println("Sorry, Book not found!!");
		} else {
			System.out
					.println("Name of book is : " + findbook.getName() + "\nNew price is : " + updateprice.getPrice());
		}
	}
}
