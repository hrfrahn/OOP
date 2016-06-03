class ReliefPitcher extends Pitcher{
	private int holds, saves, blownSaves;
	public ReliefPitcher(){
		this(0,0,0,"<default>",false,0,0,0,0,0,0,0,0,0,0);
	}
	public ReliefPitcher(int holds, int saves, int bSaves){
		this(0,0,0,"<default>",false,0,0,0,0,0,0,0,holds,saves,bSaves);
	}
	public ReliefPitcher(int IP, int hits, int walks, int runs, int wins, int losses, int GP, int holds, int saves, int bSaves){
		this(0,0,0,"<default>",false,IP,hits,walks,runs,wins,losses,GP,holds,saves,bSaves);
	}
	public ReliefPitcher(int num, double age, double sal, String pos, boolean inj, int IP, int hits, int walks, int runs, int wins, int losses, int GP, int holds, int saves, int bSaves){
		super(num, age, sal, pos, inj, IP, hits, walks, runs, wins, losses, GP);
		this.setHolds(holds); 
		this.setSaves(saves);
		this.setBlownSaves(bSaves);
	}
	@Override
	public String toString(){
		String str = super.toString();
		str += "Holds: "+holds+"\n";
		str += "Saves: "+saves+"\n";
		str += "Blown Saves: "+blownSaves+"\n";
		return str;
	}
	public int getHolds() {
		return holds;
	}
	public void setHolds(int holds) {
		this.holds = holds;
	}
	public int getSaves() {
		return saves;
	}
	public void setSaves(int saves) {
		this.saves = saves;
	}
	public int getBlownSaves() {
		return blownSaves;
	}
	public void setBlownSaves(int blownSaves) {
		this.blownSaves = blownSaves;
	}
}