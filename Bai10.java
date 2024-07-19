/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai10;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        
        if(isLeapYear(year)) {
            System.out.println(year + " Is a leap year. ");
        }else {
            System.out.println(year + " Is not a leap year. ");
        }
    }

    private static boolean isLeapYear(int year) {
        return(year % 4 == 0 && year % 100 == 0 && year % 400 ==0);
    }
}
