/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1_8;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the solar calendar: ");
        int year = sc.nextInt();
        String can = "";
        String chi = "";
        
        switch (year % 10) {
            case 0:
                can = "Canh";
                break;
            case 1:
                can = "Tân";
                break;
            case 2:
                can = "Nhâm";
                break;
            case 3:
                can = "Quý";
                break;
            case 4:
                can = "Giáp";
                break;
            case 5:
                can = "Ất";
                break;
            case 6:
                can = "Bính";
                break;
            case 7:
                can = "Đinh";
                break;
            case 8:
                can = "Mậu";
                break;
            case 9:
                can = "Kỷ";
                break;    
        }
        switch (year % 12) {
            case 0:
                chi = "Tý";
                break;
            case 1:
                chi = "Sửu";
                break;
            case 2:
                chi = "Dần";
                break;
            case 3:
                chi = "Mẹo";
                break;
            case 4:
                chi = "Thình";
                break;
            case 5:
                chi = "Tỵ";
                break;
            case 6:
                chi = "Ngọ";
                break;
            case 7:
                chi = "Mùi";
                break;
            case 8:
                chi = "Thân";
                break;
            case 9:
                chi = "Dậu";
                break; 
            case 10:
                chi = "Tuất";
                break;
            case 11:
                chi = "Hợi";
                break;    
        }
        System.out.println("The lunar year corresponds to the solar year " + year + " is " + (can + " " + chi));
    }
}
