package Java;

public class BaseBallCoach extends AssistantCoach implements Coach {
	public BaseBallCoach() {
		super();
	}

	public static void main(String[] args) {

		Coach coach = new BaseBallCoach();
		
		System.out.println(coach.getDailyRoutine());
		// this line will run abstract class method, not the one that is in interface
		System.out.println(coach.getDailyHardRoutine());
	}

	public String getDailyRoutine() {
		return "Daily 30 minutes baseball practice";
	}

}
