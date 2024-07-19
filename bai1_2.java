/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tinhnamnhuan;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TinhNamNhuan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the calendar year: ");
        int year = sc.nextInt();
        
        if(isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }
        
        System.out.println("Enter the month(1-12): ");
        int month = sc.nextInt();
        
        int daysInMonth = getdaysInMonth(month, year);
        
        System.out.println("month " + month + " of" + " year " + year + " has " + daysInMonth + " days ");
        
        
    }

    private static boolean isLeapYear(int year) {
        return(year % 4 == 0 && year % 100 == 0 && year % 400 ==0);
    }

    private static int getdaysInMonth(int month, int year) {
        int daysInMonth = 0;
        
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:       
            case 9:        
            case 11: 
                daysInMonth = 30;
                break;
            case 2:
                if(isLeapYear(year)) {
                    daysInMonth = 29;
                }else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
        }
        return daysInMonth;
    }
}
