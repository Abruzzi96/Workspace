package OOP1;

public class Bicycle {
    // fields - attributes
    // constructor
    // functions

    private int gear;

    //Default Constructor
    Bicycle(){
        gear = -1;
    }

    //Parameterized Constructor
    Bicycle(int gear){
        this.gear = gear;
    }

    //Copy Constructor
    Bicycle(Bicycle obj){
        this.gear = obj.gear;
    }

    void increaseGear(){
        this.gear++;
    }

    void decreaseGear(){
        this.gear--;
    }

    public int getGear() {
        return gear;
    }
}
