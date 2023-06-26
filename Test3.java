interface A {
   	void show() ;
	}
interface B {
	void display();
	}
public class Test3 {
	public static void main(String args[]) {
	A aa = new A() {	//concept of Anonymous inner class
		@Override
		public void show() {
			System.out.println("This is maya.") ;
		}
	};
		aa.show();
	B bb = new B() {
		@Override 
		public void display() {
			System.out.println("i am a student.");
		}
	};
		bb.display();
	}
}
