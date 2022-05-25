package main;

public class BaseBallCoach implements Coach {
	public static void main(String[] args) {

		Coach BCoach = new BaseBallCoach();
		
		System.out.println(BCoach.getDailyRoutine());
	}

	public String getDailyRoutine() {
		return "Daily 30 minutes baseball practice";
	}

}
