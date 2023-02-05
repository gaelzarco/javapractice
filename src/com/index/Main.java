package com.index;

import java.awt.*;
import java.util.Arrays;

public class Main {
    private static int add(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;

        System.out.println(numberOne + " + " + numberTwo);
        return result;
    }
    public static void main(String[] args) {
        int result = add(10, 10);
        System.out.println(result);

        // Left off on exercise portion of AmigosCode video
//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//
//        int[] newNumbers = {4, 5, 6, 7, 8};
//        newNumbers[1] = 55;
//        System.out.println("\n" + Arrays.toString(newNumbers));
//        System.out.println(newNumbers.length);
//
//        int[] newNumbers2 = new int[3];
//        Arrays.fill(newNumbers2, -1);
//        newNumbers2[0] = 200;
//
//        System.out.println(Arrays.toString(newNumbers2));

        // Length = 3
//        String[] names = {
//          "Gael",
//          "Chesmeen",
//          "Lucky"
//        };
//
//        if (true) {
//            for (int i = 0; i < names.length; i++) {
//                System.out.println(names[i]);
//            }
//        } else {
//            System.out.println("This is printed when it is false");
//        }
//
//        System.out.println("Code outside if-statement");

//        System.out.println("hello");
//
//        //Increment Practice
//        int integer = 0;
//
//        System.out.println(integer++);
//        System.out.println(++integer);
//        System.out.println(integer--);
//        System.out.println(--integer);
//
//        int n1 = 10;
//        int n2 = 11;
//
//        System.out.println(n1 += n2);
//
//        String text = "Amigoscode";
//        String desc = " is helpful";
//
//        String combined = text + desc;
//
//        System.out.println(combined.isBlank());
//        System.out.println(combined.toLowerCase());
//        System.out.println(combined.toUpperCase());
//
//        int age = 21;
//        Point pointA = new Point(10, 10);
//        System.out.println("pointA = " + pointA);
//        pointA.move(11, 15);
//        System.out.println("pointA moved to: " + pointA.getX() + " " + pointA.getY());
    }
}
