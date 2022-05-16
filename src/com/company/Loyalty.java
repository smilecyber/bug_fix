package com.company;

import java.util.Scanner;

public class Loyalty {
    // loyalty program
    // Deal 1 if any customer buys more than 3 item each item's price will be decreased as %10
    // Deal 2 if any customer buys more than 3 item, there will be 5 $ dollar discount
    // Deal 3 if cart total is greater than 30 $ there will be discounted as % 15
    // deal can not be used as together.
    // Whichever deal the customer will earn more will be valid.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double itemPrice = 9.2;

        int itemCount = 5;

        System.out.println("Please select the deal that you would like attend");
        int dealId = scanner.nextInt();
        if (!(dealId == 1 || dealId == 2 || dealId == 3)){
            System.out.println("You have entered invalid dealId");
            return;
        }else {
            System.out.println("You have entered wrong dealId. Please try again");
            dealId = scanner.nextInt();

        }
        System.out.println("Please enter item count you would like to buy: ");
        int count = scanner.nextInt();
        if (count < 3){
            System.out.println("to receive the deal you need to purchase at least 3 item");
        }
       if (itemCount < count){
         System.out.println("not sufficient stock:");
       }


        double customerCartTotal = itemPrice * count;


        if (dealId == 3){
            if (customerCartTotal < 30){
                System.out.println("If the deal 3 is choosen, cart total needs to be greater than 30");
            }
        }

        int advicedDealId= 0;
        double amountWithSelectedDeal= 0;

        // deal1 calculations
        double amountWithDeal1 = customerCartTotal - (customerCartTotal * 0.1);
        // deal2 calculations
        double amountWithDeal2 = customerCartTotal - 5 ;
        // deal3 calculations
        double amountWithDeal3 = (customerCartTotal * 15)/100;


        if (dealId == 1){
            amountWithSelectedDeal = amountWithDeal1;
        }else if (dealId == 2){
            amountWithSelectedDeal = amountWithDeal2;
        }else{
            amountWithSelectedDeal = amountWithDeal3;
        }
        double amountWithAdvicedDeal= 0;

        if ((amountWithDeal1 < amountWithDeal2)){
            if ((amountWithDeal1 < amountWithDeal3)){
                advicedDealId = 1;
                amountWithAdvicedDeal = amountWithDeal1;
            }else{
                advicedDealId= 3;
                amountWithAdvicedDeal = amountWithDeal3;
            }
        }else if (amountWithDeal2< amountWithDeal3){
            advicedDealId = 2;
            amountWithAdvicedDeal = amountWithDeal2;
        }else {
            advicedDealId = 3;
            amountWithAdvicedDeal = amountWithDeal2;
        }

        if (dealId == advicedDealId){
            System.out.println("You have made excellent choice");
            System.out.println("Your cart without discount: " + count * itemPrice);
            System.out.println("Your cart with discount: " + customerCartTotal);
        }else {
            System.out.println("There is an another deal option for you. dealId: " + advicedDealId);
            System.out.println("If you still would like to use dealId: " + dealId + " price will be " + amountWithSelectedDeal);
            System.out.println("If you use our advice  dealId: " + advicedDealId + " price will be " + amountWithAdvicedDeal);
        }
    }
}
