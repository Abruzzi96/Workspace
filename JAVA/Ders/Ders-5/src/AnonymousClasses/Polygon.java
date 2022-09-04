package AnonymousClasses;

public class Polygon {
    public void display(){
        System.out.println("Inside the polygon class");
    }
}

class Anonymous{
    public void createClass(){
        // creation of anonymous class extending class Polygon
        Polygon p1 = new Polygon(){
            public void display(){
                System.out.println("Inside an anonymous class");
            }
        };
        p1.display();
    }
}
