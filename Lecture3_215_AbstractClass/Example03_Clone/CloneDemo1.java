package Lecture3_215_AbstractClass.Example03_Clone;

public class CloneDemo1 {
	public static void main(String args[]) {
		A3 obj1 = new A3(37);
		A3 obj2 = (A3) obj1.clone(); // if not catch Exception (on clone method) , it will cause Error on main
			// casting .clone (which return object) to A3 class
		System.out.println(obj2.getx());
	}
}

class A3 implements Cloneable { // Step 1 : Implement Cloneable
	private int x;

	public A3(int i) {
		x = i;
	}

	// Step 2 : Must define clone method (returning Object)
	public Object clone() {
		try {
			return super.clone();
		// Step 3 : must use try-catch on CloneNotSupportedException
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	public int getx() {
		return x;
	}
}
