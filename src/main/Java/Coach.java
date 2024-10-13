package Java;

public interface Coach {
	public static final int index = 0;
	public String getDailyRoutine();
	default String getDailyHardRoutine(){
		return "Daily 5 hours practice...";
	}

	public static void main(String[] args) {
		System.out.println("main method in interface");
	}
}
