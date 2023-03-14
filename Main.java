/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitro 5
 */
abstract class Vehicle {
    // abstract methods
    public abstract void go();
    public abstract void stop();
}

//Kailangan gid ni sa naka extend sa Vehicle
class Car extends Vehicle {

    public void go() {
    drive();
    }
    public void stop() {
    brake();
    }
  // tingob sa go/stop
    public void brake(){
        System.out.println("Stopping the car");
    }
    void drive(){
    System.out.println("Driving the car");
    }
    
    
}
//Extend sa bike
class Bike extends Vehicle {

    public void go() {
    og();
    }
    public void og(){
        System.out.println("Riding a bike");
    }

    //To change body of generated methods, choose Tools | Templates.
    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}


public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.go();
        car.stop();
        bike.go();
    }
}