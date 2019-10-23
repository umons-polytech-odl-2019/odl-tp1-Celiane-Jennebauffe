package exercise1;

class Person {
	private int age;
	private String nom;
	public Person(String nom, int age)
	{
		this.nom=nom;
		this.age=age;
	}
	public void setName(String nom)
	{
		this.nom=nom;
	}
	public String getName()
	{
		return nom;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}
