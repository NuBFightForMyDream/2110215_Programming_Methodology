package Thread_Part1;

public class StateTest {
	public static void main(String[] args) {
		Thread t = new Thread(); // default thread
		System.out.println(t.getState()); // first state = NEW
		t.start();
		Thread.State s; // define state as S
		do {
			s = t.getState();
			System.out.println(s); // get state then print state
		} while (s != Thread.State.TERMINATED);
	}

}
