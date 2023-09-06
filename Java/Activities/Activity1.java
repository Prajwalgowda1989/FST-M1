//nitialize the values of
//make to 2014
//color to "Black"
//transmission to "Manual"
//Call the methods in the Car class to print the characteristics of the car, and what happens when you accelerate() and brake().

package Activities;

public class Activity1
{
    public static void main(String[] args){

        car rimac  = new car();
        rimac.make = 2014;
        rimac.color = "Black";
        rimac.transmission = "Manual";
        rimac.Type = "Electric";
        rimac.doors = 4;
        rimac.tyres = 5;

        rimac.displayCharacterstics();
        rimac.accelerate();
        rimac.brake();
    }
}


