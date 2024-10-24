package Java;

public class Class {
    public static void main(String[] args) {
        var c1 = String.class;
        System.out.println(c1);

        var c2 = "Class".getClass();
        System.out.println(c2);

        java.lang.Class<?> c3 = null;
        try {
            c3 = java.lang.Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c3);
    }
}
