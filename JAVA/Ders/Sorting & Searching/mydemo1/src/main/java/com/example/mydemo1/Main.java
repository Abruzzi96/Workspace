package com.example.mydemo1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random(15);
        int[] newArr = new int[8];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = rd.nextInt(15);
            System.out.print(newArr[i] + " ");
        }
        mergeSort(newArr);
        System.out.println();
        System.out.println(Arrays.toString(newArr));
    }


    static void mergeSort(int[] newArr) {
        int Length = newArr.length;
        if (Length < 2) {
            return;
        }
        int midIndex = Length / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[Length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = newArr[i];
        }
        for (int i = midIndex; i < Length; i++) {
            rightHalf[i - midIndex] = newArr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(newArr, leftHalf, rightHalf);

    }

    private static void merge(int[] newArr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                newArr[k] = leftHalf[i];
                i++;
            } else {
                newArr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            newArr[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            newArr[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
