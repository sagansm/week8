package me.ssagan.task2.util;

import java.util.Arrays;

public class QuickSort {
    public static void sort(String[] arr, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (arr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        String border = arr[middle];

        //разделяем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (arr[i].compareTo(border) < 0) {
                i++;
            }
            while (arr[j].compareTo(border) > 0) {
                j--;
            }
            if (i <= j) {
                String swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }
        //рекурсия для сортировки левой и правой части
        if (low < j) sort(arr, low, j);
        if (high > i) sort(arr, i, high);
    }
}
