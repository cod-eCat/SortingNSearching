
/*
    Author @LwinPhyoAung (codeCat)
    11/1/2023
    Merge Sort
*/

package com.codecat.algorithms;

public class MergeSort {

    private final static int CUTOFF = 7;

    private MergeSort(){}

    public static void sort(Comparable[] arr){
        // if (HelperMethods.isSort(arr)) return;
        Comparable[] aux = new Comparable[arr.length];
        sort(arr, aux, 0, arr.length-1);
    }

    private static void sort(Comparable[] arr, Comparable[] aux, int lo, int hi){

        if (hi<=(lo+(CUTOFF-1))){
            HelperMethods.insertionSort(arr, lo, hi);
            return;
        }

        if (lo>=hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(arr, aux, lo, mid);
        sort(arr, aux, mid + 1, hi);
        merge(arr, aux, lo, mid, hi);

    }

    //First Method
    private static void merge(Comparable[] arr, Comparable[] aux, int lo, int mid, int hi){
        for (int x = lo; x<=hi; x++){
            aux[x] = arr[x];
        }
        int i = lo;
        int j = mid+1;
        for (int k=lo; k<=hi; k++){
            if (i>mid){
                arr[k] = aux[j++];
            } else if (j>hi){
                arr[k] = aux[i++];
            } else if (HelperMethods.isLess(aux[j], aux[i])){
                arr[k] = aux[j++];
            } else {
                arr[k] = aux[i++];
            }
        }

    }


//    Second Method
//    private static void merge(Comparable[] arr, Comparable[] aux, int lo, int mid, int hi){
//        for (int x = lo; x<=hi; x++){
//            aux[x] = arr[x];
//        }
//        int i = lo;
//        int j = mid+1;
//        int k = lo;
//        while (i <= mid && j <= hi){
//            if(HelperMethods.isLess(aux[j], aux[i])){
//                arr[k++] = aux[j++];
//            } else{
//                arr[k++] = aux[i++];
//            }
//        }
//
//        while (i<=mid){
//            arr[k++] = aux[i++];
//        }
//        while (j<=hi){
//            arr[k++] = aux[j++];
//        }
//
//    }

}
