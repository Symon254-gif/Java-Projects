import java.util.Scanner;

public class Customer {
    String[] Information = new String[100];
    int index=0;
    Scanner get = new Scanner(System.in);
    private String names;
    private int ID;
    private String gender;
    private String DOB;
    private long AccNo;

    public void setNames(String names) {
        this.names = names;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAccNo(long accNo) {
        AccNo = accNo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


    public void getInfo(){
        System.out.println("Enter the following information");
        System.out.println("Name: ");
        String fname = get.nextLine();
        setNames(fname);
        System.out.println("Age: ");
        age = get.nextInt();
        setAge(age);
        System.out.println("ID number: ");
        ID = get.nextInt();
        setID(ID);
        System.out.println("Gender (M/F): ");
        gender = get.next();
        setGender(gender);
        System.out.println("D.O.B (dd/mm/yyyy): ");
        DOB = get.next();
        setDOB(DOB);
        System.out.println("Account Number: ");
        AccNo = get.nextLong();
        setAccNo(AccNo);
    }

    public void storeInfo(){
        /*Variables: names, gender, DoB, idno, AccNo, age*/
        String ID_number = "" + ID;
        String Account_Number = "" + AccNo;
        String HolderAge = "" + age;
        String Entry = this.names +", " + HolderAge+", "+ Account_Number+ ", " + this.gender +", " + ID_number + " ";

        Information[index]=Entry;
        index++;
    }

    public void display(){
        int i;
        for (i=0;i<=index;i++){
            System.out.println("Stored details");
            System.out.println(Information[i]);
            System.out.println();
        }
    }
}
