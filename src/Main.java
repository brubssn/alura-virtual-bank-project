import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Clark Kent";
        String accountType = "Checking"; // It can be Checking, Saving, Money Market, Deposit
        double balance = 1599.99;
        int option = 0;

        System.out.println("****************");
        System.out.println("\nClient: " + name);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
        System.out.println("\n****************");

        String menu = """
                ** Menu **
                1 - Check balance
                2 - Transfer value
                3 - Receive value
                4 - Exit
                
                """;

        Scanner reader = new Scanner(System.in);

        while (option != 4) {
            System.out.println(menu);
            option = reader.nextInt();

            if (option == 1){
                System.out.println("The current balance is: " + balance);
            } else if (option == 2){
                System.out.println("How much do you want to transfer? ");
                double transferValue = reader.nextDouble();
                if (transferValue > balance){
                    System.out.println("The value you want to transfer is bigger than your current balance.");
                } else {
                    balance = balance - transferValue;
                    System.out.println("Current balance: " + balance);
                }
            } else if (option == 3){
                System.out.println("Received value: ");
                double receivedValue = reader.nextDouble();
                balance += receivedValue;
                System.out.println("Current balance: " + balance);
            } else if (option != 4){
                System.out.println("Invalid option.");
            }
        }
    }
}