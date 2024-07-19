/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        
        float PI = (float) 3.14159;
        
        float circumference = 2 * PI * radius;
        float area = PI * radius * radius;
        
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println("The area of the circle is: " + area);
    }
}
