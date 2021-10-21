package com.blp.practiceproblems;

import java.util.Scanner;

public class PracticeProblem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        PracticeProblem1 menu = new PracticeProblem1();
        menu.palindromes(num);
        System.out.println("Factorial of Number = " + menu.factorial(num));
        menu.fibonacciSeries(num);
    }

    //Check number is palindrome or not
    void palindromes(int num) {
        //Declaration and initialisation if variables
        int rev = 0;
        int org_num = num;
        //Make reverse of number
        while (num != 0) {
            rev = (rev * 10 + num % 10);
            num = num / 10;
        }
        System.out.println(rev);
        if ( rev == org_num ) {
            System.out.println("Number is Palindrome");
        } else
            System.out.println("Number is not Palindrome");
    }

    // Print factorial of given number
    int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return (fact);
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

