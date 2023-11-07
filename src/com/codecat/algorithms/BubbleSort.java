
/*
    Author @LwinPhyoAung (codeCat)
    11/1/2023
    Bubble Sort
*/

package com.codecat.algorithms;

public class BubbleSort{

    private BubbleSort(){}

    public static void sort(Comparable[] arr) {
        int N = arr.length;
        for (int x = 0; x<N-1; x++){
            for (int y = 0; y<N-1-x; y++){
                if (HelperMethods.isLess(arr[y+1], arr[y])){
                    HelperMethods.exch(arr, y+1, y);
                }
            }
        }
    }

}
