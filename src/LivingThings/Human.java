package LivingThings;

public class Human extends Creature{
	
	String name;
	int age;
	float height;
	float weight;
	
	@Override
	public void type() {
		System.out.println("Male");
	}

	@Override
	public boolean movement() {
		return true;
	}

	@Override
	public void race() {
		System.out.println("Asian");
	}

	@Override
	public void walkingStyle() {
		System.out.println("Two legged");
	}

}
