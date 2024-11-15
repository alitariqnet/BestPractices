package Java;

import java.util.List;

public class VoidType {
    public static void main(String[] args) throws NoSuchMethodException {
        java.lang.Class<java.lang.Void> returnType = (java.lang.Class<Void>) List.class.getMethod("clear").getReturnType();
    }
}
