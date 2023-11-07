
/*
    Author @LwinPhyoAung (codeCat)
    11/4/2023
    Heap Sort
*/

package com.codecat.algorithms;

public class HeapSort {

    private HeapSort(){}

    public static void sort(Comparable[] arr){
        //if (HelperMethods.isSort(arr)) return;
        int N = arr.length;
        for (int x = N/2; x>=0; x--){
            sink(arr, x, N);
        }
        while (N>1){
            HelperMethods.exch(arr, 0, --N);
            sink(arr, 0, N);
        }

    }

    private static void sink(Comparable[] arr, int e, int N){
        while ((2*e)+1<=N-1){
            int y = (2*e)+1;
            if (y<N-1 && HelperMethods.isLess(arr[y], arr[y+1])){
                y += 1;
            }
            if (!HelperMethods.isLess(arr[e], arr[y])){
                break;
            }
            HelperMethods.exch(arr, e, y);
            e = y;
        }
    }

}
