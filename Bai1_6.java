/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1_6;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a: ");
        float a = sc.nextFloat();
        
        System.out.println("Enter the value of b: ") ;
        float b = sc.nextFloat();
        
        System.out.println("Enter the value of c: ");
        float c = sc.nextFloat();  
        
        if(b + a > c && a + c > b && b + c > a) {
            float p = (a + b + c) / 2;
            float s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            
            float cosA = (b * b + c * c - a * a) / (2 * b * c);
            float tgA =(1 / (float) Math.sqrt(1 - cosA * cosA));
            float A = (float) Math.toDegrees((float) Math.cos(a));
            
            
            float cosB = (a * a + c * c - b * b) / (2 * a * c);
            float tgB =(1 / (float) Math.sqrt(1 - cosB * cosB));
            float B = (float) Math.toDegrees((float) Math.cos(b));
            
            float cosC = (a * a + b * b - c * c) / (2 * a * b);
            float tgC =(1 / (float) Math.sqrt(1 - cosC * cosC));
            float C = (float) Math.toDegrees((float) Math.cos(c));
            
            System.out.println("Perimeter: " + a + b + c);
            System.out.println("Area: " + s);
            System.out.println("Angle A: " + A);
            System.out.println("Angle B: " + B);
            System.out.println("Angle C: " + C);
        }else {
            System.out.println("The three number cant form a triangle.");
        }
    }
}
