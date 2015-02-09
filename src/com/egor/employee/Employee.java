/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egor.employee;

/**
 *
 * @author Egor
 */
import java.util.Scanner;
import java.util.Date;
public class Employee {
    private String ssNumber;
    private String firstName;
    private String lastName;
    private String datefBirthte;
    private Integer age;
    private String address;
    private String phone;
    private String email;
    private String jobTitle;
    private static Integer count =0;
        public String getSSNumber()
        {
            return ssNumber;
        }
        public void setSSNumber(String ssn)
        {
            Scanner scan = new Scanner (System.in);
            String tst;
             while(ssn.equals(" "))
            {
                System.out.print("Social Security number is incorrect! ");
                tst=scan.next();
                ssn=tst;
            }
             this.ssNumber=ssn;
                
        }
        public String getFirstName()
        {
            return firstName;
        }
        public void setFirstName(String fn)
        {
            Scanner scan = new Scanner(System.in);
            String tst;
            while(fn.equals(" "))
            {
                System.out.print("First name cannot be empty! ");
                tst=scan.next();
                fn=tst;
            }
            this.firstName=fn;
        }
        public String getLastName()
        {
            return this.lastName;
        }
        public void setLastName(String ln)
        {
            Scanner scan=new Scanner(System.in);
            String tst;
            while(ln.equals(" "))
            {
                System.out.print("Last name acannot be empty! ");
                tst=scan.next();
                ln=tst;
            }
            this.lastName=ln;
        }
        public String getDateOfBirth()
        {
            return datefBirthte;
        }
        public void setDateOfBirth(String DOB)
        {
            String db;
            Scanner scanner = new Scanner (System.in);
            while(DOB.equals(" "))
            {
                System.out.print("Date of birth cannot be empty!!");
                db=scanner.next();
                DOB=db;
            }
            this.datefBirthte=DOB;
            Date dat = new Date();
            Integer year;
            String de,mt,yr;
            char []arr=new char[DOB.length()];
            for(int i=0;i<DOB.length();i++)
            {
               arr[i]=DOB.charAt(i);
            }
            
            
            
             
       }
                
            
}
