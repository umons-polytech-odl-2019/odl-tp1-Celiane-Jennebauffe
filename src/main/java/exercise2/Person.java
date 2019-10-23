package exercise2;

class Person {
	private int age;
	private static int compt=0;
	private static int totAge=0;

	public Person(int age) {
		this.age = age;
		compt++;
		totAge+=this.age;
	}
	public static int computePopulationSize()
	{
		return compt;
	}
	public static float computeAveragePopulationAge()
	{
		if(compt!=0) {
			return (float)totAge / compt;
		}
		else{
			System.out.println("La population n'existe pas");
			return 0;
		}
	}
	public static void resetPopulation()
	{
		compt=0;
		totAge=0;
	}

}
