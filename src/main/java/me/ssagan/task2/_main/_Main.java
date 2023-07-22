package me.ssagan.task2._main;

import me.ssagan.task1.entity.Student;
import me.ssagan.task1.util.BubbleSort;
import me.ssagan.task2.util.QuickSort;

import java.util.Arrays;

public class _Main {
    public static void main(String args[]) {
        String[] arr = {"apple", "orange", "grape", "banana"};
        System.out.println("исходный массив:");
        for (String str: arr
        ) {
            System.out.println(str);
        }
        QuickSort.sort(arr, 0, arr.length - 1);
        System.out.println("отсортированный массив:");
        for (String str: arr
        ) {
            System.out.println(str);
        }
    }
}
