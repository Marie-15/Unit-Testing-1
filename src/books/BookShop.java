package books;

public class BookShop {
	
	private BookShop [] books = new BookShop[20];
	
	public BookShop newBook() {
		String bookName = null;
		double price = 0;
		int i;
		
		return new BookShop();
	}
	
	public void addBook(Catalog catalog) {
		for (int x=0;x<books.length;x++) {
			if (books[x]==null) {
				books[x]=newBook();
				x=books.length;
			}
		}
	}
	
	public Double getTotal() {
		double price=0;
		while (books.length>0) {
			int CountBookDiff=0;
			System.out.println("");
			if(CountBookDiff == 1) {
				price=8;
			} else if (CountBookDiff == 2) {
				price=14.8;
			} else if (CountBookDiff == 3) {
				price=20.64;
			} else if (CountBookDiff == 4) {
				price=23.04;
			} else {
				price=26;
			}
		}
		return price;
	}
}