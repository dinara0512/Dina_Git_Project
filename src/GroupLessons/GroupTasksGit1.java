package GroupLessons;

import java.util.Scanner;

public class GroupTasksGit1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter email:");
            String email = scan.next();
    /*
    Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
    */
            String firstN =    email.substring(0,1).toUpperCase() + email.substring(1,email.indexOf(""));

            String lastN = email.substring(email.indexOf("")+1,email.indexOf("")+2).toUpperCase() +email.substring(email.indexOf(" ")+2,email.indexOf('@'));
            String domainfirst = "" + email.substring(email.indexOf('@')+1,email.indexOf('@') +2);
            domainfirst = domainfirst.toUpperCase();
            String    domain=    email.substring(email.indexOf('@')+2, +email.indexOf('.'));

            System.out.println("First name: " + firstN);
            System.out.println("Last name: " + lastN);
            System.out.println("Domain: " + domainfirst + domain);
        }
    }

