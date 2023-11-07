package com.codecat.algorithms;

/*
    Author @LwinPhyoAung (codeCat)
    11/2/2023
    Bogo Sort
*/

public class BogoSort {

    private BogoSort(){}

    public static void sort(Comparable[] arr){
        while (!HelperMethods.isSort(arr)) HelperMethods.shuffle(arr);
    }

}
