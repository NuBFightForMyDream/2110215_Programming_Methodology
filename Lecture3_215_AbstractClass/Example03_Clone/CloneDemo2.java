package Lecture3_215_AbstractClass.Example03_Clone;

public class CloneDemo2 {
	public static void main(String args[]) {
		A4 obj1 = new A4(37);
		A4 obj2 = new A4(obj1); // will call [copy constructor]
		System.out.println(obj2.getx());
		
		A4 obj3 = A4.newInstace(obj1);
		System.out.println(obj3.getx());
	}
}

class A4 { // no need to have implements Clonable
	private int x;

	public A4(int i) {
		this.x = i;
	}

	// 1. copy constructor
	public A4(A4 other) {
		this.x = other.getx();
	} // get data from other object then assign value
	
	// 2. static factory -> method for newInstance (must be static)
	public static A4 newInstace(A4 other) {
		// new object and return object
		A4 obj = new A4(other.getx());
		return obj;
	}

	public int getx() {
		return x;
	}
}
