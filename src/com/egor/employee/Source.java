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
        Employee emp = new Employee();
        emp.setDateOfBirth("01/02/1993");
        System.out.print(emp.getAge());
    }
}
