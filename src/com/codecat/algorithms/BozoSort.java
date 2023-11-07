/*
    Author @LwinPhyoAung (codeCat)
    11/2/2023
    Bozo Sort
*/

package com.codecat.algorithms;

import java.util.Random;

public class BozoSort {

    private BozoSort(){}

    public static void sort(Comparable[] arr){
        int N = arr.length;
        Random ran = new Random();
        while (!HelperMethods.isSort(arr)){
            HelperMethods.exch(arr, ran.nextInt(N), ran.nextInt(N));
        }
    }

}
