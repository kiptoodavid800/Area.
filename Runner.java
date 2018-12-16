/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarea;

import java.util.Scanner;
import static myarea.myArea.areaCircle;
import static myarea.myArea.areaRectangle;
import static myarea.myArea.areaSquare;

/**
 *
 * @author Kiptoo David
 */
public class Runner {
        
    public static void main(String[] args) { 
        
        String area;
        
        Scanner scan = new Scanner(System.in);                        
        System.out.println("Find the Area of: ");
                
        area = scan.next();
        System.out.println(area);
                        
        if(area.equals("rectangle")){
            areaRectangle();
        }else if(area.equals("circle")){
            areaCircle();
        }else if(area.equals("square")){
            areaSquare();
        }else{
            System.out.println("IT DOESN'T EXISTS!!!");
        }
    }    
}
