package Animals;

public abstract class Animal extends Creature{

	public abstract void age();
	public abstract void name();
	public abstract void color();
	
	public void printClassName() {
		System.out.println("Animal");
	}

}
