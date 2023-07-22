package me.ssagan.task1.util;

import me.ssagan.task1.entity.Student;

import java.util.ArrayList;

public class BubbleSort {
    public static void sort(ArrayList<Student> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j + 1).getScore() > arr.get(j).getScore()) {
                    Student swap = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, swap);
                }
            }
        }
    }
}
