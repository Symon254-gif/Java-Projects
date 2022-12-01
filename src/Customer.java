//import java.util.HashMap;
import java.util.*;

public class Customer {
    /*this class collects all the information about a customer such as full names, ID number, Gender, Date of birth, age and account number.
    The class should have a method through which the customer information is collected. The information collected should be stored in an array.this class collects all the information about a customer such as full names, ID number, Gender, Date of birth, age and account number. The class should have a method through which the customer information is collected.
    The information collected should be stored in an array.*/
    String[] Information = new String[100];
    int index=0;
    Scanner get = new Scanner(System.in);
    private String names;
    private int ID;
    private String gender;
    private String DOB;
    private long AccNo;
    private int age;

    public long getAccNo() {
        return AccNo;
    }

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
        storeInfo();
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
}
