package com.company;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {

        // Статический массив

        int[] arrNum = new int[10];

        for (int i = 0; i < 10; i++) {
            arrNum[i] = i + 1;
        }

        System.out.println(arrNum[0]);
        System.out.println(arrNum[9]);

        arrNum = new int[11];
        for (int i = 0; i < 11; i++) {
            arrNum[i] = i + 1;
        }

        System.out.println(arrNum[10]);


        // Динамический массив

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        list.add(3);
    }
}
