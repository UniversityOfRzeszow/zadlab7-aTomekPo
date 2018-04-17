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
public class Student extends Osoba {
    int nr_indexu;
    String typStudiow;
    String kierunek;
    int rok;

    public Student(int nr_indexu, String typStudiow, String kierunek, int rok, String imie, String nazwisko, String data, String urodzenia, String plec) {
        super(imie, nazwisko, data, urodzenia, plec);
        this.nr_indexu = nr_indexu;
        this.typStudiow = typStudiow;
        this.kierunek = kierunek;
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Student{" + "nr_indexu=" + nr_indexu + ", typStudiow=" + typStudiow + ", kierunek=" + kierunek + ", rok=" + rok + '}';
    }

     
     
    public void setNr_indexu(int nr_indexu) {
        this.nr_indexu = nr_indexu;

    }

    public int getNr_indexu() {
        return nr_indexu;
    }

    public void setRok(int rok) {
        this.rok = rok;

    }

    public int getRok() {

        return rok;
    }

    public void setTypStudiow(String typStudiow) {

        this.typStudiow = typStudiow;
    }

    public String getTypStudiow() {

        return typStudiow;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public String getKierunek() {

        return kierunek;

    }

}
