package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.SortedMap;
import java.util.TreeMap;

public class MorePractice {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		HashMap<String,String> hash = new HashMap<String,String>();
		map.put("Hello","World");
		hash.put("Hello","World");
		// Optional since 1.8
		Optional<Integer> str = Optional.ofNullable(null);
//		Integer str = null;
		System.out.println(str);
	}

	// overloading / static binding / compile time polymorphism
	int add(int a, int b, float c) {
		return (int) (a+b+c);
	}
	int add(int a, int b) {
		return (int) (a+b);
	}
	int add(float c) {
		return (int) (c);
	}
	int add(String s, String t) {
		return Integer.parseInt(s+t);
	}
}
