/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second integer:");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the third integer: ");
        int num3 = sc.nextInt();
        
        int largest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }
        if(num3 > largest) {
            largest = num3;
        }
        
        System.out.println("the largest number is: " + largest);
    }
}
