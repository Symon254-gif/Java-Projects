
/* This class is used to manage the customer's account it ensure the account number is associated with a certain
   ID number of the customer.
   it has a method that ensures the account of the customer does not go below Kshs 1,000.
   If the account is below Kshs 1,000, a separate method is invoked through a toast message.
 */
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Scanner;


public class Account extends Customer {

    private static long Account_Balance;

    public static long getAccount_Balance() {
        return Account_Balance;
    }

    public static void setAccount_Balance(long account_Balance) {
        Account_Balance = account_Balance;
    }

    NumberFormat currency = NumberFormat.getCurrencyInstance();

    public void AssociateAccountWithID(){
        HashMap<Integer, String> AccountIdentifier = new HashMap<>();
        AccountIdentifier.put((int) getAccNo(), Information[index]);
    }


    public void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        Scanner scanner = new Scanner(System.in);
        long W_amount = scanner.nextLong();

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

    public void CheckBalance(){
        System.out.println(currency.format(Account_Balance));
    }
}
