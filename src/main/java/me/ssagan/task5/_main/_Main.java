package me.ssagan.task5._main;

import me.ssagan.task5.util.SelectionSort;

public class _Main {
    public static void main(String args[]) {
        String[] arr = {"5+6+32=43",
                "1+1=2",
                "(3+5)*4*21=483",
                "((21-20)*(32-30))/2=1"};
        System.out.println("исходный массив:");
        for (String str : arr
        ) {
            System.out.println(str);
        }
        SelectionSort.sort(arr);
        System.out.println("отсортированный массив:");
        for (String str : arr
        ) {
            System.out.println(str);
        }
    }
}
