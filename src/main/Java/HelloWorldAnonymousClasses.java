package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class HelloWorldAnonymousClasses {
    interface HelloWorld {
        void greet();
        void greetSomeone(String someone);
    }

    public void sayHello() {
        // Local class implementation of HelloWorld interface
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();
        // Anonymous class implementation of HelloWorld interface
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        // Anonymous class implementation of HelloWorld interface
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp =
                new HelloWorldAnonymousClasses();
        myApp.sayHello();
        var name = "ali";
        // can't change string to integer unlike javascript, so it is compile time error
//        name = 10;
        try {
            var url = new URL("http://www.oracle.com/");
            var conn = url.openConnection();
            var reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            System.out.println(reader);
            var list = new ArrayList<String>();    // infers ArrayList<String>
            var stream = list.stream();             // infers Stream<String>
            var fileName = "test.txt";
            var path = Paths.get(fileName);        // infers Path
            var bytes = Files.readAllBytes(path);  // infers bytes[]
            System.out.println(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
