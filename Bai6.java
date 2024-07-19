/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        
        if(number % 2 == 0) {
            System.out.println("number " + number + " is even. ");
        }else {
            System.out.println("number " + number + " is odd. ");
        }
    }
}
