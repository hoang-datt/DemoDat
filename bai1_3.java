/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timnghiemptrinh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TimNghiemPtrinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a: ");
        float a = sc.nextFloat();
        
        System.out.println("Enter the value of b");
        float b = sc.nextFloat();
        
        float solution = (float) - b / a;
        
        if(a == 0) {
            if(b == 0) {
            System.out.println("The equation has infinity many solutions.");
        }else {
            System.out.println("The equation has no solution.");
        }
        }else {
            System.out.println("The solution of the equation is: " + solution);
    }
    }
}
