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
public class Poduszkowiec implements pojazdLadowy, pojazdWodny{

    @Override
    public void jade() {
       System.out.println("jazda");
    }

    @Override
    public void plyne() {
         System.out.println("plyne");
    }
    
}
