package com.blp.practiceproblems;

import java.util.Scanner;

public class PracticeProblem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        PracticeProblem3 menu = new PracticeProblem3();
        menu.fibonacciSeries(num);
    }

    // Print Fibonacci Series
    void fibonacciSeries(int num) {
        //Declaration and initialisation if variables
        int num1 = 0;
        int num2 = 1;
        System.out.print("Fibonacci Series = " + num1 + " " + num2 + " ");
        int sum;

        //Use For Loop To Get Digits Of Fibonacci Series
        for (int i = 0; i <= num; i++) {
            sum = (num1 + num2);
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
        }

    }
}
