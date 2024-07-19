/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1_10;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter date, month, year: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        
        if(isValidDate(d, m, y)) {
            System.out.println("Next day: " + getNextday(d, y, m));
        }else {
            System.out.println("Invalid Date");
        }
    }

    private static boolean isValidDate(int d, int m, int y) {
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return d >= 1 && d <= 31;
            case 4: case 6: case 9: case 11:
                return d >= 1 && d <= 30;
            case 2:
                if(isLeapYear(y)) {
                    return d >= 1 && d <= 29;
                }else {
                    return d >= 1 && d <= 28;
                }
            default:
                return false;
        }
    }
    
    private static boolean isLeapYear(int y) {
        return(y % 4 == 0 && y % 100 == 0 && y % 400 ==0);
    }
    
    private static String getNextday(int d, int y, int m) {
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10:
                if (d <= 31) {
                    return (d + 1) + "/" + m + "/" + y;
                }else {
                    return "1/" + (m + 1) + "/" + y;
                }
            case 4: case 6: case 9: case 11:
                if(d <= 30) {
                    return (d + 1) + "/" + m + "/" + y;
                }else {
                    return "1/" + (m + 1) + "/" + y;
                }
            case 2:
                if(d <= 29) {
                    return (d + 1) + "/" + m + "/" + y;
                }else {
                    return "1/" + (m + 1) + "/" + y;
                }
            case 12:
                if(d < 31) {
                    return (d + 1) + "/" + m + "/" + y;
                }else {
                    return "1/1" + "/" + ( y + 1);
                }
            default:
                return "";
        }
    }
}
