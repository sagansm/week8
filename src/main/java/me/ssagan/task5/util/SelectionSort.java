package me.ssagan.task5.util;

public class SelectionSort {
    public static void sort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //pos - индекс наименьшего элемента
            int pos = i;
            //pos - наименьший элемент
            String min = arr[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < arr.length; j++) {
                if (countOperations(arr[j]) < countOperations(min)) {
                    pos = j;
                    min = arr[j];
                }
            }
            //меняем местами наименьший с arr[i]
            arr[pos] = arr[i];
            arr[i] = min;
        }
    }

    private static int countOperations(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                counter++;
            }
        }
        return counter;
    }
}
