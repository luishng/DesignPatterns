package state_season;

public class SeasonContext {
	Season season;
	
	public SeasonContext(){
		season = new Summer();
	}
	
	public void nextSeason(){
		season = season.nextSeason();
	}
}
