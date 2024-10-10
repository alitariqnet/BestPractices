package Java;

public class Conditionals {
    public static void main(String[] args) {
        // ...

        int numLetters = 0;
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numLetters = 8;
                break;
            case WEDNESDAY:
                numLetters = 9;
                break;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        }
        System.out.println(numLetters);
        // Java 17 features
        // Link: https://docs.oracle.com/en/java/javase/17/language/switch-expressions.html
        System.out.println(
                switch (day) {
                    case MONDAY, FRIDAY, SUNDAY -> 6;
                    case TUESDAY                -> 7;
                    case THURSDAY, SATURDAY     -> 8;
                    case WEDNESDAY              -> 9;
                    default -> throw new IllegalStateException("Invalid day: " + day);
                }
        );
        System.out.println("""
    This is the first line
    This is the second line
    This is the third line
    """);

        String source = """
    String message = "Hello, World!";
    System.out.println(message);
    """;
        System.out.println(source);

        var name = "alibaba";
        if (name instanceof String s && s.length() > 6){
            System.out.println("name variable contains a string and its length is greater than 9 chars");
        }
    }
}

