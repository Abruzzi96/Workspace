import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[7];
        System.out.println("BEFORE : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(25); // storing random integers in an array
            System.out.print(arr[i] + " "); // printing each array element
            quicksort(int[] array, lowIndex, highIndex);
        }

    }


    private static void quicksort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){
            while (array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);

        quicksort(array, lowIndex, leftPointer -1 );
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}