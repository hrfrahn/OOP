import java.util.Random;
public class ch11_1{
	public static void main(String [] args){
		Random r = new Random();
		System.out.println("This program demonstrates the use of the BaseballPlayer class and its various subclasses by generating players with random stats. \nThe stats may be a little weird, because of the random number generation.");
		int num = r.nextInt(100);
		String [] pos = {"P", "C", "1B", "2B", "3B", "SS", "OF", "RP"};
		double sal = 500000+Math.random()*(9500001);
		int age = (int)(20+Math.random()*(26));
		//randomly generate a generic BaseballPlayer and print its stats
		BaseballPlayer bp = new BaseballPlayer(r.nextInt(100), (int)(20+Math.random()*(26)), 500000+Math.random()*(9500001), pos[r.nextInt(7)], r.nextBoolean());
		System.out.println("Generic Baseball Player: \n"+bp.toString());
		//randomly generate a PositionPlayer and print it
		PositionPlayer pp = new PositionPlayer(r.nextInt(100), (int)(20+Math.random()*(26)), 500000+Math.random()*(9500001), pos[r.nextInt(7)], r.nextBoolean(), (int)(100+Math.random()*(63)), (int)(500+Math.random()*151), (int) (150+Math.random()*101), (int)(50+Math.random()*99), (int)(50+Math.random()+71), (int)(20+Math.random()+26), r.nextInt(15), (int)(15+Math.random()+36), r.nextInt(20));
		while(pp.getPosition().contains("P")){
			pp.setPosition(pos[r.nextInt(7)]);
		}
		System.out.println("Position Player: \n"+pp.toString());
		//randomly generate a generic pitcher and print it
		Pitcher p = new Pitcher(r.nextInt(100), (20+Math.random()*(26)), 500000+Math.random()*(9500001), pos[r.nextInt(7)], r.nextBoolean(), (int)(150+Math.random()*80), (int)(160+Math.random()*80), (int)(35+Math.random()*30), (int)(60+Math.random()*40), (int)(5+Math.random()*15), (int)(5+Math.random()*10), (int)(20+Math.random()*32));
		while(!(p.getPosition().contains("P"))){
			p.setPosition(pos[r.nextInt(7)]);
		}
		System.out.println("Generic Pitcher:\n"+p.toString());
		// randomly Generate a Relief pitcher and print it
		ReliefPitcher rp = new ReliefPitcher(r.nextInt(100), (20+Math.random()*(26)), 500000+Math.random()*(9500001), "RP", r.nextBoolean(), (int)(50+Math.random()*25), (int)(30+Math.random()*40), (int)(15+Math.random()*15), (int)(15+Math.random()*10), r.nextInt(5), r.nextInt(5), (int)(50+Math.random()*75), (int)(5+Math.random()*20), r.nextInt(40), r.nextInt(7));
		System.out.println("Relief Pitcher:\n"+rp.toString());
		// randomly Generate a starting pitcher and print it
		StartingPitcher sp = new StartingPitcher(r.nextInt(100), (20+Math.random()*(26)), 500000+Math.random()*(9500001), "P", r.nextBoolean(), (int)(150+Math.random()*80), (int)(160+Math.random()*80), (int)(35+Math.random()*30), (int)(60+Math.random()*40), (int)(5+Math.random()*15), (int)(5+Math.random()*10), (int)(20+Math.random()*32), r.nextInt(4), (int)(10+Math.random()*17));
		System.out.println("Starting Pitcher:\n"+sp.toString());
	}
}