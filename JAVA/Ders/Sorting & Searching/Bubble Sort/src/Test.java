import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100, 100);
        mergeSort(arr,0,arr.length-1);
        System.out.println("x");
    }

    static void bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean ok = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
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

    static int[] generateRandomArray(int size, int bound) {
        int[] ans = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            ans[i] = random.nextInt(bound);
        }
        return ans;
    }

    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int swap = array[min];
            array[min] = array[i];
            array[i] = swap;

        }
    }

    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }

    static void mergeSort(int[] array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }

    private static void merge(int[] array, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] M = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < n2; j++) {
            M[j] = array[m + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2){
            if (L[i] < M[j]){
                array[k] = L[i];
                i++;
            }else{
                array[k] = M[j];
                j++;
            }
            k++;
        }

        while (j < n2){
            array[k] = M[j];
            j++;
            k++;
        }
        while (i < n1){
            array[k] = L[i];
            i++;
            k++;
        }
    }

    private static void quickSort(int[] array, int start, int end){
        if (end < start){
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot-1);
            quickSort(array, pivot+1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start-1;

        for (int j = start; j < end; j++){
            if (array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp2 = array[i+1];
        array[i+1] = array[end];
        array[end] = temp2;

        return i+1;
    }
}
