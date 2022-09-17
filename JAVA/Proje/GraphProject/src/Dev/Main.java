package Dev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,City> cities = new HashMap<>();

        File cityFile = new File(args[0]);
        try {
            Scanner scanner = new Scanner(cityFile);
            while(scanner.hasNextLine()){
                String[] readData = scanner.nextLine().split(",");
                if(readData[0].charAt(0) == '0'){
                    readData[0] = readData[0].substring(1);
                }
                City city = new City(Integer.parseInt(readData[0]),readData[1].toLowerCase());

                for(int i = 2; i<=82; i++){
                    city.addDistance(Integer.parseInt(readData[i]));
                }

                cities.put(city.getID(),city);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        File adjacentFile = new File(args[1]);
        try {
            Scanner scanner = new Scanner(adjacentFile);
            while(scanner.hasNextLine()){
                String[] readLine = scanner.nextLine().toLowerCase().split(",");
                int index = 1;
                for(Map.Entry<Integer,City> currentCity : cities.entrySet()){
                    if(currentCity.getValue().getName().equals(readLine[0])){ // equals 0 ne ?
                        HashMap<Integer,City> currentCityAdjacency = new HashMap<>();
                        boolean controller = true;
                        while(controller){
                            for(Map.Entry<Integer,City> target : cities.entrySet()){ // getter setter yeirne neden entry set ?
                                if(target.getValue().getName().equals(readLine[index])){
                                    currentCityAdjacency.put(target.getKey(),target.getValue());
                                    index++;
                                    if(index == readLine.length)
                                        controller = false;
                                    break;
                                }
                            }
                        }
                        currentCity.getValue().setAdjacency(currentCityAdjacency); // burda naptık ?
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<List<Node>> adj = new ArrayList<>();
        for(int i = 0; i<81; i++){
            adj.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,City> entry : cities.entrySet()){
            City currentCity = entry.getValue();
            for(Map.Entry<Integer,City> adjEntry : currentCity.getAdjacency().entrySet()){
                adj.get(currentCity.getID()-1).add(new Node(adjEntry.getValue().getID(),currentCity.getDistances().get(adjEntry.getValue().getID()-1)));
            }
        }


    }
}