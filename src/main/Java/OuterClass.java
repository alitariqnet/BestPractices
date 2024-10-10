package Java;

final class OuterClass {

	
	
	void WhatsUp() {
		System.out.println("What's up from outer class!");
	}
	
	public static void main(String[] args) {
		System.out.println("Going to print from outerclass");
		InnerClass ic = new InnerClass();
		OuterClass oc = new OuterClass();
		ic.HeyThere();
		oc.WhatsUp();
	}

	static class InnerClass{
		void HeyThere() {
			System.out.println("Hey there! I'm from innerclass");
		}
		
		public static void main(String[] args) {
			System.out.println("Going to print from innerclass");
			InnerClass ic = new InnerClass();
			OuterClass oc = new OuterClass();
			ic.HeyThere();
			oc.WhatsUp();
		}
		
	}
	
}