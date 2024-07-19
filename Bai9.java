/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai9;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the character");
        char charInput = sc.next().charAt(0);
        
        if(Character.isUpperCase(charInput)) {
            System.out.println("This character is an uppercase letter.");
        }else if(Character.isLowerCase(charInput)) {
            System.out.println("This character is an lowercase letter.");
        }else {
            System.out.println("This character is not a letter");
        }
    }
}
