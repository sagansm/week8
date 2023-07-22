package me.ssagan.task3._main;

import me.ssagan.task3.util.MergeSort;

import java.util.Arrays;

public class _Main {
    public static void main(String args[]) {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        System.out.println("исходный массив:");
        for (String str: arr
        ) {
            System.out.println(str);
        }
        String[] res = MergeSort.sort(arr);
        System.out.println("отсортированный массив:");
        for (String str: res
        ) {
            System.out.println(str);
        }
    }
}
