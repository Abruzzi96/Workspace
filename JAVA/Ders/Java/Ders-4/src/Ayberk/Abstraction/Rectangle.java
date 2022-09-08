package Ayberk.Abstraction;

public class Rectangle implements Polygon {
    @Override
    public void getArea(int length, int width) {
        System.out.println("The are of the rectangle is: " + length * width);
    }
}
