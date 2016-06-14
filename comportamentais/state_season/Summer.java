package state_season;

public class Summer implements Season{

	@Override
	public Season nextSeason() {
		System.out.println("Indo pro outono!");
		return new Fall();
	}
}
