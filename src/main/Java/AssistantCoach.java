package Java;

public abstract class AssistantCoach {
    // Cannot write default method in abstract class, it's only for interface
//    default String getDailyRoutine(){
//        return "";
//    }
        public String getDailyHardRoutine(){
            return "Daily 3 hour practice...";
        }

    public AssistantCoach() {
            super();
    }
}
