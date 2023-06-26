interface A {
	void call();
	}

interface B {
	void call();
	}
public class Test2 implements A,B {
	@Override
	public void call() {
		System.out.println("hello good morning.");
		}
public static void main (String args[]) {
	A aa = new Test2();
	aa.call();
	B bb = new Test2();
	bb.call();
	}
}