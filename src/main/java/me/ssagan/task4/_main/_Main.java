package me.ssagan.task4._main;

import me.ssagan.task4.util.InsertionSort;

import java.util.Arrays;

public class _Main {
    public static void main(String args[]) {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        System.out.println("исходный массив:");
        for (String str: arr
        ) {
            System.out.println(str);
        }
        InsertionSort.sort(arr);
        System.out.println("отсортированный массив:");
        for (String str: arr
        ) {
            System.out.println(str);
        }
    }
}
