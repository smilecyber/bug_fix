package com.company;

public class Train {

    public static void main(String[] args) {
	    boolean nonStop = true;
        boolean hasBag = true;


        String option1StartDestination = "Berlin";
        String option2StartDestination = "Dresden";

        String destination1 = "Amsterdam";
        String destination2 = "Utrecht";

        String train1 = "train1 10:30 AM 25 $";
        String train2 = "train2 11:40 AM 40 $";
        String train3 = "train3 1:15 PM 55 $";
        String train4 = "train4 3:25 PM 23 $";
        String train5 = "train5 4:45 PM 34 $";

        if (destination1 == "Amsterdam" || destination2 == "Utrecht"){
            System.out.println(
                    "You can take " + train1 +", " + train2 +", " + train3
                    +", " + train4 + " and " + train5 +".");
        }else {
            System.out.println("no train you can take.");
        }

        if ((option1StartDestination == "Berlin"
                || option2StartDestination == "Dresden")  && nonStop){
            System.out.println("You can take " + train1);
        }else {
            System.out.println(
                    "You can take " + train3
                            +"and " + train4 + ".");
        }

        if ((option1StartDestination == "Berlin"
                || option2StartDestination == "Dresden")  && hasBag){
            System.out.println(
                    "You can take " + train3
                            +"and " + train5 + ".");
        }else {
            System.out.println(
                    "You can take " + train1 +", " + train2 +", " + train3 +", " + train2 +", "
                            + " and " + train5 +".");
        }
    }

}
