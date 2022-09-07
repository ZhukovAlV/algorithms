package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] masNum = new int[] {1, 2, 3, 4, 5};
        System.out.println(binary_search(masNum, 6));
    }

    static int binary_search(int[] mas, int num) {
        int low = mas[0];
        int high = mas[mas.length - 1];

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = mas[mid];

            if (guess == num) return guess;
            else if (guess < num) low = mid;
            else high = mid;
        }

        return -1;
    }
}
