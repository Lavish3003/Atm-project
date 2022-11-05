// 
// Decompiled by Procyon v0.5.36
// 

package Dailypractice;

import java.util.Scanner;

public class atmprogram
{
    public static void main(final String[] args) {
        int balance = 10000;
        final Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Lavish Atm");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for Deposite");
            System.out.println("Chose 3 for Check balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose operation you want to perform:");
            final int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter money to be withdraw :");
                    final int withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money and ATM card");
                    }
                    else {
                        System.out.println("Aukat ke bhar pAISE NIKAL RAHA Bhai");
                    }
                    System.out.println("");
                    continue;
                }
                case 2: {
                    System.out.println("KITNA PAISA DALNA HAI :");
                    final int deposite = sc.nextInt();
                    balance += deposite;
                    System.out.println("u r money has been successfully deposited");
                    System.out.println("");
                    continue;
                }
                case 3: {
                    System.out.println("balance :" + balance);
                    System.out.println("");
                    continue;
                }
                case 4: {
                    System.exit(0);
                    continue;
                }
            }
        }
    }
}
