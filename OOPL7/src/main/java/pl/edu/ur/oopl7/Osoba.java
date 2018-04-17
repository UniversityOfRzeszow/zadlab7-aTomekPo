/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Osoba {
    
     String imie;
     String nazwisko;
     String data;
     String urodzenia;
     String plec;

    public Osoba(String imie, String nazwisko, String data, String urodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data = data;
        this.urodzenia = urodzenia;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Osoba{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", data=" + data + ", urodzenia=" + urodzenia + ", plec=" + plec + '}';
    }
    
    
    
    
    
    
     
    
     
     
}
