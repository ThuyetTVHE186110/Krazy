
package Inheritance;

public class Honda extends Car {
    public Boolean alloyWheel;
    public Honda(String wheelStatus, int noOfWheels,Boolean alloyWheel){
        super(wheelStatus, noOfWheels);
        this.alloyWheel = alloyWheel;
    }
    public void setAlloyWheel(Boolean alloyWheel){
        this.alloyWheel = alloyWheel;
    }
    @Override 
    public String toString(){
        return (super.toString()+"\nCar alloy wheel"+this.alloyWheel);
    }
}

