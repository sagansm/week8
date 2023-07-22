package me.ssagan.task1._main;


import me.ssagan.task1.entity.Student;
import me.ssagan.task1.util.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student ("Иванов", 4.5));
        arr.add(new Student ("Петров", 3.7));
        arr.add(new Student ("Сидоров", 4.2));
        arr.add(new Student ("Козлов", 5.0));
        arr.add(new Student ("Смирнов", 3.9));
        System.out.println("исходный список студентов:");
        for (Student student: arr
             ) {
            System.out.println(student.toString());
        }
        BubbleSort.sort(arr);
        System.out.println("отсортированный список студентов:");
        for (Student student: arr
        ) {
            System.out.println(student.toString());
        }
    }
}
