package com.bvsahasrabuddhe;

import java.util.Scanner;
import java.lang.*;
class Contacts{
    private String name;
    private String gender;
    private String number;
    private String email_Id;

    Contacts(){
        //zero parameter constructor
        //System.out.println("Tap");

    }

    public Contacts(String name, String gender, String number, String email_Id) {
        super();   // object class constructor will called / shadowing problem
        // default setter
        this.name = name;
        this.gender = gender;
        this.number = number;
        this.email_Id = email_Id;
    }
//    On the Code menu, click Generate Alt+Insert .

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEmail_Id(String email_Id) {
        this.email_Id = email_Id;
    }

    public String getGender() {
        return gender;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail_Id() {
        return email_Id;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", number='" + number + '\'' +
                ", email_Id='" + email_Id + '\'' +
                '}';
    }
    //    In the Generate popup, click one of the following: Getter to generate accessor methods for getting the current values of class fields. ...
//    Select the fields to generate getters or setters for and click OK.
//



}
public class PhoneBook {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contacts[] c1 = new Contacts[5];

//        c.setName("Bhalchandra");
//        System.out.println(c.getName());
        int numberOfContacts = 0;
        do{
            if(numberOfContacts >=5)
            {
                System.out.println("Phone Book is full now");
                break;
            }
            String s = scan.next();
            String[] split=  s.split(",");
            Contacts c = new Contacts(split[0],split[1],split[2],split[3]);
            c1[numberOfContacts++] = c ;
            System.out.println("Contact addeed Sucessfully");
            System.out.println("Want to add one more contact");
        }while (scan.next().equalsIgnoreCase("Yes"));
        for(int i=0; i<numberOfContacts;i++){
          //  System.out.println(c1[i]);
            System.out.println(c1[i]);
        }




    }
}
