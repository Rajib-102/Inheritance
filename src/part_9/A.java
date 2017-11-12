package part_9;

public class A {
	int i, j;
	A(int a, int b) {
	      i = a;
	      j = b;
	}
	// display i and j
	void show() {
	     System.out.println("i and j: " + i + " " + j);
	}

}
class B extends A {
      int k;
      B(int a, int b, int c) {
             super(a, b);
             k = c;
       }
// display k – this overrides show() in A
       void show(String msg) {
            System.out.println(msg + k);
       }
}
