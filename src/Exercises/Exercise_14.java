/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

import utility.Util;

/**
 *
 * @author Azer
 */
public class Exercise_14 {
    public static void main(String[] args) {
        System.out.println("Enter 1st number:");
        double a=Util.EnterinDoubleNumber();
        System.out.println("Enter 2nd number:");
        double b=Util.EnterinDoubleNumber();
        System.out.println("Enter 3rd number:");
        double c=Util.EnterinDoubleNumber();
        System.out.println("Enter 4th number:");
        double d=Util.EnterinDoubleNumber();
        System.out.println(Util.Order(a, b, c, d));
    }
}
