package Animals;

public class Cat extends Animal{
	
	public static int counter = 0;
	
	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		c1.printClassName();
	}
	
	public void incCounter1() {
		while(counter<5) {
			counter++;
		System.out.println("incCounter1 "+counter);
		}
	}

	public void incCounter2() {
		while(counter<10) {
			counter++;
		System.out.println("incCounter2 "+counter);
		}
	}

	@Override
	public void name() {
		System.out.println("Cat");		
	}

	@Override
	public void type() {
		
	}

	@Override
	public void age() {
		
	}

	@Override
	public void color() {
		
	}

	@Override
	public void race() {
		
	}

	@Override
	public boolean movement() {
		return true;
	}

	@Override
	public void walkingStyle() {
		System.out.println("Four legged");		
	}
}
