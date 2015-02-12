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
public class Source {
    public static void main (String []args)
    {
        Employee emp1 = new Employee();
        Employee emp2 ;
        emp2 = new Employee("7789821234","Egor","Kozitski","01/06/1993","2363 81st","3475838019","software developer");
        System.out.println("Testing constructors by calling Print()");
        System.out.println();
        System.out.println("emp1 data after default constructor creation");
        emp1.print();
        System.out.println();
        System.out.println("emp2 data after parameterized constructor");
        emp2.print();
        System.out.println();
        System.out.printn("TESTING INSTANCE GETTER/SETTER METHODS(PROPERTIES)");
        System.out.println();
        System.out.println("Calling SETTER METHODS to SET DATA (Properties)");
        emp1.setSSNumber("987675432");
        emp1.setFirstName("Alex");
        emp1.setLastName("Bob");
        emp1.setDateOfBirth("2/21/1971");
        emp1.setAddress("2276 bristol");
        emp1.
    }
}
