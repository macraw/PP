
package Uczeń;

public class Uczeń {
        private String nazwisko;
        private int ocena1, ocena2;
        
        public Uczeń(String nazwisko, int ocena1, int ocena2)
        {
            this.nazwisko = nazwisko;
            this.ocena1 = ocena1;
            this.ocena2 = ocena2;
        }
    public double średnia(){
    return (ocena1+ocena2)/2.0;
    }
    
        @Override
    public String toString(){
        return nazwisko+": "+ocena1+", "+ocena2+", ("+średnia()+")";
    }
    public void wstaw(int a, int b)
    {
        if(a >1 && a <6)
        {
        ocena1 = a;
        }
        if(b >1 && b <6)
        {
        ocena2 = b;
        }
    }
    }
