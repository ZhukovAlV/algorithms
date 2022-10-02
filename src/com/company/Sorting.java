package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
       // List<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 2, 4, 3, 1, 5, 6, 7, 8, 9));
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);

        System.out.println("Before");
        System.out.println(arrayList);



        /*int[] shelfList = new int[10];
        for (int i = 0; i < shelfList.length; i++) {

            int min = 0; // Здесь номер индекса
            for (int j = 1; j < arrayList.size(); j++) {
                if (arrayList.get(j) < arrayList.get(min)) min = j;
            }

            // Добавляем во второй массив
            shelfList[i] = arrayList.get(min);

            // Удаляем из первого массива
            arrayList.remove(min);
        }

        System.out.println("After");
        // System.out.println(Arrays.toString(shelfList));
        for (int i = 0; i < shelfList.length; i++) {
            System.out.print(shelfList[i]);
            System.out.print(" ");
        }*/

        // Сортировка выбором SelectionSorter
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
        System.out.println(Arrays.toString(array));

    }



}
