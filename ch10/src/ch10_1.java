import java.util.Scanner;
public class ch10_1{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		BankAccount [] accounts = new BankAccount[5];
		for(int i = 0; i < 5; i++){
			System.out.print("Enter the name of account "+(i+1)+": ");
			String name = input.next();
			accounts[i] = new BankAccount(name);
		}
		String cont = "";
		System.out.println("Enter an account number: ");
		int which = input.nextInt();
		while(which>5){
			System.out.println("That account doesn't exist!");
			System.out.println("Enter an account number: ");
			which = input.nextInt();
		}
		while(!(cont.equals("q"))){
			if(cont.equals("s")){
				System.out.println("Enter an account number: ");
				which = input.nextInt();
				while(which>5){
					System.out.println("That account doesn't exist!");
					System.out.println("Enter an account number: ");
					which = input.nextInt();
				}
			}
			System.out.println("Enter 'b' to check the balance of the account.");
			System.out.println("Enter 'w' to make a withdrawl from the account.");
			System.out.println("Enter 'd' to make a deposit into the account.");
			System.out.println("Enter 's' to switch accounts.");
			System.out.println("Enter 'q' to exit.");
			cont = input.next();
			if(cont.equals("b")){
				System.out.println("Checking balance of account "+which+": $"+accounts[which-1].getCheckingBalance());
				System.out.println("Savings balance of account "+which+": $"+accounts[which-1].getSavingsBalance());
			}
			else if(cont.equals("w")){
				System.out.print("Withdraw from Savings or Checking?(s/c): ");
				String savOrCheck = input.next();
				if(savOrCheck.equals("s")){
					System.out.print("Withdraw how much from the savings account of account "+(which)+"?: ");
					int amount = input.nextInt();
					if(accounts[which-1].getSavingsBalance()-amount>=0){
						accounts[which-1].setSavingsBalance(accounts[which-1].getSavingsBalance()-amount);
						System.out.println("$"+amount+" withdrawn from the savings account of account #"+which+"!");
						System.out.println("The balance of the savings account of account #"+which+" is now $"+accounts[which-1].getSavingsBalance());
					}
					else{
						System.out.println("You don't have enough money in your account to do that!");
					}
				}
				else if(savOrCheck.equals("c")){
					System.out.print("Withdraw how much from the checking account of account "+(which)+"?: ");
					int amount = input.nextInt();
					if(accounts[which-1].getCheckingBalance()-amount>=0){
						accounts[which-1].setCheckingBalance(accounts[which-1].getCheckingBalance()-amount);
						System.out.println("$"+amount+" withdrawn from the checking account of account #"+which+"!");
						System.out.println("The balance of the checking account of account #"+which+" is now $"+accounts[which-1].getCheckingBalance());
					}
					else{
						System.out.println("You don't have enough money in your account to do that!");
					}
				}
			}
			else if(cont.equals("d")){
				System.out.print("Deposit into Savings or Checking?(s/c): ");
				String savOrCheck = input.next();
				if(savOrCheck.equals("s")){
					System.out.print("Deposit how much into the savings account of account "+(which)+"?: ");
					int amount = input.nextInt();
					accounts[which-1].setSavingsBalance(accounts[which-1].getSavingsBalance()+amount);
					System.out.println("$"+amount+" deposited into the savings account of account #"+which+"!");
					System.out.println("The balance of the savings account of account #"+which+" is now $"+accounts[which-1].getSavingsBalance());
				}
				else if(savOrCheck.equals("c")){
					System.out.print("Deposit how much into the checking account of account "+(which)+"?: ");
					int amount = input.nextInt();
					accounts[which-1].setCheckingBalance(accounts[which-1].getCheckingBalance()+amount);
					System.out.println("$"+amount+" deposited into the checking account of account #"+which+"!");
					System.out.println("The balance of the checking account of account #"+which+" is now $"+accounts[which-1].getCheckingBalance());
				}
			}
		}
	}
}