/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timnghiemptrinh2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TimNghiemPtrinh2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a: ");
        float a = sc.nextFloat();
        
        System.out.println("Enter the value of b: ");
        float b = sc.nextFloat();
        
        System.out.println("Enter the value of c: ");
        float c = sc.nextFloat();
        
        float delta = b * b - 4 * a * c;
        
        if(delta > 0) {
            System.out.println("The equation has two distinct solutions: " + delta);
        }else if(delta == 0) {
            System.out.println("The equation has a double solutions: " + delta);
        }else {
            System.out.println("The equation has no solution: " + delta);
        }
    }
}
