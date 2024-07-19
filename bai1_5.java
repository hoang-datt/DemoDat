/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timdiemgiao;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TimDiemGiao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a1: ");
        float a1 = sc.nextFloat();
        
        System.out.println("Enter the value of b1: ");
        float b1 = sc.nextFloat();
        
        System.out.println("Enter the value of a2: ");
        float a2 = sc.nextFloat();
        
        System.out.println("Enter the value of b2: ");
        float b2 = sc.nextFloat();
        
        float intersectionMax = Math.max(a1, a2);
        float intersectionMin = Math.min(b1, b2);
        
        float intersectionLength = intersectionMax - intersectionMin;
        if(intersectionMin <= intersectionMax) {
            System.out.println("The intersection has a length of: " + intersectionLength);
        }else {
            System.out.println("There is not intersection.");
        }
        
        float unionMax = Math.max(a1, a2);
        float unionMin = Math.min(b1, b2);
        
        float unionLength = unionMax - unionMin;
        System.out.println("The union has a length of: " + unionLength);
    }
} 
