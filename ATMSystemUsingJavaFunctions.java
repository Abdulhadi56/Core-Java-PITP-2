import java.util.Scanner;
public class Main {

    public static void checkBalance(double balance) {
        System.out.println("Your Current Balance is: Rs " + balance);
    }

    public static double deposit(double balance, double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
        return balance;
    }

    public static double withdraw(double balance, double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid Withdraw Amount!");
        } else {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn successfully.");
        }
        return balance;
    }

    // Function to print receipt
    public static void printReceipt(double balance) {
        System.out.println("\n------ ATM RECEIPT ------");
        System.out.println("Available Balance: Rs " + balance);
        System.out.println("Thank you for using our ATM!");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int pin = 1234;
        double balance = 10000.00;

        System.out.println("====== Welcome to ATM System ======");
        System.out.print("Enter your PIN: ");
        int enteredPin = obj.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN! Exiting...");
            return;
        }

        System.out.println("PIN Verified Successfully!");

        boolean exit = false;

        while (!exit) {
            System.out.print("\nDo you want to make a transaction? (Yes/No): ");
            String response = obj.next().toLowerCase();

            if (response.equals("no")) {
                System.out.println("Thank you for visiting. Goodbye!");
                break;
            }

            System.out.println("\n--- Transaction Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Print Receipt");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: Rs ");
                    double depositAmount = obj.nextDouble();
                    balance = deposit(balance, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: Rs ");
                    double withdrawAmount = obj.nextDouble();
                    balance = withdraw(balance, withdrawAmount);
                    break;

                case 4:
                    printReceipt(balance);
                    break;

                case 5:
                    System.out.println("Exiting... Thank you for using our ATM!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

    }
}