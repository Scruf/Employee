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
        emp2 = new Employee("123456","Egor","Kozitski","01/02/1987","21312 Anegra","123431234","ekozitski@hotmail.com","software developer");
        System.out.println("Testing constructors by calling Print()");
        System.out.println();
        System.out.println("emp1 data after default constructor creation");
        emp1.print();
        System.out.println();
        System.out.println("emp2 data after parameterized constructor");
        emp2.print();
        System.out.println();
        System.out.println("TESTING INSTANCE GETTER/SETTER METHODS(PROPERTIES)");
        System.out.println();
        System.out.println("Calling SETTER METHODS to SET DATA (Properties)");
        emp1.setSSNumber("987675432");
        emp1.setFirstName("Alex");
        emp1.setLastName("Bob");
        emp1.setDateOfBirth("2/21/1971");
        emp1.setAddress("2276 bristol");
        emp1.setEmail("zkazitsakay@outlook.com");
        emp1.setPhone("23412344");
        emp1.setJobTitle("Leader of the random group of people");
        System.out.println("Displaying  employee1 data via GETTER METHODS");
        System.out.println(emp1.getFirstName());
        System.out.println(emp1.getLastName());
        System.out.println(emp1.getDateOfBirth());
        System.out.println(emp1.getSSNumber());
        System.out.println(emp1.getPhone());
        System.out.println(emp1.getEmail());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getJobTitle());
        System.out.println();
        System.out.println("Calling print method for emp1");
        emp1.print();
        System.out.println();
        System.out.println("Calling print method for emp2");
        emp2.print();
        System.out.println ();
        System.out.println("Calling STATIC SETTER METHOD to set count to 1");
        Employee.setCount(1);
        
        System.out.println("DISPLAYING STATIC Count via STATIC GETTER ETHOD");
        System.out.println("The Employee Class Cound daya = "+Employee.getCount());
        System.out.println();
        System.out.println();
        
    }
}
