package com.company;

public class Main {

    public static void main(String[] args) {

        int[] balls = new int[1_000_000_000];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = i + 1;
        }
        int guess = 100_600_999;

        // Замеряем время
        long start = System.currentTimeMillis();

        // System.out.println(simpleSearch(balls, guess));
        System.out.println(binarySearch(balls, guess));

        // Окончание работы цикла
        long finish = System.currentTimeMillis();

        long elapsed = finish - start;
        System.out.println("Time, mc: " + elapsed);

    }

    static int simpleSearch(int[] mas, int guess) {
        for (int i = 0; i < mas.length; i++) {
            if (guess == mas[i]) {
                System.out.println(i + " Yes");
                return i;
            }
        }

        return -1;
    }

    static int binarySearch(int[] mas, int guess) {
        int low = 0;
        int high = mas.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mas[mid] == guess) return mas[mid];
            else if (mas[mid] < guess) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }

}
