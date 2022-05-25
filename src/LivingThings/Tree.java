package LivingThings;

public class Tree implements LivingThing{

	@Override
	public void type() {
		System.out.println("botany");
	}

	@Override
	public boolean movement() {
		return false;
	}

}
