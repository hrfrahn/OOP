class BaseballPlayer{
	static int numPlayers = 0;
	private int number; 
	private double age, salary;
	private String position; 
	private boolean injured;
	// stores all players created
	static BaseballPlayer [] team = new BaseballPlayer[25];
	//default/no-arg constructor
	public BaseballPlayer(){
		numPlayers++;
		number = 0;
		age = 0; salary = 0;
		position = "<default>";
		injured= false;
		team[numPlayers-1] = this; 
	}
	//normal constructor
	public BaseballPlayer(int num, double age1, double sal, String pos, boolean inj){
		numPlayers++;
		number = num;
		age = age1; salary = sal;
		position = pos;
		injured = inj;
		team[numPlayers-1] = this;
	}
	// gets total salary of the team
	public double totalSalary(){
		double total = 0;
		for(int i = 0; i < numPlayers; i++){
			total += team[i].salary;
		}
		return total;
	}
	// how many players on the team are injured?
	public int injuries(){
		int total = 0;
		for(int i = 0; i < numPlayers; i++){
			if(team[i].injured)
			total++;
		}
		return total;
	}
	public String toShortString(){
		String str = "";
		str += "Number: " + number+"\n";
		str += "Age: " + (int)age+"\n";
		double roundedSalary = Math.round(salary * 100.0) / 100.0;
		str += "Salary: $" + roundedSalary+"\n";
		return str;
	}
	@Override
	public String toString(){
		String str = "";
		str += "Number: " + number+"\n";
		str += "Age: " + (int)age+"\n";
		double roundedSalary = Math.round(salary * 100.0) / 100.0;
		str += "Salary: $" + roundedSalary+"\n";
		str += "Position: "+position+"\n";
		str += "Injured: "+injured+"\n";
		return str;
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