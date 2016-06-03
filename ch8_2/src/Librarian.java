import java.util.Scanner;
class Librarian{
	static Book [] allBooks = new Book[20];
	static Patron [] patrons = new Patron[1000];
	static String [] titles = {"The Shining", "Harry Potter and the Sorceror's Stone", "The Great Gatsby", "Romeo and Juliet", "1984", "The Grapes of Wrath", "Catch-22", "The Catcher in the Rye", "To Kill A Mockingbird", "The Lord of the Rings", "Brave New World", "Gone with the Wind", "On the Road", "Of Mice and Men", "Little Brother", "Lord of the Flies", "Animal Farm", "The Chronicles of Narnia", "War and Peace", "Moby Dick"};
	static String [] authors = {"Stephen King", "J.K. Rowling", "F. Scott Fitzgerald", "William Shakespeare", "George Orwell", "John Steinbeck", "Joseph Heller", "J.D. Salinger", "Harper Lee","J.R.R Tolkein", "Aldous Huxley", "Margaret Mitchell", "Jack Kerouac", "John Steinbeck", "Cory Doctorow", "William Golding", "George Orwell", "C.S. Lewis", "Leo Tolstoy", "Herman Melville"};
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Generating book titles and authors...");
		for(int i = 0; i < 20; i++){
			allBooks[i] = new Book(authors[i], titles[i], false);
		}
		printBooks();
		System.out.print("Enter the number of patrons at the library: ");
		int pats = input.nextInt();
		for(int i = 0; i < pats; i++){
			System.out.print("Enter the name of Patron "+(i+1)+": ");
			String name = input.next();
			System.out.print("Enter the book number of the first book that the Patron checked out(negative if no books): ");
			int b1 = input.nextInt();
			Book [] books = new Book[3];
			for(int j = 0; j < 3; j++){
				books[j] = new Book();
			}
			if(b1>0){
				while(allBooks[b1-1].isCheckedOut()==true){
					System.out.println("That book is already checked out!");
					System.out.print("Enter the book number of the first book that the Patron checked out: ");
					b1 = input.nextInt();
				}
				books[0] =  allBooks[b1-1];
				books[0].setCheckedOut(true);
				System.out.print("Enter the book number of the second book that the Patron checked out(negative if no more books): ");
				int b2 = input.nextInt();
				if(b2>0){
					while(allBooks[b2-1].isCheckedOut()==true){
						System.out.println("That book is already checked out!");
						System.out.print("Enter the book number of the second book that the Patron checked out: ");
						b2 = input.nextInt();
					}
					books[1] =  allBooks[b2-1];
					books[1].setCheckedOut(true);
					System.out.print("Enter the book number of the third book that the Patron checked out(negative if no more books): ");
					int b3 = input.nextInt();
					if(b3>0){
						while(allBooks[b3-1].isCheckedOut()==true){
							System.out.println("That book is already checked out!");
							System.out.print("Enter the book number of the third book that the Patron checked out: ");
							b3 = input.nextInt();
						}
						books[2] =  allBooks[b3-1];
						books[2].setCheckedOut(true);
						patrons[i] = new Patron(name, books);
					}
					else{
						patrons[i] = new Patron(name, books);
					}
				}
				else{
					patrons[i] = new Patron(name, books);
				}
			}
			else{	
				patrons[i] = new Patron(name);
			}
		}
		String cont = "";
		while(!(cont.equals("q"))){
			System.out.println("\nEnter 'patrons' to see all patrons in the database.");
			System.out.println("Enter 'books' to see all books in the database.");
			System.out.println("Enter 'checkin' to check a book back into the database.");
			System.out.println("Enter 'q' to quit.");
			cont = input.next();
			if(cont.equals("patrons")){
				printPatrons(pats);
			}
			if(cont.equals("books")){
				printBooks();
			}
			if(cont.equals("checkin")){
				System.out.print("Which book do you wish to check back in? Enter the book number: ");
				int which = input.nextInt();
				allBooks[which-1].setCheckedOut(false);
			}
		}
		input.close();
	}
	public static void printPatrons(int pats){
		for(int i = 0; i < pats; i++){
			System.out.println("\nPatron "+(i+1));
			System.out.println("Name: "+patrons[i].getName());
			System.out.println("Checked out books: ");
			for(int x = 0; x < 3; x++){
				int j  = 0;
				if((!(patrons[i].getBook(x).getTitle().equals("<default>")))&&patrons[i].getBook(x).isCheckedOut()==true){
					for(j = 0; j < 20; j++){
						if((patrons[i].getBook(x).getTitle()==allBooks[j].getTitle())&&allBooks[j].isCheckedOut()==false){
							break;
						}
					}
					if(j==20)
					System.out.println(patrons[i].getBook(x).getTitle()+" by "+patrons[i].getBook(x).getAuthor());
				}		
			}
		}
	}
	public static void printBooks(){
		for(int i = 0; i < 20; i++){
			System.out.println("\nBook "+(i+1));
			System.out.println("Title: "+allBooks[i].getTitle());
			System.out.println("Author: "+allBooks[i].getAuthor());
			System.out.println("Checked out: "+allBooks[i].isCheckedOut());
		}
	}
}