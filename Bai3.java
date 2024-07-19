/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the electricity consumption number (In kWh): ");
        float electricity = sc.nextFloat();
        
        float ELECTRICITY_PRICE = 1500;
        
        float totalBill = electricity * ELECTRICITY_PRICE;
        
        System.out.println("The total electricity bill is: " + totalBill);
    }
}
