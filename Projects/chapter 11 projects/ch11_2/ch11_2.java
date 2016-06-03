import java.util.Scanner;
public class ch11_2{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("This program is the driver class for a version of BaseballPlayer that uses an ArrayList.");
		System.out.println("There is a maximum of 13 position players, 13 pitchers, and 25 players in total.");
		for(int i = 0; i < 25; i++){
			System.out.println("Enter the position of player "+(i+1)+" (0 to quit): ");
			String pos = input.next();
			if(pos.equals("0")){ break;}
			if(pos.contains("P")||pos.contains("p")){
				if(BaseballPlayer.numPitchers()<13){
					BaseballPlayer bp = new BaseballPlayer(0,0,0,"P",false);
				}
				else{
					System.out.println("There are already 13 pitchers on the team!");
					i--;
				}
			}
			else{
				if(BaseballPlayer.numPositionPlayers()<13){
					BaseballPlayer bp = new BaseballPlayer(0,0,0,"C",false);
				}
				else{
					System.out.println("There are already 13 position players on the team!");
					i--;
				}
			}
		}
		System.out.println("Number of pitchers: "+BaseballPlayer.numPitchers());
		System.out.println("Number of position players: "+BaseballPlayer.numPositionPlayers());
	}
}