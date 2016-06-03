/* Harrison Frahn
 * Period 2 - Object Oriented Programming
 * Mr. Friedland
 * Chapter 8.1
 * 4/20/16
 */
 // this is the driver class for BaseballPlayer
import java.util.Scanner;
public class ch8_1{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		BaseballPlayer p1 = new BaseballPlayer();
		//initialize players to default values
		for(int i = 0; i < 24; i++){
			BaseballPlayer.team[i] = new BaseballPlayer();
		}
		//get values for all the baseball players
		int i; 
		for(i = 0; i < 24; i++){
			System.out.print("Enter the number of player "+(i+1)+"(negative to quit):");
			int num = input.nextInt();
			if(num<0){break;}
			while((num/10)>9){
				System.out.print("That number is too big! Enter the number of player "+(i+1)+": ");
				num = input.nextInt();
			}
			for(int x = 0; x < 24; x++){
				while(BaseballPlayer.team[x].getNumber()==num){
					System.out.print("That number is already taken! Enter the number of player "+(i+1)+": ");
					num = input.nextInt();
				}
			}
			BaseballPlayer.team[i].setNumber(num);
			System.out.print("Enter the age of player "+(i+1)+":");
			double age = input.nextDouble();
			BaseballPlayer.team[i].setAge(age);
			System.out.print("Enter the salary of player "+(i+1)+":");
			double sal = input.nextDouble();
			BaseballPlayer.team[i].setSalary(sal);
			System.out.print("Enter the position of player "+(i+1)+":");
			String pos = input.next();
			while(!(pos.equals("P")||pos.equals("C")||pos.equals("1B")||pos.equals("2B")||pos.equals("3B")||pos.equals("SS")||pos.equals("OF")||pos.equals("RP"))){
				System.out.print("You didn't enter a valid position! Enter the position of player "+(i+1)+":");
				pos = input.next();
				BaseballPlayer.team[i].setPosition(pos);
			}
			BaseballPlayer.team[i].setPosition(pos);
			System.out.print("Is player "+(i+1)+" injured?(true/false):");
			boolean inj = input.nextBoolean();
			BaseballPlayer.team[i].setInjured(inj);
		}
		String cont = "";
		while(!(cont.equals("q"))){
			System.out.println("\nEnter 'player' to view the data of a player.");
			System.out.println("Enter 'salary' to see the total salary of the whole team.");
			System.out.println("Enter 'injuries' to see the number of injured players on the team.");
			System.out.println("Enter 'q' to quit");
			cont = input.next();
			if(cont.equals("player")){
				System.out.print("Which player do you want to view?: ");
				int p = input.nextInt();
				if(p>i){
					System.out.println("\nSorry, there are only "+i+" players on the team.");
				}
				else{
					System.out.println("\nPlayer "+p);
					System.out.println("Number: "+BaseballPlayer.team[p-1].getNumber());
					System.out.println("Age: "+BaseballPlayer.team[p-1].getAge()+" years old");
					System.out.println("Salary: $"+BaseballPlayer.team[p-1].getSalary());
					System.out.println("Position: "+BaseballPlayer.team[p-1].getPosition());
					System.out.println("Injured: "+BaseballPlayer.team[p-1].isInjured());
				}
			}
			else if(cont.equals("salary")){
				System.out.println("Total team salary: $"+(BaseballPlayer.team[0].totalSalary()/1000000)+" million.");
			}
			else if(cont.equals("injuries")){
				System.out.println("Total number of injuries: "+BaseballPlayer.team[0].injuries());
			}
		}
		input.close();
	}
}