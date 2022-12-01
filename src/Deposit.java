import java.text.NumberFormat;
import java.util.Scanner;

public class Deposit extends  Account {
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    private long balance;

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        long Deposit = scanner.nextLong();
        balance = Account.getAccount_Balance();

        if (Deposit <= 0) {
            System.out.println("Transaction cannot be completed!");
        } else {
            if (balance == 0) {
                Account.setAccount_Balance(Deposit);
            }
        }
        balance+=Deposit;
        System.out.println("You have successfully deposited " + currency.format(Deposit));
        System.out.println("New account balance is " + currency.format(balance));
    }
}