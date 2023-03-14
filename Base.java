/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitro 5
 */
public class Base {
    public static void main (String Args[]){
        Sub i = new Sub();
        i.setHeight(15);
        i.setBase(20);
        i.setArea(300);
        
        int l = i.getHeight();
        int m = i.getBase();
        int k = i.getArea();
        int a = (k * 2);
        
        
        System.out.println("Height " + l );
        System.out.println("Base " + m);
        System.out.println("Area " + k);
        System.out.print("Total Area of 2 same parallelogram : " + a);
    }
}