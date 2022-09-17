package Dev;

import java.util.ArrayList;
import java.util.HashMap;

public class City {
    private int ID;
    private String name;
    private ArrayList<Integer> distances;
    private HashMap<Integer, City> adjacency;

    City(int ID, String name) {
        this.ID = ID;
        this.name = name;
        distances = new ArrayList<>();
        adjacency = null;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getDistances() {
        return distances;
    }

    public void setDistances(ArrayList<Integer> distances) {
        this.distances = distances;
    }

    public void addDistance(int distance) {
        this.distances.add(distance);
    }

    public HashMap<Integer, City> getAdjacency() {
        return adjacency;
    }

    public void setAdjacency(HashMap<Integer, City> adjacency) {
        this.adjacency = adjacency;
    }
}
