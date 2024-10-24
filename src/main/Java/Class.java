package Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Class implements interface1, interface2{
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
        Class c = new Class();
        c.printClassName();


    }


    @Override
    public void printClassName() {
        interface1.super.printClassName();
    }
}
