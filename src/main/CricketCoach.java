package main;


public class CricketCoach implements Coach {

	public String getDailyRoutine() {
		return "Daily 30 minutes cricket practice";
	}

	public static void main(String[] args) {
		
		Coach CCoach = new CricketCoach();
		Coach BCoach = new BaseBallCoach();

		System.out.println(CCoach.getDailyRoutine());
	}

}
