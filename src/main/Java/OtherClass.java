package Java;


public class OtherClass {

	String s1;
	String s2;
	
	OtherClass(){
		s1 = "string 1";
		s2 = "string 2";
	}
	
	public static void main(String[] args) {

		System.out.println("Going to print from otherclass");
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.HeyThere();
		oc.WhatsUp();		

	}

}
