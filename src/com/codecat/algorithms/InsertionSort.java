
/*
    Author @LwinPhyoAung (codeCat)
    11/1/2023
    Insertion Sort
*/

package com.codecat.algorithms;

public class InsertionSort {

    private InsertionSort(){}

    public static void sort(Comparable[] arr){
        int N = arr.length;
        for (int x = 1; x<N; x++){

            int y = x;
            while (y>0 && HelperMethods.isLess(arr[y], arr[y-1])){
                HelperMethods.exch(arr, y, y-1);
                y-=1;
            }

//            Using Binary Search
//            int ind = HelperMethods.indexOf(arr, arr[x], 0, x-1);
//            Comparable val = arr[x];
//            for (int z = x; z>ind; z--){
//                arr[z] = arr[z-1];
//            }
//            arr[ind] = val;

        }
    }

}
