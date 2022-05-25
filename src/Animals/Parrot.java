package Animals;

public class Parrot extends Bird implements LivingThing {

	@Override
	public void type() {
		System.out.println("Fancy bird");
	}

	@Override
	public boolean movement() {
		return true;
	}

	@Override
	public boolean fly() {
		return true;
	}

	@Override
	public void age() {
		System.out.println("2 years old");
	}

	@Override
	public void name() {
		System.out.println("birdie");
	}

	@Override
	public void color() {
		System.out.println("Green");
	}

	@Override
	public void race() {
		
	}

	@Override
	public void walkingStyle() {
		System.out.println("Two legged");
	}

}
