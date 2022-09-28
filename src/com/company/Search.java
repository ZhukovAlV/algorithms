package com.company;

public class Search {

    static int count = 0;

    public static void main(String[] args) {


        // Массив чисел
        int[] balls = new int[1_000_000_000];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = i + 1;
        }

        // Загаданное число
        int guess = 999_700_896;

        // Замеряем время
        long start = System.currentTimeMillis();

        // Раскомментируем необходимый алгоритм
        //System.out.println(simpleSearch(balls, guess));
        System.out.println(binarySearch(balls, guess));

        System.out.println("Count:" + count);

        // Окончание работы цикла
        long finish = System.currentTimeMillis();

        long elapsed = finish - start;
        System.out.println("Time, mc: " + elapsed);

        count = 0;
    }

    static int simpleSearch(int[] mas, int guess) {
        for (int i = 0; i < mas.length; i++) {
            count++;
            if (guess == mas[i]) {
                return i;
            }
        }

        return -1;
    }

    static int binarySearch(int[] mas, int guess) {

        int low = 0;
        int high = mas.length - 1;

        while (low <= high) {
            count++;
            int mid = (low + high) / 2;

            if (mas[mid] == guess) return mas[mid];
            else if (mas[mid] < guess) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

}
