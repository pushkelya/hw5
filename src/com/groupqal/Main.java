package com.groupqal;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose exercise(1-4): ");
        int a = input.nextInt();
        switch (a) {
            case 1: {
                System.out.println("Enter array length: ");

                int len = input.nextInt();
                int[] arr = array(len);
                System.out.println("Your array: " + Arrays.toString(arr));

                System.out.print("\nReversed array elements: ");
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }

                break;
            }
            case 2: {
                System.out.println("Enter array length: ");
                int len = input.nextInt();
                int[] arr = array(len);
                int p = 0;

                System.out.println("Your array: " + Arrays.toString(arr));
                System.out.println("The quantity of odd numbers: " + quantity(arr, len, p));
                System.out.println("Sum of odd numbers: " + sum(arr, len, p));
                break;
            }
            case 3:{
                System.out.println("Enter arrays length: ");
                int len = input.nextInt();
                int[] first = arrayF(len);
                int[] second = arrayS(len);
                int[] third = arrayT(len, first, second);
                int i = 0;
                System.out.println("First array: " + Arrays.toString(first));
                System.out.println("Second array: " + Arrays.toString(second));
                System.out.print("Third array: " + Arrays.toString(third));


                break;
            }
            case 4: {
                System.out.println("Enter array length: ");
                int len = input.nextInt();
                int[] arr = array(len);
                int[] negative = new int[arr.length];
                int[] positive = new int[arr.length];
                boolean positiveNum = true;
                int counterForNegative = 0;
                int counterForPositive = 0;


                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] > 0){
                        positiveNum = true;
                        positive[counterForPositive++] = arr[i];
                    }
                    else{
                        negative[counterForNegative++] = arr[i];
                    }
                }
                System.out.print("Your array: " + Arrays.toString(arr));
                System.out.print("\nPositive array: ");
                for (int i = 0; i < positive.length & positive[i] != 0; i++) {
                    System.out.print(positive[i] + " ");
                }
                System.out.print("\nNegative array: ");
                for (int i = 0; i < negative.length & negative[i] != 0; i++) {
                    System.out.print(negative[i] + " ");
                }

                break;
            }
            default:
                System.out.println("Invalid number!");
        }

    }
    static int[] array (int len){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30) - 15;
        }
        return arr;
    }
    public static int quantity(int[] arr, int len, int p) {
        for(int i = 0; i < len; i++) {
            if(arr[i] % 2 != 0){
                p++;
            }
        }
        return p;
    }

    public static int sum(int[] arr, int len, int p) {
        for(int i = 0; i < len; i++) {
            if(arr[i] % 2 != 0){
                p += arr[i];
            }
        }
        return p;
    }
    public static int[] arrayF(int len) {
        int[] first = new int[len];

        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * 30) - 15;
        }
        return first;
    }
    public static int[] arrayS(int len) {
        int[] second = new int[len];

        for (int i = 0; i < second.length; i++) {
            second[i] = (int) (Math.random() * 30) - 15;
        }
        return second;
    }
    public static int[] arrayT(int len, int[] first, int[] second) {
        int[] third = new int[len];
        for(int i = 0; i < third.length; i++){
            third[i] = first[i] + second[i];
        }
        return third;
    }
}


