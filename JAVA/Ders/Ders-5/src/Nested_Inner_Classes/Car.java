package Nested_Inner_Classes;

public class Car {
    String carName;
    String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    private String getCarName(){
        return this.carName;
    }

    // inner class
    class Engine{
        String engineType;
        void setEngine(){
            if(Car.this.carType.equals("4WD")){
                if(Car.this.getCarName().equals("Crysler")){
                    this.engineType = "Small";
                }
                else{
                    this.engineType = "Big";
                }
            }
            else{
                this.engineType = "Huge";
            }
        }

        String getEngineType(){
            return this.engineType;
        }
    }
}
