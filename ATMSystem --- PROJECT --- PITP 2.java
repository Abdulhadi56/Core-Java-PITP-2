//ATM System --- PITP 2 --- CORE JAVA TASK --- 2-October-2025 --- Thursday

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int balance = 10000;
        int pinNum = 123;

        System.out.println("--- Welcome to ATM System ---");
        System.out.print("Enter Your PIN Number: ");
        int userPin = obj.nextInt();

        if (userPin != pinNum) {
            System.out.println("Invalid Pin, Please try again");
            return;
        }

        while (true) {
            System.out.print("Would you like any Transaction [Yes/No]: ");
            String userChoice = obj.next();

            if (userChoice.equalsIgnoreCase("Yes")) {
                System.out.println("\nSelect the Transaction from the following:");
                System.out.println("1. Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Receipt");
                System.out.println("5. Exit\n");

                System.out.print("Enter Your Transaction Type: ");
                String userTransactionType = obj.next();

                if (userTransactionType.equalsIgnoreCase("Balance")) {
                    System.out.println("Current Balance: " + balance);
                } else if (userTransactionType.equalsIgnoreCase("WithDraw")) {
                    System.out.print("Enter amount you want to withdraw: ");
                    int withdrawAmount = obj.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn Amount: " + withdrawAmount);
                        System.out.println("Current Balance: " + balance);
                    }
                } else if (userTransactionType.equalsIgnoreCase("Deposit")) {
                    System.out.print("Enter amount you want to deposit: ");
                    int depositAmount = obj.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposited Amount: " + depositAmount);
                    System.out.println("Current Balance: " + balance);
                } else if (userTransactionType.equalsIgnoreCase("Receipt")) {
                    System.out.println("Printing receipt...");
                    System.out.println("Current Balance: " + balance);
                    System.out.println("Thank you for using our ATM.");
                } else if (userTransactionType.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid transaction type. Please try again.");
                }

            } else if (userChoice.equalsIgnoreCase("No")) {
                System.out.println("Thank You for using our ATM.");
                break;
            } else {
                System.out.println("Invalid Input, please type Yes or No");
            }
        }
    }
}