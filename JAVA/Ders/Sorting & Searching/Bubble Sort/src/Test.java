import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(5,100);
        insertionSort(arr);
    }

    static void bubble(int[] array){
        for (int i = 0; i < array.length-1; i++){
            boolean ok = false;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j + 1] < array[j]) {
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

    static int[] generateRandomArray(int size, int bound){
        int[] ans = new int[size];
        Random random = new Random();

        for(int i = 0; i<size; i++){
            ans[i] = random.nextInt(bound);
        }
        return ans;
    }

    static void selectionSort(int[] array){
        for (int i = 0; i < array.length-1; i++){
            int min = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int swap = array[min];
            array[min] = array[i];
            array[i] = swap;

        }
    }

    static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                --j;
            }
            array[j+1] = key;
        }
    }
}
