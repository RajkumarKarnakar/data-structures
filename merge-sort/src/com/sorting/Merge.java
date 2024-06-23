package com.sorting;

public class Merge {
    public static void sort(int[] a) {
        mergeSort(a, a.length);
    }

    private static void mergeSort(int[] arr, int n) {
        if (n < 2) return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        System.arraycopy(arr, 0, l, 0, mid);
        if (n - mid >= 0) System.arraycopy(arr, mid, r, mid - mid, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(arr, l, r, mid, n - mid);
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}