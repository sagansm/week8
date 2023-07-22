package me.ssagan.task4.util;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(String[] arr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < arr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            String swap = arr[i];
            for (j = i; j > 0 && countGlasnii(swap) < countGlasnii(arr[j - 1]); j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                arr[j] = arr[j - 1];
            }
            arr[j] = swap;
        }
    }

    private static int countGlasnii(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter++;
            }
        }
        return counter;
    }
}
