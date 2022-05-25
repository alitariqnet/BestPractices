package LivingThings;

public class Snake extends Animal {

	String name;
	int age;
	
	@Override
	public void type() {
		System.out.println("Cobra");
	}

	@Override
	public boolean movement() {
		return true;
	}

	@Override
	public void age() {
		System.out.println(this.age);
	}

	@Override
	public void name() {
		System.out.println(this.name);
	}

	@Override
	public void color() {
		System.out.println("Grey");
	}

	@Override
	public void race() {

	}

	@Override
	public void walkingStyle() {
		System.out.println("Crawl");
	}

}
