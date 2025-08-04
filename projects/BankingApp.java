import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingApp {


    //    Making a Banking System:
    static double balance = 10000.00;
    static List<String> transactions = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> credit(sc);
                case 2 -> debit(sc);
                case 3 -> showBalance();
                case 4 -> showMiniStatement();
                case 5 -> {
                    System.out.println("\uD83D\uDC4B Thank you for banking with us!");
                    return;
                }
                default -> System.out.println("❌ Invalid choice. Try again.");
            }
        } while (true);
    }

    public static void showMenu() {
        System.out.println("\n===== Simple Banking Menu =====");
        System.out.println("1. Credit (Deposit)");
        System.out.println("2. Debit (Withdraw)");
        System.out.println("3. Show Balance");
        System.out.println("4. Mini Statement");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void credit(Scanner sc) {
        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            addTransaction("Credited ₹" + amount);
            System.out.println("✅ Amount Credited: ₹" + amount);
        } else {
            System.out.println("❌ Enter a valid amount.");
        }
    }

    public static void debit(Scanner sc) {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction("Debited ₹" + amount);
            System.out.println("✅ Amount Debited: ₹" + amount);
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    public static void showBalance() {
        System.out.println("\n💰 Available Balance: ₹" + balance);
    }

    public static void showMiniStatement() {
        System.out.println("\n📄 Last Transactions:");
        for (String t : transactions) {
            System.out.println("- " + t);
        }
    }

    public static void addTransaction(String transaction) {
        if (transactions.size() >= 5) {
            transactions.remove(0); // keep only last 5
        }
        transactions.add(transaction);
    }
}