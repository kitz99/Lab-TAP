/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author bogda_000
 */
public class Automobil {
    Automobil(){
        System.out.println("Automobil!");
    }
    public void calc(int dist, int timp){
        System.out.println("Viteza = " + ((double)dist/timp) );
    }
}
