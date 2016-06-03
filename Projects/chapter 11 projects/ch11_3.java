import java.util.Random;
public class ch11_3{
	public static void main(String [] args){
		System.out.println("This program generates baseball players with random numbers, salary, and age, sorts them according to their number, and then prints them.");
		Random r = new Random();
		for(int i = 0; i < 25; i++){
			int num = r.nextInt(100);
			double sal = 500000+Math.random()*(9500001);
			int age = (int)(20+Math.random()*(31));
			BaseballPlayer bp = new BaseballPlayer(num, age, sal, "c", false);
		}
		System.out.println("The number of every player on the team, in ascending order: ");
		printNumbers(BaseballPlayer.team);
	}
	public static void printNumbers(BaseballPlayer [] bp){
		boolean sorted = false;
		while(!sorted){
			sorted = true;
			for(int i = 0; i < 24; i++){
				if(bp[i].getNumber()>bp[i+1].getNumber()){
					sorted = false;
					BaseballPlayer temp = bp[i];
					bp[i] = bp[i+1];
					bp[i+1] = temp;
				}
			}
		}
		for(int i= 0; i < 25; i++){
			System.out.println("Player "+(i+1)+": \n"+bp[i].toString());
		}
	}
}