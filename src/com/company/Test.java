package com.company;

public class Test {

    public static void main(String[] args) {

        int[] array = new int[1_000_000_000];

        for (int i = 0; i < 1_000_000_000; i++) {
            array[i] = i + 1;
        }

        int num = 999_700_896;


      //  long start = System.currentTimeMillis();

        // Первый способ поиска
/*        for (int i = 0; i <= 999_999_999; i++) { // for (int i = 999_999; i >= 0; i--)
            if (num == array[i]) System.out.println("Number " + array[i]);
        }*/

        // Второй способ
        int firstArr = 0;
        int lastArr = 999_999_999;

        int mid;

        while (firstArr < lastArr) {
            mid = (firstArr + lastArr) / 2; // 499_999_999
            if (mid == num) {
                System.out.println("Yes. Number is:" + mid);
            } else if (mid > num) {
                lastArr = mid - 1;
            } else if (mid < num) {
                firstArr = mid + 1; // 500_000_000
            }
        }


/*        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Time: " + elapsed);*/
    }
}
