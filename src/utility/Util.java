/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Scanner;

/**
 *
 * @author Azer
 */
public class Util {
    
    public static void find(int value,int divideby){
        for(int i=0;i<=value;i++){
            if(i%divideby==0){
                System.out.println(i);
            }      
        }
    }
    
    public static void findValueBy2(int value){
        find(value,2);
    }
    
    public static boolean isPrime(int value){
        int flag=0;
        for(int i=2;i<=value-1;i++){
            if(value%i==0){
                flag=-1;
                break;
            }
        }    
        if(flag==0 && value>=2){
            return true;
        }else{
            return false;
        }
    }
    
    public static void PrimeNumbersBetween(int begin,int end){
        for(int i=begin;i<=end;i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
    
    public static void PrimeNumbersFromZero(int value){
        PrimeNumbersBetween(0,value);
    }
    
    public static int SumOfDigits(int value){
        int sum=0;
        while(value>0){
            int remainder=value%10;
            value=value/10;
            sum+=remainder;
        }
        return sum;
    }
    
    public static int NumberOfDigits(int value){
        int count=0;
        while(value>0){
            int remainder=value%10;
            value=value/10;
            count+=1;
        }
        return count;
    }
    
    public static int NonRecursiveFactorial(int value){
        int result=1;
        for(int i=2;i<=value;i++){
            result*=i;
        }
        return result;
    }
    
    public static int RecursiveFactorial(int value){
        if(value==0){
            return 1;
        }else{
            return value*RecursiveFactorial(value-1);
        }
    }
    
    public static boolean isReverseEqual(String s){
        int size=s.length();
        for(int i=0;i<size/2;i++){
            if(!(s.charAt(i)==s.charAt(size-i-1))){
                return false;
            }
        }
        return true;
    }
    
    public static int FindReverse(int value){
        int reverse=0;
        while(value>0){
            reverse*=10;
            reverse+=(value%10);
            value/=10;
        }
        return reverse;
    }
    
    public static boolean FindPalindrom(int value){
        return value==FindReverse(value);
    }
    
    public static void foo(int a,char c,boolean altAlta){
        for(int i =0;i<=a;i++){
            if(altAlta==true){
                System.out.println(c);
            }else{
                System.out.print(c);
            }            
        } 
        System.out.println("");
    }
    
    public static void PowerMethod(int a,int b,int power){
        for(int i=a;i<=b;i++){
            System.out.println(i+"^"+power+"="+(int)(Math.pow(i,power))+" ");
        }
    }
    
    public static int Sign(double value){
        if(value<0){
            return -1;
        }
        if(value>0){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public static double EnterinDoubleNumber(){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        return a;
    }
    
    public static boolean Equality(double a,double b,double c,double d){
        if(a==b||a==c||a==d||b==c||b==d||c==d){
            return true;    
        }
        else{
            return false;
        }
    }
    
    public static boolean Order(double a,double b,double c,double d){
        if(a<b && b<c && c<d){
            return true;    
        }
        else{
            return false;
        }
    }
}

