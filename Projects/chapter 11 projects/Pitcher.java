import java.math.BigDecimal;
class Pitcher extends BaseballPlayer{
	private int inningsPitched, hitsAllowed, walksAllowed, runsAllowed, wins, losses, gamesPlayed;
	public Pitcher(){
		this(0,0,0,"<default>", false, 0,0,0,0,0,0,0);
	}
	public Pitcher(int IP, int hits, int walks, int runs, int wins, int losses, int GP){
		this(0,0,0,"<default>",false,IP,hits,walks,runs,wins,losses,GP);
	}
	public Pitcher(int num, double age, double salary, String pos, boolean inj, int IP, int hits, int walks, int runs, int wins, int losses, int GP){
		super(num, age, salary, pos, inj);
		this.setInningsPitched(IP);
		this.setHitsAllowed(hits);
		this.setWalksAllowed(walks);
		this.setRunsAllowed(runs);
		this.setWins(wins);
		this.setLosses(losses);
		this.setGamesPlayed(GP);
	}
	public double whip(){
		return (new BigDecimal(hitsAllowed+walksAllowed).divide(new BigDecimal(inningsPitched),3,BigDecimal.ROUND_DOWN)).doubleValue();
	}
	public double era(){
		return (new BigDecimal(runsAllowed*9).divide(new BigDecimal(inningsPitched),2, BigDecimal.ROUND_DOWN)).doubleValue();
	}
	@Override
	public String toString(){
		String str = super.toString();
		str += "Innings Pitched: "+inningsPitched+"\n";
		str += "Hits Allowed: "+hitsAllowed+"\n";
		str += "Walks Allowed: "+walksAllowed+"\n";
		str += "Runs Allowed: "+runsAllowed+"\n";
		str += "Wins: "+wins+"\n";
		str += "Losses: "+losses+"\n";
		str += "Games Played: "+gamesPlayed+"\n";
		str += "WHIP: "+whip()+"\n";
		str += "ERA: "+era()+"\n";
		return str;
	}
	public int getInningsPitched() {
		return inningsPitched;
	}
	public void setInningsPitched(int inningsPitched) {
		this.inningsPitched = inningsPitched;
	}
	public int getHitsAllowed() {
		return hitsAllowed;
	}
	public void setHitsAllowed(int hitsAllowed) {
		this.hitsAllowed = hitsAllowed;
	}
	public int getWalksAllowed() {
		return walksAllowed;
	}
	public void setWalksAllowed(int walksAllowed) {
		this.walksAllowed = walksAllowed;
	}
	public int getRunsAllowed() {
		return runsAllowed;
	}
	public void setRunsAllowed(int runsAllowed) {
		this.runsAllowed = runsAllowed;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
}