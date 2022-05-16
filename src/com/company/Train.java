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

        String train1 = "train1 10:30 AM 25 $";
        String train2 = "train2 11:40 AM 40 $";
        String train3 = "train3 1:15 PM 55 $";
        String train4 = "train4 3:25 PM 23 $";
        String bus1 = "bus1 07:15 AM 22$";
        String bus2 = "bus1 08:20 AM 8$";
        String bus3 = "bus1 09:05 AM 13$";
        String flight1 = "flight1 04:05 AM 62$";
        String flight2 = "flight2 06:30 AM 97$";
        String flight3 = "flight3 20:15 AM 78$";

        if (!(from.equalsIgnoreCase("Berlin") || destination.equalsIgnoreCase("Amsterdam"))) {
            System.out.println("Couldn't find any transportation option for you, please check your filters and retry.");
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
