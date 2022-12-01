import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer Holder =new Customer();
        Scanner option =new Scanner(System.in);
        int loopvar = 1;
        while(loopvar>0){
            System.out.println("Select one of the following options\n1. Create account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Check account balance");
            System.out.println("Enter option: ");
            int choice = option.nextInt();
            switch (choice){
                case 1:
                    Holder.getInfo();

            }
        }
    }
}
