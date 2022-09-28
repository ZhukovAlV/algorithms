package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

    /*
    Давайте попробуем отсортировать массив по возрастанию. Что это значит для нас?
    Это значит, что имея два элемента (например, a=6, b=5), мы должны переставить местами a и b,
    если a больше чем b (если a > b).
    Что для нас это значит при работе с коллекцией по индексу (как в случае с массивом)?
    Это значит, что если элемент с индексом а больше, чем элемент с индексом b, (array[a] > array[b]),
    такие элементы надо поменять местами. Перемену мест часто называют swap.
    https://habr.com/ru/post/195482/ для изучения
     */

    // 1 попытка поменять местами элементы (т.е. пройдемся один раз от 1 до N)
/*    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i-1);
            }
        }

        System.out.println(Arrays.toString(array));
    }
    */

    // 2 попытка поменять местами элементы (добавляем вложенный цикл)
/*    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j-1);
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }*/

    // Улучшим сортировку: Bubble Sorting
/*    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }*/

    // Как еще можно
/*    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 2, 10, 3, 1, 2, 5));
        System.out.println(arrayList);

        int[] newArray = new int[arrayList.size()];
        for (int i = 0; i < newArray.length; i++) {
            int min = 0;
            for (int j = 1; j < arrayList.size(); j++) {
                if (arrayList.get(j) < arrayList.get(min)) min = j;
            }
            newArray[i] = arrayList.get(min);

            arrayList.remove(min);
        }

        System.out.println(Arrays.toString(newArray));
    }*/

    /* Сортировка выбором SelectionSorter
    Идея алгоритма: ищем минимальный элемент в массиве и меняем его местами с элементом,
    находящимся в позиции ноль.
     */
    public static void main(String[] args) {
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

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
