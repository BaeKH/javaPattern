package Iterator;

public class TestMain {
	public static void main(String[]ar){
		BookShelf bookShelf = new BookShelf(4);
		
		bookShelf.appendBook(new Book("test1"));
		bookShelf.appendBook(new Book("test2"));
		bookShelf.appendBook(new Book("test3"));
		bookShelf.appendBook(new Book("test4"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
