package state_season;

public class Spring implements Season{

	@Override
	public Season nextSeason() {
		System.out.println("Indo pro verão!");
		return new Summer();
	}
}
