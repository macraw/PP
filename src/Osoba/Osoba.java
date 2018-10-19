
package Osoba;


public class Osoba {
    private String imie, nazwisko;
    private Osoba matka, ojciec;
    
    public Osoba(String imie, String nazwisko, Osoba matka, Osoba ojciec){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.matka = matka;
    this.ojciec = ojciec;
    }
    public Osoba(String imie, String nazwisko){
    this.imie = imie;
    this.nazwisko = nazwisko;
    }
public String toString(){
       return imie+" "+ nazwisko+"\n"+"\t"+"(ojciec:)" +ojciec+"\n"+"\t"+"(matka:) "+matka;
    }
}
