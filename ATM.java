import java.util.Scanner;

public class ATM {

    private Account account;
    private Scanner sc;

    // Constructor
    public ATM(Account account, Scanner sc) {
        this.account = account;
        this.sc = sc;
    }

    // Display ATM menu
    public void showMenu() {

        int choice;

        do {

            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }

    // Check balance
    private void checkBalance() {

        System.out.println("Your Current Balance: Rs. "
                + account.getBalance());
    }

    // Deposit money
    private void depositMoney() {

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        account.deposit(amount);
    }

    // Withdraw money
    private void withdrawMoney() {

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        account.withdraw(amount);
    }
}
