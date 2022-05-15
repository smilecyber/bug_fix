package com.company;

import java.util.Scanner;

public class Apple {
    // Emma wanted to buy apples from the supermarket.
    // One of the employees gave Emma 7 apples that looked exactly the same,
    // but said that one of them was heavier than the others.
    // The weights of the others were exactly the same.
    // Emma told the employee that she would give the apples free of charge
    // if she could tell which apple was heavier by using the equal arm scales
    // next to them twice.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first apple weight: ");
	    int apple1 = scanner.nextInt();
        System.out.println("Enter second apple weight: ");
        int apple2 = scanner.nextInt();
        System.out.println("Enter third apple weight: ");
        int apple3 = scanner.nextInt();
        System.out.println("Enter fourth apple weight: ");
        int apple4 = scanner.nextInt();
        System.out.println("Enter fifth apple weight: ");
        int apple5 = scanner.nextInt();
        System.out.println("Enter sixth apple weight: ");
        int apple6 = scanner.nextInt();
        System.out.println("Enter seventh apple weight: ");
        int apple7 = scanner.nextInt();

        int sum1 = apple1 + apple2 + apple3;
        int sum2 = apple4 + apple5 + apple6;

        if (sum1 == sum2){
            System.out.println("finded apple is apple7 : " + apple7);
        }else {
            if (sum1> sum2){
                if (apple1 == apple2){
                    System.out.println("finded apple is apple3 : " + apple3);
                }else {
                    if (apple1> apple2){
                        System.out.println("finded apple is apple1 : " + apple1);
                    }else {
                        System.out.println("finded apple is apple2 : " + apple2);
                    }
                }
            }else {
                if (apple4 == apple5){
                    System.out.println("finded apple is apple6 : " + apple6);
                }else {
                    if (apple4> apple5){
                        System.out.println("finded apple is apple4 : " + apple4);
                    }else {
                        System.out.println("finded apple is apple5 : " + apple6);
                    }
                }
            }
        }
    }
}
