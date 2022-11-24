import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer scanner =new Customer();
        Scanner option =new Scanner(System.in);
        System.out.println("Select one of the following options\n1. Create Account\n2. Deposit\n3. Withdraw\n4. View balance");
        System.out.println("5. View account holders");
        System.out.println("Enter option: ");
        int choice = option.nextInt();
        switch (choice){
            case 1: scanner.getInfo();
                    scanner.storeInfo();
            case 2:
        }


    }
}
/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transactions MyAccount = new Transactions();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select one of the following options\n1. Create Account\n2. Deposit\n3. Withdraw\n4. View balance");
        System.out.println("5. View account holders");
        System.out.println("Enter option: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> MyAccount.CreateAccount();
            case 2 -> MyAccount.deposit();
            case 3 -> MyAccount.withdraw();
            case 4 -> Details.DisplayNames();
            default -> System.out.println("Invalid option");
        }
    }
}*/