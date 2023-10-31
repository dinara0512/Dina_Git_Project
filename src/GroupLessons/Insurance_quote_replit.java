package GroupLessons;

import java.util.Scanner;

public class Insurance_quote_replit {

        public static void main(String[] args) {
            //DO NOT CHANGE
            System.out.println("Welcome to the CountyFarm car insurance!");
            //WRITE YOUR CODE HERE
            System.out.println ("Enter your name") ;
            Scanner input = new Scanner (System.in);
            double premium = 0;
            int accidentsAmount = 0;
            int daysDrivenToWorkOrSchool = 0;
            int milesToWorkOrSchool = 0;
            String vehicleOwnership = "";
            String vehicleUsage = "";
            String continuousInsurance = "";
            String education = "";
            String name = "";
            String referenceNumber = "";
            name = input.nextLine();






            System.out.println ("Do you have a US driver license?") ;
            boolean license = input.nextBoolean();
            if (!license) {
                System.out.println ("Invalid data!");
                System.exit(0);
            }

            System.out.println ("Enter your zip code:") ;
            int zip = input.nextInt();
            if (zip == 20910 || zip == 20740) {
                premium +=60;
            } else if (zip==22102 || zip==22103) {
                premium +=30;
            }else {
                premium +=50;
            }
            System.out.println ("Is this vehicle Owned, Financed, or Leased?") ;
            String vehicle = input.next();
            if (vehicle.equals("owned")) {
                premium +=10;
            } else{
                premium +=20;
            }
            System.out.println ("How is this vehicle primarily used?") ;
            String usage = input.next();
            if (usage.equals("Business")) {
                premium +=50;
            }else if (usage.equals("Pleasure")) {
                premium +=10;
            } else if (usage.equals("Commute")){
                premium +=20;
            }
            System.out.println ("Days Driven To Work And/Or School");
            int days = input.nextInt();
            premium += days * 5;

            System.out.println ("How many miles customers drives to work or school") ;
            int miles = input.nextInt ();
            premium += miles * 1;
            System.out.println ("How old are you?") ;
            int age = input.nextInt ();
            if (age<16) {
                System.out.println ("Invalid data!") ;
                System.exit(0);
            } else if (age>=16 && age<18) {
                premium *= 20;
            }else if (age>=18 && age<=21) {
                premium *= 6;
            } else if (age>21 && age<25) {
                premium *= 2;
                System.out.println ("How many years you've been driving?") ;
                int years = input.nextInt ();
                if (years>0 && age >=16) {
                    premium -=years -5;
                } else {
                    System.out.println ("Invalid data!");
                }
                System.out.println ("Have you had any accidents in the last 5 years?") ;

                String accidents = input.next();
                if (accidents.equals("yes")) {
                    System.out.println ("How many?") ;
                    accidentsAmount = input.nextInt ();
                    premium += (premium * 0.2) * accidentsAmount;

                    System.out.println ("Have you had continuous insurance for the past 12 months?") ;
                    String continious = input.nextLine();
                    if (continious.equals("no")) {
                        premium *= 2;
                    }
                    System.out.println ("What is the highest level of education you have completed?") ;
                  //  String education = input.nextLine();
                    if (education.equals("Doctors")) {
                        premium -= (premium / 0.05);
                    } else if (education.equals("Bachelors") || education.equals ("Masters")) {
                        premium = (premium /0.10);
                    }else if (education.equals ("Less than High School")) {
                        premium = (premium *0.05);
                    }

                    System.out.println (name +" here's your quote! /nStart Your Policy Today For:$ " + premium + "/nReference number: " + name.substring (0,2).toUpperCase()+zip+education.toUpperCase());


                }


            }
        }
    }


