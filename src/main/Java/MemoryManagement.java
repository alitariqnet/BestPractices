package Java;

import org.openjdk.jol.vm.VM;

public class MemoryManagement {
    private static String name = "Ali";

    public static void main(String[] args) {
        System.out.println(VM.current().addressOf(name));
        System.out.println(VM.current().addressOf(getName(name)));
        System.out.println(VM.current().addressOf(getName("Ali")));
        System.out.println(VM.current().details());

    }
    public static String getName(String name){
        System.out.println(VM.current().addressOf(name));
        return name;
    }
}
