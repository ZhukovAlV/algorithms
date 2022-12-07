package com.company.old;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        int[] array = new int[1_000_000];

        // Замеряем время
        long start1 = System.currentTimeMillis();

        // Наполняю массив
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Окончание работы цикла
        long finish1 = System.currentTimeMillis();

        long elapsed1= finish1 - start1;
        System.out.println("Time, mc: " + elapsed1);


        // Вывод массива в консоль
        for (int num: array) {
            //  System.out.println(num);
        }



        List list = new ArrayList();

        // Замеряем время
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.add(i + 1);
        }

        // Окончание работы цикла
        long finish2 = System.currentTimeMillis();


        long elapsed2 = finish2 - start2;
        System.out.println("Time, mc: " + elapsed2);

        for (Object obj : list) {

        }

    }
}
