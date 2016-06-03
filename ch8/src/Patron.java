class Patron{
	String name;
	Book [] books =  new Book[3];
	//default constructor 
	public Patron(){
		name = "<default>";
		for(int i = 0; i < 3; i++){
			books[i] = new Book();
		}
	}
	//normal constructor
	public Patron(String name, Book [] bk){
		this.name = name;
		if(bk.length<=3){
			for(int i = 0; i < bk.length; i++){
				books[i] = new Book(bk[i].getAuthor(), bk[i].getTitle(), bk[i].isCheckedOut());
			}
		}
		else{
			this.name = name;
			for(int i = 0; i < 3; i++){
				books[i] = new Book(bk[i].getAuthor(), bk[i].getTitle(), bk[i].isCheckedOut());
			}
		}
	}
	public Patron(String name){
		this.name = name;
		for(int i = 0; i < 3; i++){
			books[i] = new Book();
		}
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBook(int i) {
		return books[i];
	}

	public void setBook(Book bk, int i) {
		this.books[i] = bk;
	}
}