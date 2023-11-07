
/*
    Author @LwinPhyoAung (codeCat)
    11/1/2023
    Selection Sort
*/

package com.codecat.algorithms;

public class SelectionSort {

    private SelectionSort(){}

    public static void sort(Comparable[] arr){
        int N = arr.length;
        for (int x = 0; x<N-1; x++){
            int min = x;
            for (int y = x+1; y<N; y++){
                if (HelperMethods.isLess(arr[y], arr[min])){
                    min=y;
                }
            }
            HelperMethods.exch(arr, min, x);
        }
    }

}
