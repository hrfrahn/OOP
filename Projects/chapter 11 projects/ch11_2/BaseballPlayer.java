import java.util.ArrayList;
// this is a version of BaseballPlayer that makes use of an ArrayList to store all players created.
class BaseballPlayer{
	static int numPlayers = 0;
	private int number; 
	private double age, salary;
	private String position; 
	private boolean injured;
	// stores all players created
	static ArrayList<BaseballPlayer> team = new ArrayList();
	//default/no-arg constructor
	public BaseballPlayer(){
		numPlayers++;
		number = 0;
		age = 0; salary = 0;
		position = "<default>";
		injured= false;
		team.add(this);
	}
	//normal constructor
	public BaseballPlayer(int num, double age1, double sal, String pos, boolean inj){
		numPlayers++;
		number = num;
		age = age1; salary = sal;
		position = pos;
		injured = inj;
		team.add(this);
	}
	// gets total salary of the team
	public double totalSalary(){
		double total = 0;
		for(int i = 0; i < numPlayers; i++){
			total += team.get(i).salary;
		}
		return total;
	}
	// how many players on the team are injured?
	public int injuries(){
		int total = 0;
		for(int i = 0; i < numPlayers; i++){
			if(team.get(i).injured)
			total++;
		}
		return total;
	}
	// get the number of pitchers and position players on the team
	public static int numPitchers(){
		int total = 0;
		for(int i = 0; i < team.size(); i++){
			if(team.get(i).position.indexOf("P")!=-1){
				total++;
			}
		}
		return total;
	}
	public static int numPositionPlayers(){
		return team.size()-numPitchers();
	}
	// accessors
	int getNumber(){
		return number;
	}
	double getAge(){
		return age;
	}
	double getSalary(){
		return salary;
	}
	String getPosition(){
		return position;
	}
	boolean isInjured(){
		return injured;
	}
	public int getNumPlayers(){
		return numPlayers;
	}
	//mutators
	void setNumber(int num){
		number = num;
	}
	void setAge(double a){
		age = a;
	}
	void setSalary(double sal){
		salary = sal;
	}
	void setPosition(String pos){
		position = pos;
	}
	void setInjured(boolean i){
		injured = i;
	}
}