package com.company;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        // Статический массив
/*        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i+1;

        }

        System.out.println(arr[0]);*/


        // Динамический массив
/*        ArrayList list = new ArrayList();

        for (int i = 0; i < 1_000; i++) {
            list.add(i+1);
        }
        list.set(999, 1);

        System.out.println(list.get(999));*/

        ArrayList list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            if (i == 2) continue;
            list.add(i+1);
        }

        list.forEach(System.out::println);

    }

}
