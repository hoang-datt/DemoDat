/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your weight (in kg): ");
        float weight = sc.nextFloat();
        
        System.out.println("Enter your height (in meter): ");
        float height = sc.nextFloat();
        
        float bmi = weight / (height * height);
        
        System.out.println("Your BMI is: " + bmi);
        
        if (bmi <18.5) {
             System.out.println("You are underweight.");
        }else if (bmi < 25) {
            System.out.println("You are normal weight.");
        }else if (bmi < 30) {
            System.out.println("You are overweight.");
        }else {
            System.out.println("You are obese.");
        }
    }
}
