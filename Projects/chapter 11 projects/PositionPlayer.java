import java.math.BigDecimal;
class PositionPlayer extends BaseballPlayer{
	private int gamesPlayed, atBats, hits, walks, runs, doubles, triples, homeRuns, hitByPitch;
	 public PositionPlayer(){
		 this(0, 0, 0, "<default>", false, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	 }
	 public PositionPlayer(int GP, int AB, int hits, int walks, int runs, int doubles, int triples, int HR, int HBP){
		 this(0, 0, 0, "<default>", false, GP, AB, hits, walks, runs, doubles, triples, HR, HBP);
	 }
	 public PositionPlayer(int num, double age, double sal, String pos, boolean inj, int GP, int AB, int hits, int walks, int runs, int doubles, int triples, int HR, int HBP){
		 super(num, age, sal, pos, inj);
		 this.setGamesPlayed(GP);
		 this.setAtBats(AB);
		 this.setHits(hits);
		 this.setWalks(walks);
		 this.setRuns(runs);
		 this.setDoubles(doubles);
		 this.setTriples(triples);
		 this.setHomeRuns(HR);
		 this.setHitByPitch(HBP);
	 }
	public double battingAverage(){
		return (new BigDecimal(hits+"").divide(new BigDecimal(atBats+""), 3, BigDecimal.ROUND_DOWN)).doubleValue();
	}
	public double OBP(){
		return (new BigDecimal((hits+walks+hitByPitch)+"").divide(new BigDecimal((atBats+walks+hitByPitch)+""), 3, BigDecimal.ROUND_DOWN)).doubleValue();
	}
	public double slugging(){
		int singles = ((hits-doubles)-triples)-homeRuns;
		return (new BigDecimal((singles+doubles*2+triples*3+homeRuns*4)+"").divide(new BigDecimal(atBats+""), 3, BigDecimal.ROUND_DOWN)).doubleValue();
	}
	@Override
	public String toString(){
		String str = super.toString();
		str += "Games Played: "+gamesPlayed+"\n";
		str += "At Bats: "+atBats+"\n";
		str += "Hits: "+hits+"\n";
		str += "Walks: "+walks+"\n";
		str += "Runs: "+runs+"\n";
		str += "Doubles: "+doubles+"\n";
		str += "Triples: "+triples+"\n";
		str += "Home Runs: "+homeRuns+"\n";
		str += "Hit by Pitch: "+hitByPitch+"\n";
		str += "Batting Average: "+battingAverage()+"\n";
		str += "OBP: "+OBP()+"\n";
		str += "Slugging: "+slugging()+"\n";
		return str;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	public int getAtBats() {
		return atBats;
	}
	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getWalks() {
		return walks;
	}
	public void setWalks(int walks) {
		this.walks = walks;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getDoubles() {
		return doubles;
	}
	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}
	public int getTriples() {
		return triples;
	}
	public void setTriples(int triples) {
		this.triples = triples;
	}
	public int getHomeRuns() {
		return homeRuns;
	}
	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}
	public int getHitByPitch() {
		return hitByPitch;
	}
	public void setHitByPitch(int hitByPitch) {
		this.hitByPitch = hitByPitch;
	}
}