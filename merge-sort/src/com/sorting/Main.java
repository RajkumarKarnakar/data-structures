package com.sorting;

import java.util.Arrays;

import static com.sorting.Merge.sort;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 8, 1, 4, 6, 7, 9, 0, 2, 3};
        System.out.println("Array " + Arrays.toString(numbers));
        sort(numbers);
        System.out.println("Sorted array " + Arrays.toString(numbers));
        System.out.println("--------2nd Array---------");
        int[] number = {-10, 40, 50, -80, 0, 100, 100, -100, -9};
        System.out.println("Array " + Arrays.toString(number));
        sort(number);
        System.out.println("Sorted array " + Arrays.toString(number));
    }
}
