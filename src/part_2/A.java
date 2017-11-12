package part_2;

public class A {
	int i; // public by default
	protected int j; // private to A
	void setij(int x, int y) {
	     i = x;
	     j = y;
	}
}
	// A's j is not accessible here.
class B extends A {
	int total;
	void sum() {
         total = i + j; // ERROR, j is not accessible here
	}
}
	class Access {
	public static void main(String args[]) {
	B subOb = new B();
	subOb.setij(10, 12);
	subOb.sum();
	System.out.println("Total is " + subOb.total);
	}

}
