package com.blp.practiceproblems;

import java.util.Scanner;

public class PracticeProblem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        PracticeProblem2 menu = new PracticeProblem2();
        System.out.println(menu.factorial(num));
    }

    //Print factorial of given number
    int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return (fact);
    }
}
