/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the two bottom sides of the trapezoid: ");
        float length1 = sc.nextFloat();
        float length2 = sc.nextFloat();
        
        System.out.println("Enter the height of the trapezoid");
        float heigth = sc.nextFloat();
        
        float area = (length1 + length2) * heigth / 2;
        
        System.out.println("Area of the trapezoid: " + area);
    }
}
