package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++)
                System.out.print(" ");

            for (int j = 2 * i - 1; j >= i; j--)
                System.out.print(j - i + 1);

            for (int j = i; j < 2 * i - 1; j++)
                System.out.print(j - i + 2);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
