import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        File file = new File("Comparations.txt");

        int digit = 1;
        for(int i = 0; i<4; i++, digit*=10){
            int[] randomArray = generateRandomArray(100*digit,100000); // digit ?

            Date start = new Date();
//            bubbleSort(randomArray);
//            selectionSort(randomArray);
            insertionSort2(randomArray);
            Date end = new Date();

            try {
                FileWriter fileWriter = new FileWriter(file,true);
                fileWriter.write("Sorting " + 100*digit + " Elements Using Bubble Sort: " + (end.getTime() - start.getTime()) + "ms\n");
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++){ // hangi kod veya sistemde +1 kullanılabilirdi ?
            boolean ok = false;
            for (int j = 0; j < array.length-i-1; j++) { // j aşağıda i yukarda mı olmak zorunda ? kod asıl kodu içine mi alıcak hep, dışarıdan sayıcak ??
                if (array[j + 1] < array[j]) { // j öncü ve asıl kod içeride ve daha derinde ve geriden gelen kod i yukarıda, gerçi doğrusu da böyle gibi
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    ok = true;
                }
            }
            if(!ok)
                break;
        }
    }

    static void selectionSort(int[] array){
        for(int step = 0; step < array.length-1; step++){
            int min_idx = step;

            for(int i = step+1; i<array.length; i++){
                if(array[i] < array[min_idx])
                    min_idx = i;
            }

            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    static void insertionSort(int[] array){
        for(int step = 1; step <array.length; step++){
            int key = array[step];
            int j = step-1;

            while(j >= 0 && key < array[j]){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key;
        }
    }

    static int[] generateRandomArray(int size, int bound){
        int[] ans = new int[size];
        Random random = new Random();

        for(int i = 0; i<size; i++){
            ans[i] = random.nextInt(bound);
        }
        return ans;
    }
}