interface A {
	void show();
	}
interface B extends A {
	void display() ;
	}
public class Test1 implements B {
	@Override
	public void display() {
		System.out.println("This is lulu.") ;
		}
	@Override
	public void show() {
		System.out.println("hello morning.") ;
		}
	public static void main(String args[]) {
		B bb = new Test1();
		bb.display();
		bb.show();
	}
} 