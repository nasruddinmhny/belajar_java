/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Informatika
 */
public class mergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return; // sudah terurut
        int[] temp = new int[arr.length];          // array bantu untuk merging
        mergeSortRecursive(arr, 0, arr.length - 1, temp);
    }
    
    // Fungsi rekursif: urutkan arr[lo..hi]
    private static void mergeSortRecursive(int[] arr, int lo, int hi, int[] temp) {
        if (lo >= hi) return; // basis: satu elemen atau tidak ada
        int mid = lo + (hi - lo) / 2;

        // Bagi: urutkan kiri dan kanan
        mergeSortRecursive(arr, lo, mid, temp);
        mergeSortRecursive(arr, mid + 1, hi, temp);

        // Jika bagian kiri sudah semua <= bagian kanan awal, tidak perlu merge
        if (arr[mid] <= arr[mid + 1]) {
            return; // optimization: already in order
        }

        // Gabungkan kedua bagian yang sudah terurut
        merge(arr, lo, mid, hi, temp);
    }
}
