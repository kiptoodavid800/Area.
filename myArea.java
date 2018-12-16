/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarea;

import java.util.Scanner;

/**
 *
 * @author Kiptoo David
 */
public class myArea {
    
    public static void areaRectangle(){
        int length, width;
        Scanner scan = new Scanner(System.in);
                
        System.out.println("Enter Length:");
        length = scan.nextInt();
        
        System.out.println("Enter Width: ");
        width = scan.nextInt();
        
        int area = length * width;
        System.out.println("Are of a Rectangle is = " + area);
    }
    
    public static void areaCircle(){
        double radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of the Circle: ");
        radius = scan.nextInt();
        
        double area = (3.142 * radius);
        System.out.println("Area of a Circle is = " + area);
    }
    
    public static void areaSquare(){
        int length;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter length ");
        length = scan.nextInt();
        int area = length * length;
        System.out.println("Area of a square is = " + area);
    }
}
