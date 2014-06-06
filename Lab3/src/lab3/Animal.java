/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author bogda_000
 */
public class Animal {
    public String nume;
    public Animal(){
        System.out.println("Acesta este un animal");
    }
    public Animal (String n){
        nume = n;
    }
    public void mananca(){
        System.out.println("Sunt animal si mananc Fast Food");
    }
}
