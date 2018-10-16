
package Osoba;


public class NewClass {
    public static void main(String[] args){
    Osoba matka = new Osoba ("Anna", "Kowalska");
    Osoba ojciec = new Osoba ("Wiesław", "Kowalski");
    Osoba os = new Osoba("Jan","Kowalski", matka, ojciec);
        System.out.println(os);
    
    }
    
}
