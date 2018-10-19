/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punkt;

public class JavaApplicationMR1{
    
    public static void main(String[] args){
    
    Punkt p = new Punkt(1,2);
        System.out.println(p.x+", "+p.y);
    p.wyzeruj();
        System.out.println(p.x+", "+p.y);
    p.przesun(2, 3);
        System.out.println(p.x+", "+p.y);
        System.out.println(p);
          
    }
}