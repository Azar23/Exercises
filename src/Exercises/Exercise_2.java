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
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int value=sc.nextInt();
        Util.PrimeNumbersFromZero(value);
    }
}
