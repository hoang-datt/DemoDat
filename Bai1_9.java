/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1_9;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = n / 100;
        
        if(n < 100 || n > 999) {
            System.out.println("Enter a two-digit number: ");
        }else {
            switch (c) {
                case 1:
                    System.out.println("Một Trăm");
                    break;
                case 2:
                    System.out.println("Hai Trăm");
                    break;
                case 3:
                    System.out.println("Ba Trăm");
                    break;
                case 4:
                    System.out.println("Bốn Trăm");
                    break;
                case 5:
                    System.out.println("Năm Trăm");
                    break;
                case 6:
                    System.out.println("Sáu Trăm");
                    break;
                case 7:
                    System.out.println("Bảy Trăm");
                    break;
                case 8:
                    System.out.println("Tám Trăm");
                    break;
                case 9:
                    System.out.println("Chín Trăm");
                    break;    
            }
        }    
        if(b % 10 == 0 && a != 0){
            System.out.println("lẻ ");
        }
            switch(b) {
                case 1:
                    System.out.println("Mười");
                    break;
                case 2:
                    System.out.println("Hai Mươi");
                    break;
                case 3:
                    System.out.println("Ba Mươi");
                    break;
                case 4:
                    System.out.println("Bốn Mươi");
                    break;
                case 5:
                    System.out.println("Năm Mươi");
                    break;
                case 6:
                    System.out.println("Sáu Mươi");
                    break;
                case 7:
                    System.out.println("Bảy Mươi");
                    break;
                case 8:
                    System.out.println("Tám Mươi");
                    break;
                case 9:
                    System.out.println("Chín Mươi");
                    break;
        }
            switch (a) {
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bốn");
                    break;
                case 5:
                    System.out.println("Năm");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("Bảy");
                    break;
                case 8:
                    System.out.println("Tám");
                    break;
                case 9:
                    System.out.println("Chín");
                    break;
            }
    }
}
