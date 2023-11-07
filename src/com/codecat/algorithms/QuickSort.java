
/*
    Author @LwinPhyoAung (codeCat)
    11/2/2023
    Quick Sort
*/

package com.codecat.algorithms;

public class QuickSort {

    private final static int CUTOFF = 10;

    private QuickSort(){}

    public static void sort(Comparable[] arr){
        //if (HelperMethods.isSort(arr)) return;
        //HelperMethods.shuffle(arr);

        sort(arr, 0, arr.length-1);
    }

    private static void sort(Comparable[] arr, int lo, int hi){

        if (hi<=(lo+(CUTOFF-1))){
            HelperMethods.insertionSort(arr, lo, hi);
            return;
        }

        //if (lo>=hi) return;
        int parI = partation(arr, lo, hi);
        sort(arr, lo, parI-1);
        sort(arr, parI+1, hi);
    }

//    private static int partation(Comparable[] arr, int lo, int hi){
//        Comparable pivot = arr[lo];
//        int i = lo;
//        int j = hi+1;
//        while (true){
//            while (HelperMethods.isLess(arr[++i], pivot)){
//                if (i==hi) break;
//            }
//            while (HelperMethods.isLess(pivot, arr[--j])){
//                if (j==lo) break;
//            }
//            if (i>=j) break;
//            HelperMethods.exch(arr, i, j);
//        }
//        HelperMethods.exch(arr, lo, j);
//        return j;
//    }

    private static int partation(Comparable[] arr, int lo, int hi){
        Comparable pivot = arr[hi];
        int sPointer = lo;
        for (int x = 0; x<hi; x++){
            if (HelperMethods.isLess(arr[x], pivot)){
                HelperMethods.exch(arr, x, sPointer);
                sPointer+=1;
            }
        }
        HelperMethods.exch(arr, hi, sPointer);
        return sPointer;
    }

}
