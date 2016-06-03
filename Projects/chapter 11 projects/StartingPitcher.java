class StartingPitcher extends Pitcher{
	private int completeGames, qualityStarts;
	public StartingPitcher(){
		this(0,0,0,"<default>",false,0,0,0,0,0,0,0,0,0);

	}
	public StartingPitcher(int completeGames, int qualityStarts){
		this(0,0,0,"<default>",false,0,0,0,0,0,0,0, completeGames, qualityStarts);
	}
	public StartingPitcher(int IP, int hits, int walks, int runs, int wins, int losses, int GP, int completeGames, int qualityStarts){
		this(0,0,0,"<default>",false,IP,hits,walks,runs,wins,losses,GP, completeGames, qualityStarts);
	}
	public StartingPitcher(int num, double age, double sal, String pos, boolean inj, int IP, int hits, int walks, int runs, int wins, int losses, int GP, int CG, int QS){
		super(num, age, sal, pos, inj, IP, hits, walks, runs, wins, losses, GP);
		this.setCompleteGames(CG);
		this.setQualityStarts(QS);
	}
	@Override
	public String toString(){
		String str = super.toString();
		str += "Complete Games: "+completeGames+"\n";
		str += "Quality Starts: "+qualityStarts+"\n";
		return str;
	}
	public int getCompleteGames() {
		return completeGames;
	}
	public void setCompleteGames(int completeGames) {
		this.completeGames = completeGames;
	}
	public int getQualityStarts() {
		return qualityStarts;
	}
	public void setQualityStarts(int qualityStarts) {
		this.qualityStarts = qualityStarts;
	}
}