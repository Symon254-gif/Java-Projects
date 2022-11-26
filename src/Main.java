import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer scanner =new Customer();
        Scanner option =new Scanner(System.in);
        System.out.println("Select one of the following options\n1. Create account");
        System.out.println("Enter option: ");
        int choice = option.nextInt();
        if(choice==1){
            scanner.getInfo();
            scanner.storeInfo();
            System.out.println("Info stored\n");
            scanner.display();
        }


    }
}
