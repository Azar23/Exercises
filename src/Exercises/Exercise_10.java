/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

import java.util.Scanner;
import utility.Util;

/**
 *
 * @author Azer
 */
public class Exercise_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int value1=sc.nextInt();
        System.out.println("Ededi daxil edin:");
        int value2=sc.nextInt();
        System.out.println("Quvveti daxil edin:");
        int power=sc.nextInt();
        Util.PowerMethod(value1,value2,power);
    }
}
