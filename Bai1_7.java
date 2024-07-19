/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1_7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble();
        
        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble();
        
        System.out.println("Enter the value of c: ");
        double c = sc.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a){
            if(a == b && b == c) {
                System.out.println("This is an equilateral triangle.");
            }else if(a == b || a == c || b == c ) {
                System.out.println("This is an isosceles triangle.");
            }else if(a * a + b * b == c * c || b * b + c * c == a * a) {
                System.out.println("This is a right triangle.");
            }else if(a == b && a * a + b * b == c * c) {
                System.out.println("This is an isosceles right triangle");
            }else {
                System.out.println("This is a scalene triangle.");
            }
        }else {
            System.out.println("Can't form the triangle.");
        }
    }
}
