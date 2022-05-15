package com.company;

import java.util.Scanner;

public class Loyalty {
    // loyalty program
    // Deal 1 if any customer buys more than 3 item each item's price will be decreased as %10
    // Deal 2 if any customer buys more than 3 item, there will be 5 $ dollar discount
    // Deal 3 if cart total is greater than 30 $ there will be discounted as % 15
    // campaign can not be used as together.
    // Whichever campaign the customer will earn more will be valid.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double itemPrice = 9.2;

        int itemCount = 5;

        System.out.println("Please select the campaign that you would like attend");
        int campaignId = scanner.nextInt();
       // bug 1
        if (!(campaignId == 1 || campaignId == 2 || campaignId == 3)){
            System.out.println("You have entered invalid campaignId");
            return;
        }
        System.out.println("Please enter item count you would like to buy: ");
        int count = scanner.nextInt();
        // bug 2 check item count greater than zero and item count

//       if (itemCount < count){
//         System.out.println("not sufficient stock:");
//       }

        // bug 3
        double customerCartTotal = itemPrice * itemCount;
        int advicedCampaignId= 0;
// advice bussiness
        if (campaignId == 1){
            customerCartTotal -= itemPrice * 0.1;
            advicedCampaignId = 2;
        }else if (campaignId == 2){
            customerCartTotal -= itemPrice;
            advicedCampaignId = 2;
        }else{
            if (customerCartTotal > 30){
                System.out.println("to use campaign 3, your cart needs to be greater than 30");
            }else {
                customerCartTotal = (customerCartTotal * 15) /100;
                advicedCampaignId = 3;
            }
        }

        if (campaignId == advicedCampaignId){
            System.out.println("You have made excellent choice");
            System.out.println("Your cart without discount: " + count * itemPrice);
            System.out.println("Your cart with discount: " + customerCartTotal);
        }else {
            System.out.println("There is an another campaign option for you. campaignId: " + advicedCampaignId);
        }
    }
}
