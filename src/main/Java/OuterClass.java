package Java;

final class OuterClass {

	
	
	void WhatsUp() {
		System.out.println("What's up from outer class!");
	}
	
	public static void main(String[] args) {
		System.out.println("In main method from outerclass");
		InnerClass ic = new InnerClass();
		OuterClass oc = new OuterClass();

		ic.HeyThere();
		oc.WhatsUp();

		OuterClass.InnerClass oic = new OuterClass.InnerClass();
		oic.WhatsUp();
	}

	static class InnerClass{
		void HeyThere() {
			System.out.println("Hey there! I'm from innerclass");
		}
		void WhatsUp() {
			System.out.println("What's up from inner class!");
		}
		public static void main(String[] args) {
			System.out.println("In main method from innerclass");
			InnerClass ic = new InnerClass();
			OuterClass oc = new OuterClass();
			ic.HeyThere();
			oc.WhatsUp();
		}
		
	}
	
}