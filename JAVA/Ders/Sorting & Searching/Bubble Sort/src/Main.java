import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        File file = new File("Comparations.txt");
//
//        int digit = 1;
//        for (int i = 0; i < 7; i++, digit *= 10) {
//            int[] randomArray = generateRandomArray(100 * digit, 1000000);
//
//            Date start = new Date();
////            bubbleSort(randomArray);
////            selectionSort(randomArray);
////            insertionSort(randomArray);
////            mergeSort(randomArray,0,randomArray.length-1);
////            quickSort(randomArray,0,randomArray.length-1);
//
//            Date end = new Date();
//
//            try {
//                FileWriter fileWriter = new FileWriter(file, true);
//                fileWriter.write("Sorting " + 100 * digit + " Elements: " + (end.getTime() - start.getTime()) + "ms\n");
//                fileWriter.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

//        contains();

        int[] arr = generateRandomArray(100000000,1000000);
        quickSort(arr,0,arr.length-1);
        arr[100000000-1] = 10000000;

        Date start = new Date();
        binarySearch(arr,10000000,0,arr.length-1);
        Date end = new Date();

        System.out.println(90000000 + " found in " + (end.getTime()-start.getTime()) + "ms");
    }

    static void contains(){
        int[] randomArray = generateRandomArray(10000000, 1000000);
        quickSort(randomArray,0,randomArray.length-1);

        randomArray[9000000] = 9000000;
        int target = 9000000;
        Date start = new Date();

        for (int i = 0; i < randomArray.length; i++){
            if (randomArray[i] == target){
                Date end = new Date();
                System.out.println(target + " found in " + (end.getTime()-start.getTime()) + "ms");
                break;
            }
        }


        System.out.println();
    }

    static void binarySearch(int[] array, int x, int low, int high) {

        // Repeat until the pointers low and high meet each other
        int count = 0;
        while (low <= high) {
            count++;
            int mid = low + (high - low) / 2;

            if (array[mid] == x){
                System.out.println("COUNT = " + count);
                return;
            }

            if (array[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }
    }

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // hangi kod veya sistemde +1 kullanılabilirdi ?
            boolean ok = false;
            for (int j = 0; j < array.length - i - 1; j++) { // j aşağıda i yukarda mı olmak zorunda ? kod asıl kodu içine mi alıcak hep, dışarıdan sayıcak ??
                if (array[j + 1] < array[j]) { // j öncü ve asıl kod içeride ve daha derinde ve geriden gelen kod i yukarıda, gerçi doğrusu da böyle gibi
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    ok = true;
                }
            }
            if (!ok)
                break;
        }
    }

    static void selectionSort(int[] array) {
        for (int step = 0; step < array.length - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < array.length; i++) {
                if (array[i] < array[min_idx])
                    min_idx = i;
            }

            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    static void insertionSort(int[] array) {
        for (int step = 1; step < array.length; step++) {
            int key = array[step];
            int j = step - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m; // buraya isaret

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = (start-1); // -1 ?

        for(int j = start; j<end; j++){
            if(arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }

    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    static int[] generateRandomArray(int size, int bound) {
        int[] ans = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            ans[i] = random.nextInt(bound);
        }
        return ans;
    }
}