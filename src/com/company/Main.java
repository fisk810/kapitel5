package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int number(){
        //TODO Godt med kommentarer i din kode
        // generates a random number
        Random random = new Random();
        int gennumber = random.nextInt (100) + 1;
        //TODO ret gennumber sådan at genNumber. Det gør at man kan "læse" mellemrummet
        return gennumber;
        //får "gennumber" som mit gættede tal
        }

    public static int input () {
        //lets you pick a number 1-100
        System.out.println("what number am I thinking of between 1 and 100");
        Scanner in = new Scanner (System.in);
        //TODO ret inputnumber til inputNumber
        int inputnumber = in.nextInt();
        return inputnumber;
        //får " inputnumber " som mit gættede tal
    }

    public static void calc (int gennumber, int inputnumber) {
        //calculates and tells you if your above or blow
        if (gennumber == inputnumber) {
            System.out.println("correct, the number iI was thinking of was");
        } else if (gennumber < inputnumber){
            System.out.println( "that number is too big");
        }
        else if (gennumber > inputnumber) {
            System.out.println("that number is too small");
        }
        else {
            System.out.println("couldn't calculate");
        }
    }

        public static void main (String[] args) {
        /*make
        main run "input"
        then make it run number
        and lastly calc
        connect gennumber and inputnumber to the rest of the code
        */
        }








    }
