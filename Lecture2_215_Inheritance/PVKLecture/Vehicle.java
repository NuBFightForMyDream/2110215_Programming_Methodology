package Lecture2_215_Inheritance.PVKLecture;
// writing subclass inside class

class Vehicle {
    int speed = 50 ;
    void display() {}
}

class Bike extends Vehicle {
    int speed = 100 ; // override mom's attribute
    void display() {
        System.out.println(super.speed); // calling parent's speed (50)
    }
    public static void main(String[] args) {
        Vehicle newB = new Bike() ;
        newB.display() ; // nothing out , from Vehicle display() method
    }
}
