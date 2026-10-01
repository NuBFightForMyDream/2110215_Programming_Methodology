package Lecture0_215_IntroOOP.IntroClassObjects;

public class MyLocation_06 {
	// main fn : call all functions 
	public static void main(String[] args) {
		// define points
		MyLocation_06 point_1 = new MyLocation_06(4,3) ; // (4,3) 
		MyLocation_06 point_2 = new MyLocation_06() ; // (0,0) 
		
		// do methods
		point_2.setLocationPoint(10,2); // (0,0) -> (10,2)
		System.out.println("The Distance between " + point_1 + " and " + point_2 + 
				" is : " + point_1.findDistanceBetweenTwoPoints(point_2) ) ; // approx 6.08
	}

	// -------------------- Background Part --------------------------
	// set attributes as private
	private double pointX ; // private = can access only in class MyLocation_06
	private double pointY ; 
	
	// define getter-setter method
	public double getX() {
		return pointX ; 
	}
	public double getY() {
		return pointY ; 
	}
	public void setX(double newXVal) {
		this.pointX = newXVal ; 
	}
	public void setY(double newYVal) {
		this.pointY = newYVal ; 
	}
	
	// create 3 constructors
	public MyLocation_06() { // no-argument const.
		this(0,0) ; // default value will be (0,0)
	}
	public MyLocation_06(double X , double Y) { // detailed-const.
		pointX = X ; pointY = Y ; 
	}
	public MyLocation_06(MyLocation_06 otherPoint) {
		this(otherPoint.getX() , otherPoint.getY()) ; // getter , setter -> call detailed-const
	}
	
	// another methods
	public void setLocationPoint(double X , double Y) {
		setX(X) ; setY(Y) ; 
	}
	public double findDistanceBetweenTwoPoints(MyLocation_06 anotherPoint) {
		double distanceXSquare = Math.pow( this.getX() - anotherPoint.getX() , 2) ; // dx^2
		double distanceYSquare = Math.pow( this.getY() - anotherPoint.getY() , 2) ; // dy^2
		return Math.pow(distanceXSquare + distanceYSquare , 0.5) ; 
	}
	public String toString() {
		return "(" + this.getX() + " , " + this.getY() + ")" ; 
	}
}
