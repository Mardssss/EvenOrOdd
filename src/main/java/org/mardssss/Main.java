package org.mardssss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        repeat();
    }
    public static void repeat(){
        Scanner number = new Scanner(System.in);
        System.out.println("Write a number to check if is even or odd");
        int numberToCheck = number.nextInt();
        if (numberToCheck % 2 == 0){
            System.out.println("The number "+numberToCheck+" is even");
        }else {
            System.out.println("The number "+numberToCheck+" is odd");
        }
        repeat();
    }
}