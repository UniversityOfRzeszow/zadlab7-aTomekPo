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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Osoba banan1 = new Osoba("Banan1 ", "NazwiskoBanana", "Data banana", "Urodzenie banana", "bezplciowy");
        Student studen1 = new Student(1233, "stacjonarne", "infa   ", 1, "Jan", "Kowalski", "data jana", "urdozebnie Jana", "mezczyzna");
        
        System.out.println(banan1.toString());
        
        System.out.println( studen1.toString());
        

// TODO code application logic here
    }

}
