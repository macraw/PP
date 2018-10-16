
package Pudełko;

public class Pudelko {
    int szer, dlug, wys;
    
    public Pudelko(int sz, int w, int d){
    this.szer = sz;
    this.dlug = d;
    this.wys = w;
    }
    
    public int objetosc(){
    int v = szer*wys*dlug;
    return v;
    
    }
 
}
