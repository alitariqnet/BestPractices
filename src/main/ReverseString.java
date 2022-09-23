package main;

public class ReverseString {

	public static void main(String[] args) {

		StringBuilder str = reverseString("reverse string");
		System.out.println(str);
	}
	
	// Just like Wasim Akram's reverse swing
	
	public static StringBuilder reverseString(String str) {
		StringBuilder sb = new StringBuilder("");
		int pivot = str.length()-1;
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(pivot));
			pivot--;
		}
		return sb;
	}

}
