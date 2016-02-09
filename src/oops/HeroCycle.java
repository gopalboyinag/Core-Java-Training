package oops;

public class HeroCycle extends Cycle{

	
	public static void main(String[] args) {
	

	}

	@Override
	public void handle() {
		System.out.println("Hero handle");
	}

	@Override
	public void chain() {
		System.out.println("Hero chain");
		
	}

	@Override
	public void stand() {
		System.out.println("Hero stand");
		
	}

}
