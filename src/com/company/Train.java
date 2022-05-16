package com.company;

import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        System.out.println("Do you have a bag ? (Yes:true, No:false)");
        Scanner scanner = new Scanner(System.in);
        boolean hasBag = scanner.nextBoolean();
        System.out.println("Direct transport only? (Yes:true, No:false)");
        boolean nonStop = scanner.nextBoolean();
        System.out.println("Is there choice transport type ? (Train:1, Bus:2, Flight:3, If there is no filter:0) ");
        int transportType = scanner.nextInt();

        System.out.println("From: ");
        String from = scanner.next();

        System.out.println("To: ");
        String destination = scanner.next();

        String train1 = "TR001";
        String train2 = "TR002";
        String train3 = "TR003";
        String train4 = "TR004";
        String bus1 = "BS001";
        String bus2 = "BS002";
        String bus3 = "BS003";
        String flight1 = "FL001";
        String flight2 = "FL002";
        String flight3 = "FL003";

        if (!(from.equalsIgnoreCase("Berlin") || destination.equalsIgnoreCase("Amsterdam"))) {
            System.out.println("For now, we can only serve you Berlin-Amsterdam transportation. Please check your destinations");
            return;
        }
        switch (transportType) {
            case 1:
                if (nonStop && hasBag) {
                    System.out.println("You can only take " + train3);
                    return;
                }
                if (!nonStop && hasBag) {
                    System.out.println("You can only take " + train4);
                    return;
                } else if (nonStop) {
                    System.out.println("Couldn't find any train for you, please check your filters and retry.");
                    return;
                } else {
                    System.out.println("You can take " + train1 + ", "
                            + train2 + ", " + train3 + ", " + train4);
                }
                break;
            case 2:
                System.out.println("You can take " + bus1 + ", "
                        + bus1 + ", " + bus3 );
                break;
            case 3:
                if (nonStop && hasBag) {
                    System.out.println("Couldn't find any flight for you, please check your filters and retry.");
                    return;
                }
                if (!nonStop && hasBag) {
                    System.out.println("You can only take " + flight1);
                    return;
                } else if (nonStop) {
                    System.out.println("You can only take " + flight2);
                    return;
                } else {
                    System.out.println("You can take " + flight1 + ", "
                            + flight2 + ", " + flight3 );
                }
                break;
        }
    }

}
