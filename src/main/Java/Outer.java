package Java;

// A nested class is a member of its enclosing class.
// Outer Class
public class Outer {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    // Static nested classes do not have access to other members of the enclosing class.
    // Static Nested Class
    protected static class StaticNested{
        void accessMembers(OuterClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            //     field outerField
            // System.out.println(outerField);
//            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    // Non-static nested classes (inner classes) have access to other members of the enclosing class, even if they are declared private.
    // Inner Class
    private class Inner{
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    public class TopLevelClass {

        void accessMembers(OuterClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            //     field OuterClass.outerField
            // System.out.println(OuterClass.outerField);
//            System.out.println(outer.outerField);
//            System.out.println(OuterClass.staticOuterField);
        }
    }
    /*
    Why Use Nested Classes?
    Compelling reasons for using nested classes include the following:

    It is a way of logically grouping classes that are only used in one place: If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together. Nesting such "helper classes" makes their package more streamlined.

    It increases encapsulation: Consider two top-level classes, A and B, where B needs access to members of A that would otherwise be declared private. By hiding class B within class A, A's members can be declared private and B can access them. In addition, B itself can be hidden from the outside world.

    It can lead to more readable and maintainable code: Nesting small classes within top-level classes places the code closer to where it is used.

     */

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
        Outer outerObject = new Outer();
        Outer.Inner innerObject = outerObject.new Inner();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNested staticNestedObject = new StaticNested();
//        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
//        TopLevelClass topLevelObject = new TopLevelClass();
//        topLevelObject.accessMembers(outerObject);
    }
}
