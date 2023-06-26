interface X {
	int data = 34;
	void call();
	void show();
	void display();
}
interface Y {
	void fun() ;
}
public class Demo implements X,Y {
	@Override
	public void call() {
		System.out.println("Hello i am in cuttack.");
		}
	@Override
	public void show() {
		System.out.println("I am in java Tc.");
		}
	@Override
	public void display() {
		System.out.println("Hello Good Morning.");
		}
	@Override
	public void fun() {
		System.out.println("Hello gyz.");
		}
	public static void main(String args[]) {
		Demo dd = new Demo() ;
		dd.call();
		dd.show();
		dd.display();
		dd.fun();
		System.out.println("X.data");
	}
}
	