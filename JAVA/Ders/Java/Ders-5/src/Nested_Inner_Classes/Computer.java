package Nested_Inner_Classes;

public class Computer {
    // nested class
    class CPU{
        double cores;
        String manufacturer;

        double getCache(){
            return 4.7;
        }
    }

    // nested protected class
    protected class RAM{
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 3.6;
        }
    }
}
