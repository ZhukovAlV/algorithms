package com.company.old;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    /**
     * Метод нахождения факториала
     */
    public static int factorial(int x) {
        int i = x - 1;

        while(i > 1) {
            x = x * i;
            i--; // i = i -1;
        }

        return x;
    }
}
