package Java;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringsAttached {

    int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public static void main(String[] args) {

        String string1 = new String("hello");
        String string2 = new String("hello");

        if (string1 == string2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        string1 = string2;

        if (string1 == string2) {
            System.out.println("Strings are equal now");
        } else {
            System.out.println("Strings are still not equal");
        }
        string2 = "abc";

        System.out.println("string2 is now " + string2);
        System.out.println("string1 is still " + string1);

        String string3 = "same";
        String string4 = "same";

        System.out.println("string3 and string4 are equal? " + (string3 == string4));

        System.out.println("IntStream range skip 3: " + IntStream.range(0, 10).skip(3).count());

        int[] a = {1, 2, 3, 4, 5};
        //Stream s = Stream.of(a);
        System.out.println("stream of (a) count: " + Stream.of(a).count());
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = " + a[i] + ", ");
        }
        System.out.println("");
        int[] b = a.clone();
        b[0] = 2;
        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "] = " + b[i] + ", ");
        }
        String name = "ali";
        String name2 = name.concat(" tariq");
//		String name3 = name2.repeat(3);
        String name4 = name2.replace("ali", "Ali");
        CharSequence cs = "ali";
//		String name5 = name2.strip();
        String name6 = name2.substring(4);
        String name7 = name2.substring(2, 8);
        char c = name2.charAt(3);
        System.out.println("name2: " + name2);
//		System.out.println("name3: "+name3);
        System.out.println("name4: " + name4);
//		System.out.println("name5: "+name5);
        System.out.println("name6: " + name6);
        System.out.println("name7: " + name7);
        System.out.println("c: " + c);
        System.out.println("");

        StringsAttached s = new StringsAttached();
        s.setCounter(0);
        System.out.println("hash value of s: " + s.hashCode());
        incrementByOne(s);
        System.out.println("counter: " + s.getCounter());
        s.setCounter(100);
        reduceToValue(s, 50);
        System.out.println("counter: " + s.getCounter());
    }

    public static void incrementByOne(StringsAttached i) {
        i = new StringsAttached();
        System.out.println("hash value of i: " + i.hashCode());
        i.setCounter(i.getCounter() + 1);
        System.out.println("i:" + i.getCounter());
    }

    //recurrsively reduce to a value
    public static void reduceToValue(StringsAttached s, int value) {
        s.setCounter(s.getCounter() - 1);
        if (s.getCounter() == value)
            return;
        else
            reduceToValue(s, value);


    }
}
