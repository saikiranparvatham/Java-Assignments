
public class Country {
	public String nameOfCountry;
	public long population;
	public long area;
	
	public Country(String nameOfCountry, long population, long area) {
		this.nameOfCountry = nameOfCountry;
		this.population = population;
		this.area = area;
	}
	
	public static String findLargestArea(Country[] countries)
	{
		long max=countries[0].area;
		int tracker=0;
		for(int counter=0;counter<countries.length;counter++)
		{
			if(max<countries[counter].area)
			{
				max=countries[counter].area;
				tracker=counter;
			}
		}
		String result=countries[tracker].nameOfCountry;
		return result;
	}

	public static String findLargestPopulation(Country[] countries) {
		long max=countries[0].population;
		int tracker=0;
		for(int counter=0;counter<countries.length;counter++)
		{
			if(max<countries[counter].population)
			{
				max=countries[counter].population;
				tracker=counter;
			}
		}
		String result=countries[tracker].nameOfCountry;
		return result;		
	}

	public static String findLargestPopulationDensity(Country[] countries) {
		long[] populationDensity = new long[countries.length];
		for(int counter=0;counter<countries.length;counter++)
		{
			populationDensity[counter]=countries[counter].population/countries[counter].area;
			
		}
		long max=populationDensity[0];
		int tracker=0;
		for(int counter=0;counter<countries.length;counter++)
		{
			if(max<populationDensity[counter])
			{
				max=populationDensity[counter];
				tracker=counter;
			}
		}
		
		return countries[tracker].nameOfCountry;
	}
	
	
	
}
