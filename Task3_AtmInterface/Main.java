import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create bank account with initial balance
        Account account = new Account(10000);

        // Create ATM object
        ATM atm = new ATM(account, sc);

        System.out.println("================================");
        System.out.println("     WELCOME TO JAVA ATM");
        System.out.println("================================");

        // Start ATM
        atm.showMenu();

        sc.close();
    }
}
