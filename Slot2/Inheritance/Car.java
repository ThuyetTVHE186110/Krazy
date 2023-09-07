
package Inheritance;

public class Car {
    public String wheelStatus;
    public int noOfWheels;
    public Car(String wheelStatus, int noOfWheels){
        this.wheelStatus= wheelStatus;
        this.noOfWheels= noOfWheels;
    }
    public void applyBrake(){
        this.wheelStatus = "Stop";
        System.out.println("Stop the car using break");
    }
    @Override
    public String toString(){
        return ("No of wheels in car" +this.noOfWheels+"\n"
                + "status of the wheels"+ this.wheelStatus);
    }
}
