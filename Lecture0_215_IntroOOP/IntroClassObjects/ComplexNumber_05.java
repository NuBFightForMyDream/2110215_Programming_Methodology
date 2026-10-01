package Lecture0_215_IntroOOP.IntroClassObjects;

public class ComplexNumber_05 {

	// main function 
	public static void main(String[] args) {
		// call methods
		ComplexNumber_05 z1 = new ComplexNumber_05(3 , 5) ; // z1 = 3 + 5j
		ComplexNumber_05 z2 = new ComplexNumber_05(4 , -2) ; // z2 = 4 - 2j
		
		System.out.println("Complex Number #1 : " + z1);
		System.out.println("Complex Number #2 : " + z2);
		
		// Add method
		System.out.println("Addition of complex #1 & complex #2 : " + (z1.adds(z2))) ; // (7.0 + 3.0j)
		// Subtract Method
		System.out.println("Subtraction of complex #1 & complex #2 : " + (z1.subtracts(z2))) ; // (-1.0 + 7.0j)
		// Multiply method
		System.out.println("Multiplication of complex #1 & complex #2 : " + (z1.multiplies(z2))) ; // (22.0 + 14.0j)
		// Divides Method 
		System.out.println("Division of complex #1 & complex #2 : " + (z1.divides(z2))) ; // (0.1 + 1.3j)
		// Inverse method
		System.out.println("Inverse of complex #1 : " + (z1.multInverse())) ; // (3/34 - 5/34 j)
		// Conjugate method
		System.out.println("Conjugate of complex #1 : " + (z1.conjugate())) ; // 3 - 5j
		// Magnitude Method
		System.out.println("Magnitude of complex #2 : " + (z2.magnitude())) ; // 4.472
	}
	
	// Step 1 : define private attributes
	private double realPart , imagPart ; 
	
	// Step 2 : define constructors
	
		// Default : No-Argument Constructor
	public ComplexNumber_05() {
		this(0,0) ; // call ComplexNumber_05 detailed constructor -> real = 0 , imag = 0
	}
	
		// Detailed Constructor : define real and img
	public ComplexNumber_05( double real , double img ) { // z = constructor
		// define value 
		realPart = real ; imagPart = img ; 
	}
	
		// Copy constructor
	public ComplexNumber_05( ComplexNumber_05 z ) { // z = constructor
		this( z.getRealPart() , z.getImagPart() ) ; // call getter - setter methods 
	}
	
	// Step 3 : create Getter - Setter method
	public double getRealPart() {
		return realPart ; // double
	}
	public double getImagPart() {
		return imagPart ; // double
	}
	public void setRealPart(double real) {
		// change value via this method
		this.realPart = real ; // double
	}
	public void setImagPart(double imag) {
		// change value via this method
		this.imagPart = imag ; // double
	}
	
	// Step 4 : Another methods : adds , subtracts , multiplies , 
							   // divides , multInverse , conjugate , magnitude , toString 
	
	public ComplexNumber_05 adds(ComplexNumber_05 z) { 
		// Copy Constructor -> return NEW object (created from constructor)
		// Note : this = self constructor
		return new ComplexNumber_05( this.getRealPart() + z.getRealPart() , 
								 	 this.getImagPart() + z.getImagPart());
		// return new constructor for not changing old value 
	}
	
	public ComplexNumber_05 subtracts(ComplexNumber_05 z) { 
		// Copy Constructor -> return NEW object (created from constructor)
		// Note : this = self constructor
		return new ComplexNumber_05( this.getRealPart() - z.getRealPart() , 
								 	 this.getImagPart() - z.getImagPart());
		// return new constructor for not changing old value 
	}
	
	public ComplexNumber_05 multiplies(ComplexNumber_05 z) { 
		// Copy Constructor -> return NEW object (created from constructor)
		// Note : this = self constructor
		return new ComplexNumber_05( this.getRealPart() * z.getRealPart() - this.getImagPart() * z.getImagPart(), // real1*real2 - im1*im2
									 this.getRealPart() * z.getImagPart() + this.getImagPart() * z.getRealPart() ); // real1*imag2 + imag1*real2
		// return new constructor for not changing old value 
	}
	
	public ComplexNumber_05 divides(ComplexNumber_05 z) { 
		// Copy Constructor -> return NEW object (created from constructor)
		// Note : this = self constructor
		return new ComplexNumber_05( (this.getRealPart() * z.getRealPart() + this.getImagPart() * z.getImagPart()) / (Math.pow(z.getRealPart(), 2) + Math.pow(z.getImagPart(), 2)) , // real = ac+bd / (c^2 + d^2)
									 (this.getImagPart() * z.getRealPart() - this.getRealPart() * z.getImagPart()) / (Math.pow(z.getRealPart(), 2) + Math.pow(z.getImagPart(), 2)) ) ; // imag = bc-ad / (c^2 + d^2)
		// return new constructor for not changing old value 
	}
	
	public ComplexNumber_05 multInverse() { 
		// Copy Constructor -> return NEW object (created from constructor)
		// Note : this = self constructor
		return new ComplexNumber_05( this.getRealPart() / (Math.pow(this.getRealPart(), 2) + Math.pow(this.getImagPart(), 2)) ,// real = a/a2+b2 = real1 / (real2^2 + imag^2)
								   - this.getImagPart() / (Math.pow(this.getRealPart(), 2) + Math.pow(this.getImagPart(), 2)) ); // imag = -b/a2+b2 = -imag2 / (real2^2 + imag^2)
		// return new constructor for not changing old value 
	}
	
	public ComplexNumber_05 conjugate() { 
		// Copy Constructor -> return NEW object (created from constructor)
		// Note : this = self constructor
		return new ComplexNumber_05( this.getRealPart() , - this.getImagPart() );  // real opp imag
									  
		// return new constructor for not changing old value 
	}

	public double magnitude() { 
		// Copy Constructor -> return NEW object (created from constructor)
		// Note : this = self constructor
		return Math.sqrt(Math.pow(this.getRealPart(), 2) + Math.pow(this.getImagPart(), 2)) ; // sqrt(a^2 + b^2)
		// return new constructor for not changing old value 
	}
	
	public String toString() {
		if (this.getImagPart() >= 0) {
			return "(" + this.getRealPart() + " + " + this.getImagPart() + "j)" ; 
		}
		else return "(" + this.getRealPart() + " - " + Math.abs(this.getImagPart()) + "j)" ; 
	}

}
