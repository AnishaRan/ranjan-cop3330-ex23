package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String silentCar = in.nextLine();

        if(silentCar.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String batTermCorr = in.nextLine();

            if(batTermCorr.equals("y")) {
                System.out.print("Clean terminals and try starting again.");
            } else if(batTermCorr.equals("n")) {
                System.out.print("Replace cables and try again.");
            } else {
                System.out.println("Invalid input. Try again.");
            }

        } else if(silentCar.equals("n")) {
            System.out.print("Does the car make a slicking noise? ");
            String slickingNoise = in.nextLine();

            if(slickingNoise.equals("y")) {
                System.out.print("Replace the battery.");
            } else if(slickingNoise.equals("n")) {
                System.out.print("Does the car crank up but fail to start? ");
                String failStartUp = in.nextLine();

                if(failStartUp.equals("y")) {
                    System.out.println("Check spark plug connections.");
                } else if(failStartUp.equals("n")) {
                    System.out.print("Does the engine start and then die? ");
                    String engineDie = in.nextLine();

                    if(engineDie.equals("y")) {
                        System.out.print("Does you car have fuel injection? ");
                        String fuelInj = in.nextLine();

                        if(fuelInj.equals("y")) {
                            System.out.print("Get it in for service.");
                        } else if(fuelInj.equals("n")) {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        } else {
                            System.out.println("Invalid input. Try again.");
                        }
                    } else if(engineDie.equals("n")) {
                        System.out.print("Check to ensure the choke is opening and closing.");
                    } else {
                        System.out.println("Invalid input. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            } else {
                System.out.println("Invalid input. Try again.");
            }

        } else {
            System.out.println("Invalid input. Try again.");
        }
    }
}
