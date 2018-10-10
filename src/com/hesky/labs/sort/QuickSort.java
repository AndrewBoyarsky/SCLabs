/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.sort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middleIndex = low + (high - low) / 2;
        int middleValue = array[middleIndex];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < middleValue) {
                i++;
            }

            while (array[j] > middleValue) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Array");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(x));
    }
}
