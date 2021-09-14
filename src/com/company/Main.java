package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a noun: ");
        String noun = input.next();


        System.out.println("Enter a verb: ");
        String verb = input.next();

        System.out.println("Enter an adjective: ");
        String adj = input.next();

        System.out.println("Enter an adverb: ");
        String adv = input.next();


        System.out.println("You " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!" );



    }
}
