
/* This class is used to manage the customer's account it ensure the account number is associated with a certain
   ID number of the customer.
   it has a method that ensures the account of the customer does not go below Kshs 1,000.
   If the account is below Kshs 1,000, a separate method is invoked through a toast message.
 */
import java.text.NumberFormat;
import java.util.Scanner;


public class Account extends Customer {

    private long Account_Balance;

    public long getAccount_Balance() {
        return Account_Balance;
    }

    public void setAccount_Balance(long account_Balance) {
        Account_Balance = account_Balance;
    }

    NumberFormat currency = NumberFormat.getCurrencyInstance();

    public void AccountIdentifier(){
        System.out.println("Key in your id number:");
    }

    void deposit(){
        Scanner scanner = new Scanner(System.in);
        long Deposit = scanner.nextLong();

        if (Deposit<=0) {
            System.out.println("Transaction cannot be completed!");
        }
        else{
            Account_Balance+=Deposit;
            System.out.println("You have successfully deposited " + currency.format(Deposit));
            System.out.println("New account balance is "+ currency.format( Account_Balance));

        }
    }
    void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        Scanner scanner = new Scanner(System.in);
        Long W_amount = scanner.nextLong();

        if(W_amount>Account_Balance){
            System.out.println("You have insufficient funds to complete this transaction!\nYour account balance is "+ currency.format( Account_Balance));
        }
        else {

            Account_Balance-=W_amount;
            System.out.println("You have successfully withdrawn " + W_amount+"\nYour account balance is " + currency.format( Account_Balance));
        }
        if (Account_Balance<=1000){
            System.out.println("You account balance is below " + currency.format(1000));
        }
    }
}
