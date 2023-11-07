
/*
    Author @LwinPhyoAung (codeCat)
    11/1/2023
*/

package com.codecat.algorithms;

import java.util.Random;

public class HelperMethods {

    private HelperMethods(){}

    public static boolean isLess(Comparable x, Comparable y){
        return x.compareTo(y)<0;
    }

    public static boolean isEqual(Comparable x, Comparable y){
        return x.compareTo(y)==0;
    }

    public static void exch(Comparable[] arr, int x, int y){
        Comparable temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static boolean isSort(Comparable[] arr){
        int N = arr.length;
        for (int x = 0; x<N-1; x++){
            if (isLess(arr[x+1], arr[x])){
                return false;
            }
        }
        return true;
    }

    public static void shuffle(Comparable[] arr){
        int N = arr.length;
        for (int i = 1; i<N; i++){
            int ran = new Random().nextInt(i+1);
            exch(arr, i, ran);
        }
    }

    public static void insertionSort(Comparable[] arr, int lo, int hi){
        for (int x = lo+1; x<=hi; x++){
            int y = x;
            while (y>lo && isLess(arr[y], arr[y-1])){
                HelperMethods.exch(arr, y, y-1);
                y-=1;
            }
        }
    }

    public static int indexOf(Comparable[] arr, Comparable key, int lo, int hi){
        while (lo<=hi){
            int mid = lo+(hi-lo)/2;
            if (isLess(key, arr[mid])){
                hi=mid-1;
            } else if (isLess(arr[mid], key)){
                lo=mid+1;
            } else {
                return mid;
            }
        }
        return lo;
    }

}
