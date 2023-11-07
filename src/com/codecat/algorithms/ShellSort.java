/*
    Author @LwinPhyoAung (codeCat)
    11/4/2023
    Shell Sort
*/

package com.codecat.algorithms;

import org.w3c.dom.html.HTMLLegendElement;

public class ShellSort {

    private ShellSort(){}

    public static void sort(Comparable[] arr){
        //if (HelperMethods.isSort(arr)) return;
        int N = arr.length;
        int h = 1;
        while (h<N/3) h=3*h+1;
        while (h>=1){
            for (int x = h; x<N; x++){


//                for (int y = x; y>=h && HelperMethods.isLess(arr[y], arr[y-h]); y-=h){
//                    HelperMethods.exch(arr, y, y-h);
//                }
                int y = x;
                while (y>=h && HelperMethods.isLess(arr[y], arr[y-h])){
                    HelperMethods.exch(arr, y, y-h);
                    y-=h;
                }

            }
            h/=3;
        }
    }

}
