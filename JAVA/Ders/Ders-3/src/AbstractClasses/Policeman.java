package AbstractClasses;

public class Policeman extends Person{

    String pDepartment;
    int noOfExperience;

public Policeman (String pDepartment, int noOfExperience) {
    this.pDepartment = pDepartment;
    this.noOfExperience = noOfExperience;
}

    public String toString()
    {
        return("Hi my Department is "+ this.pDepartment()+
                ".\nMy exp is " +
                this.noOfExperience());
    }

    private int pDepartment() {
        return noOfExperience;
    }

    private int noOfExperience() {
        return noOfExperience;
    }

    @Override
    void name() {

    }
}




