
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the rectangle: ");
        float length = sc.nextFloat();
            
        System.out.println("Enter the width of the rectangle: ");
        float width = sc.nextFloat();
            
        float perimeter = 2 * (length + width);
        float area = length * width;
            
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Area of the rectangle: " + area);
     
    }
}
