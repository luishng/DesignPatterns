package state_season;

public class Fall implements Season{

	@Override
	public Season nextSeason() {
		System.out.println("Indo pro inverno!");
		return new Winter();
	}

}
