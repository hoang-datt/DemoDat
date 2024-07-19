/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timsolonnhat;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TimSoLonNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a: ");
        float a = sc.nextFloat();
        
        System.out.println("Enter the value of b: ");
        float b = sc.nextFloat();
        
        float largest = a;
        
        if(b > a) {
            largest = b;
        }
        
        System.out.println("the middle largest number " + a + " and " + b + " is: " + largest);
    }
}
