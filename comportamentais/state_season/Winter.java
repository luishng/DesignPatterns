package state_season;

public class Winter implements Season{

	@Override
	public Season nextSeason() {
		System.out.println("Indo pra primavera!");
		return new Spring();
	}
}
