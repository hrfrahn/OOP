import java.util.Random;

class BankAccount{
	private String name; 
	private int id; 
	private double savingsBalance;
	private double checkingBalance;
	//no-arg constructor
	public BankAccount(){
		name = "<default>";
		id = 0;
		savingsBalance = 0;
		checkingBalance = 0;
	}
	//normal constructor
	public BankAccount(String name){
		this.name = name;
		Random r1 = new Random();
		id = r1.nextInt(1000000);
		savingsBalance = 0;
		checkingBalance = 100;
	}
	//getters and setters
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public double getSavingsBalance(){
		return savingsBalance;
	}
	public double getCheckingBalance(){
		return checkingBalance;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setSavingsBalance(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}
	public void setCheckingBalance(double checkingBalance){
		this.checkingBalance = checkingBalance;
	}

}