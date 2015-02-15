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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Employee {
    private String ssNumber;
    private String firstName;
    private String lastName;
    private String datefBirthte;
    private int age;
    private String address;
    private String phone;
    private String email;
    private String jobTitle;
    private static Integer count =0;
    Employee()
    {
        this.ssNumber="";
        this.firstName="";
        this.lastName="";
        this.datefBirthte="1/1/1900";
        this.age=0;
        this.address="";
        this.phone="";
        this.email="";
        this.jobTitle="";
        count++;
    }
    Employee(String ssn,String fn,String ln,String dob,String addr,String phone,String em,String job)
    {
        setSSNumber(ssn);
        setFirstName(fn);
        setLastName(ln);
        setDateOfBirth(dob);
        setAddress(addr);
        setPhone(phone);
        setEmail(em);
        setJobTitle(job);
        count++;
    }
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


            this.datefBirthte=DOB;

            Integer yearC=Calendar.getInstance().get(Calendar.YEAR);
            Integer year;
            String reverse = new StringBuilder(DOB).reverse().toString();
           // System.out.print("Reverse year "+reverse);
            String yearS;
            StringBuilder str2 = new StringBuilder(reverse);
            str2.delete(4,str2.length());
            yearS = new StringBuilder(str2).reverse().toString();
            //System.out.print("\n Normal year "+yearS);
            year=Integer.parseInt(yearS);
            this.age=yearC-year;
           // this.age=dat.getYear()-year;
        }
        public Integer getAge()
        {
            return age;
        }
        public String getAddress()
        {
            return address;
        }
        public void setAddress(String add)
        {
            Scanner scan = new Scanner(System.in);
            while(add.equals(" "))
            {
                System.out.print("Address cannot be empty!!");
                add=scan.next();
            }
            this.address=add;
        }
        public String getPhone()
        {
            return phone;
        }
        public void setPhone(String ph)
        {
            Scanner scan = new Scanner (System.in);
            while(ph.equals(" "))
            {
                System.out.print("You cannot leave empty telphone number!! ");
                ph=scan.next();
            }
            this.phone=ph;
        }
        public String getEmail()
        {
            return email;
        }
        public void setEmail(String em)
        {
            Scanner scan = new Scanner(System.in);
            while(em.equals(" "))
            {
                System.out.print("Email cannot be empty!!");
                em=scan.next();
            }
            this.email=em;
        }

        public String getJobTitle()
        {
            return this.jobTitle;
        }
        public void setJobTitle(String jb)
        {
            Scanner scan = new Scanner (System.in);
            while(jb.equals(" "))
            {
                System.out.print("Job title cannot be empty!");
                jb=scan.next();
            }
            this.jobTitle=jb;
        }
        public static Integer getCount()
        {
            return count;
        }
        public void print()
        {
            System.out.print("Employee information\n"
                    +       "First Name: "+getFirstName()+"\n"
                    +       "Last Name: "+getLastName()+"\n"
                    +       "Social Security: "+getSSNumber()+"\n"
                    +       "Date Of Birth: "+getDateOfBirth()+"\n"
                    +       "Address: "+getAddress()+"\n"
                    +       "Age: "+getAge()+"\n"
                    +       "Email: "+getEmail()+"\n"
                    +       "Title: "+getJobTitle()+"\n");
        }
       public static void setCount(int i)
        {
            count=i;
        }



}
