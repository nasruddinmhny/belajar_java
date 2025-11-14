/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Informatika
 */
public class MergeSort {

    public static void mergeSort(int[] data) {
        if (data.length <= 1) {
            return;
        }

        int mid = data.length / 2;

        int[] left = new int[mid];
        int[] right = new int[data.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = data[i];
        }
        for (int i = mid; i < data.length; i++) {
            right[i - mid] = data[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(data, left, right);
    }

    private static void merge(int[] data, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                data[k++] = left[i++];
            } else {
                data[k++] = right[j++];
            }
        }

        while (i < left.length) {
            data[k++] = left[i++];
        }
        while (j < right.length) {
            data[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] angka = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(angka);

        for (int v : angka) {
            System.out.print(v + " ");
        }
    }
}
