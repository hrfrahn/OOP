import java.util.Random;
public class ch11_4{
	public static void main(String [] args){
		System.out.println("This program generates baseball players with random salary, number, and age, sorts them according to their salary, and then prints them.");
		Random r = new Random();
		for(int i = 0; i < 25; i++){
			double num = 500000+Math.random()*(9500001);
			int age = (int)(20+Math.random()*(31));
			BaseballPlayer bp = new BaseballPlayer(r.nextInt(100), age, num, "c", false);
		}
		System.out.println("The salary of every player on the team, in ascending order: ");
		//testSalaries(BaseballPlayer.team);
		printSalaries(BaseballPlayer.team);
	}
	public static void printSalaries(BaseballPlayer [] bp){
		boolean sorted = false;
		while(!sorted){
			sorted = true;
			for(int i = 0; i < 24; i++){
				if(bp[i].getSalary()>bp[i+1].getSalary()){
					sorted = false;
					BaseballPlayer temp = bp[i];
					bp[i] = bp[i+1];
					bp[i+1] = temp;
				}
			}
		}
		for(int i= 0; i < 25; i++){
			System.out.println("Player "+(i+1)+": \n"+bp[i].toShortString());
		}
	}
}