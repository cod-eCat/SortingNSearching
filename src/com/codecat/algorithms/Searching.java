
/*
    Author @LwinPhyoAung (codeCat)
    11/1/2023
    Linear Search, Binary Search, TernarySearch, Jump Search, Exponential Search
*/

package com.codecat.algorithms;

public class Searching {

    private Searching(){};

    public static int LinearSearch(Comparable[] arr, Comparable key){
        int N = arr.length;
        for (int x = 0; x<N; x++){
            if (HelperMethods.isEqual(arr[x], key)){
                return x;
            }
        }
        return -1;
    }

    public static int BinarySearch(Comparable[] arr, Comparable key){
        return BinarySearch(arr, key, 0, arr.length-1);
    }

    public static int BinarySearch(Comparable[] arr, Comparable key, int start, int end){
        // if (!HelperMethods.isSort(arr)) throw new IllegalArgumentException("Only Allow Sorted Array");
        while (start<=end){
            int mid = start+(end-start)/2;
            if (HelperMethods.isLess(key, arr[mid])){
                end = mid-1;
            } else if (HelperMethods.isLess(arr[mid], key)){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int TernarySearch(Comparable[] arr, Comparable key){
        // if (!HelperMethods.isSort(arr)) throw new IllegalArgumentException("Only Allow Sorted Array!");
        return TernarySearch(arr, key, 0, arr.length-1);

    //        int l = 0;
    //        int h = arr.length-1;
    //        while (l<=h){
    //            int midF = l+(h-l)/3;
    //            int midS = h-(h-l)/3;
    //            if (HelperMethods.isEqual(key, arr[midF])){
    //                return midF;
    //            } else if (HelperMethods.isEqual(key, arr[midS])){
    //                return midS;
    //            }
    //            if (HelperMethods.isLess(key, arr[midF])){
    //                h = midF-1;
    //            } else if (HelperMethods.isLess(arr[midS], key)){
    //                l = midS+1;
    //            } else {
    //                l = midF+1;
    //                h = midS-1;
    //            }
    //        }
    //        return -1;
    }

    private static int TernarySearch(Comparable[] arr, Comparable key, int l, int h){
        // if (!HelperMethods.isSort(arr)) throw new IllegalArgumentException("Only Allow Sorted Array");
        if (l>h){return -1;}
        int midF = l+(h-l)/3;
        int midS = h-(h-l)/3;
        if (HelperMethods.isEqual(arr[midF], key)){
            return midF;
        } else if (HelperMethods.isEqual(arr[midS], key)){
            return midS;
        }

        if (HelperMethods.isLess(key, arr[midF])){
            return TernarySearch(arr, key, l, midF-1);
        } else if (HelperMethods.isLess(arr[midS], key)){
            return TernarySearch(arr, key, midS+1, h);
        } else {
            return TernarySearch(arr, key, midF+1, midS-1);
        }
    }

    public static int JumpSearch(Comparable[] arr, Comparable key){
//        if (!HelperMethods.isSort(arr)) throw new IllegalArgumentException("Only Allow Sorted Array");
//        int N = arr.length;
//        int M = (int) Math.floor(Math.sqrt(N));
//        int prev = 0;
//        for (int x = M-1; HelperMethods.isLess(arr[x], key); x = Math.min(M, N)-1){
//            prev = M;
//            M+=M;
//            if (prev>=N) return -1;
//        }
//        for (int x = prev; x < Math.min(M, N); x++){
//            if (HelperMethods.isEqual(key, arr[x])) return x;
//        }

        int N = arr.length;
        int M = (int) Math.floor(Math.sqrt(N));
        int prev = 0;
        while (M<N && HelperMethods.isLess(arr[M], key)){
            prev = M;
            M += M;
        }
        return BinarySearch(arr, key, prev, Math.min(M, N-1));
    }

    public static int ExponentialSearch(Comparable[] arr, Comparable key){
        //if (!HelperMethods.isSort(arr)) throw new IllegalArgumentException("Only Allow Sorted Array");
        int e = 1;
        int N = arr.length;
        while (e<N && HelperMethods.isLess(arr[e], key)){
            e = e*2;
        }
        return BinarySearch(arr, key, e/2, Math.min(e, N-1));

    }

}
