package Activities;
//In the class Activity1, create an Object of the Car class
public class car {
    String color;
    int make;
    String transmission;
    String Type;
    int tyres;
    int doors;

    //Class Methods
    public void displayCharacterstics(){
        System.out.println("Color of the Car: " + color);
        System.out.println("Make of the Car: " + make);
        System.out.println("Transmission of the Car: " + transmission);
        System.out.println("Number of doors on the car: " + doors);
        System.out.println("Number of tyres on the car: " + tyres);
    }

    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

    public void brake() {
        System.out.println("Car has stopped.");
    }
}