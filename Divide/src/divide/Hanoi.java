/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package divide;

import java.util.*;
/**
 *
 * @author bogda_000
 */
public class Hanoi {
    static int n;
    public static void hanoi(int n, char from, char via, char to){
        if(n == 1){
            System.out.println("Discul 1 de pe tija " + from + " pe tija " + to);
        }
        else{
            hanoi(n-1, from, to, via);
            System.out.println("Discul " + n + " de pe tija " + from + " pe tija " + to); 
            hanoi(n-1, via, from, to);
        }
    }
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        hanoi(n, 'A', 'B', 'C');
    }
    
}
