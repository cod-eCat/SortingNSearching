
/*
    Author @LwinPhyoAung (codeCat)
    11/1/2023
    Cocktail Sort
*/

package com.codecat.algorithms;

public class CocktailSort {

    private CocktailSort(){}

    public static void sort(Comparable[] arr){
        int N = arr.length;
        for (int x = 0; x<N; x++){
            for (int y = x; y<N-1-x; y++){
                if (HelperMethods.isLess(arr[y+1], arr[y])){
                    HelperMethods.exch(arr, y, y+1);
                }
            }
            for (int y = N-2-x; y>0; y--){
                if (HelperMethods.isLess(arr[y], arr[y-1])){
                    HelperMethods.exch(arr, y, y-1);
                }
            }
        }
    }

}
