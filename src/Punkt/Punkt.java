/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punkt;

/**
 *
 * @author Student
 */
public class Punkt {
    int x,y;    
    public Punkt(int a, int b){
    x=a;
    y=b;
        
    }
    public void wyzeruj()
    {
    x=0;
    y=0;
    }
    public void przesun(int a, int b){
        x +=a;
        y +=b;
    
    }
    @Override
    public String toString()
    {
    return "("+x+", "+y+")";
    };
}

