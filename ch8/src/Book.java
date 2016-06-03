class Book{
	private String author, title;
	boolean checkedOut;
	//default constructor
	public Book(){
		author = "<default>";
		title = "<default>";
		checkedOut = false;
	}
	//normal constructor
	public Book(String author, String title, boolean checked){
		this.author = author;
		this.title = title;
		checkedOut = checked;
	}
	
	//getters and setters
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
	public boolean isCheckedOut(){
		return checkedOut;
	}
	public void setCheckedOut(boolean b){
		this.checkedOut = b;
	}
}