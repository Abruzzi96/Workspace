public class Policeman extends Person {
    public int getNoOfExperience() {
        return noOfExperience;
    }

    public void setNoOfExperience(int noOfExperience) {
        this.noOfExperience = noOfExperience;
    }

    private int noOfExperience;

    public Policeman(String name, String surname, int ID, int noOfExperience) {
        super(name, surname, ID);
        this.noOfExperience = noOfExperience;
    }

    @Override
    void printInfo() {
        System.out.println("Name: " + getName() + "\nSurname: " + getSurname() + "\nID: " + getID() + "\nExperience: " + getNoOfExperience());
    }
}




