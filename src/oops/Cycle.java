package oops;

public abstract class Cycle {

	
	public void tyres()
	{
		System.out.println("Cycle tyres");
	}
	public void breaks()
	{
		System.out.println("Cycle breks");
	}
	public void peddle()
	{
		System.out.println("Cycle peddle");
	}
	public abstract void handle();
	public abstract void chain();
	public abstract void stand();

}
