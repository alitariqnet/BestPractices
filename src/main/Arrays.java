package main;

public class Arrays {
public static void main(String[] args) {
	

	String []s = {"hello","world","here"};
	for (String st: s) {
		System.out.println(st);
	}
	
	Arrays a = new Arrays();
	Arrays a1 = new Arrays();
	System.out.println(a.getClass());
	System.out.println(a.hashCode());
	System.out.println(a1.hashCode());
  }
}
