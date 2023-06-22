package org.yup.OnlineStore.views;

import java.util.Scanner;

public class Menu {

    static Scanner userScanner = new Scanner(System.in);

    public static void mainMenu(){
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("WELCOME to NOMAD!");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("Where Nomads Find Their Treasures");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("Please choose from the following OPTIONS: ");
        System.out.println("C * Customer");
        System.out.println("E * Employee");
        System.out.print("Please enter the LETTER of your choice: ");
        String menuChoice = userScanner.nextLine();

        if(menuChoice.equalsIgnoreCase("c")) {
            customerScreen();

        } else if(menuChoice.equalsIgnoreCase("e")){
            employeeScreen();

        } else {
            System.out.println("INVALID choice.");
            mainMenu();

        }
    }

    public static void customerScreen(){
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("WELCOME to NOMAD!");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("Where Nomads Find Their Treasures");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("Please choose from the following OPTIONS: ");
        System.out.println("L * for customer LOG-IN");
        System.out.println("S * for customer SIGN-UP");
        System.out.println("B * to go BACK");
        System.out.println("X * to EXIT");
        System.out.print("Please enter the LETTER of your choice: ");
        String customerChoice = userScanner.nextLine();

        switch (customerChoice.toLowerCase()){
            case "l":
                System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                System.out.println("Welcome back fellow NOMAD!");
                System.out.print("Please enter your EMAIL: ");
                String customerEMail = userScanner.nextLine();
                System.out.println("Please enter your PASSWORD: ");
                String customerPassword = userScanner.nextLine();

                break;
            case "s":
                System.out.println("Please enter your FULL NAME: ");
                System.out.println("Please enter your EMAIL: ");
                System.out.println("Please enter your PASSWORD: ");

                break;
            case "b":
                mainMenu();
                break;
            case "x":
                System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                System.out.println("Thank you for visiting our digital oasis. Your NOMAD adventure awaits!");
                System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                break;
            default:
                System.out.println("░░░░░░░░░░░░░░░░░░");
                System.out.println("INVALID choice");
                System.out.println("░░░░░░░░░░░░░░░░░░");
                customerScreen();
                break;
        }
    }

    public static void employeeScreen(){
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("WELCOME to NOMAD!");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("Where Nomads Find Their Treasures");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("Please choose from the following OPTIONS: ");
        System.out.println("L * for employee LOG-IN");
        System.out.println("B * to go BACK");
        System.out.println("X * to EXIT");
        String employeeChoice = userScanner.nextLine();

        if(employeeChoice.equalsIgnoreCase("l")){
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("Welcome back fellow NOMAD!");
            System.out.print("Please enter your EMAIL: ");
            String employeeEMail = userScanner.nextLine();
            System.out.println("Please enter your PASSWORD: ");
            String employeePassword = userScanner.nextLine();

        }else if(employeeChoice.equalsIgnoreCase("b")){
            mainMenu();

        }else if(employeeChoice.equalsIgnoreCase("x")){
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
            System.out.println("Thank you for visiting our digital oasis. Your NOMAD adventure awaits!");
            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");


        }else{
            System.out.println("░░░░░░░░░░░░░░░░░░");
            System.out.println("INVALID choice");
            System.out.println("░░░░░░░░░░░░░░░░░░");
            employeeScreen();
        }
    }

    public static void orderScreen(){

        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("Please choose from the following OPTIONS: ");
        System.out.println("P * for POWER");
        System.out.println("W * for WATCH BANDS");
        System.out.println("L * for LAPTOP and IPAD CASES");
        System.out.println("P * for PHONE CASES");
        System.out.println("A * for AIRPOD CASES");
        System.out.println("T * for TECH ACCESSORIES");

    }

    public static void customerLogInScreen(){


    }
}
