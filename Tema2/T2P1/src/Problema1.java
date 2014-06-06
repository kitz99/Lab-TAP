/*
 Sa se parcurga un arbore binar in preordine, inordine si postordine
 */

/**
 *
 * @author Bogdan a.k.a SK
 */
import java.util.*;
public class Problema1 {
    static Integer [] st;
    static Integer [] dr;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numarul de noduri din arbore: "); n = sc.nextInt();
        st = new Integer [n+1];
        dr = new Integer [n+1];
        System.out.println("Introduceti nodurile arborelui precizand fiul "
                + "stang si fiul drept. Daca unul dintre acestia nu exista, introduceti 0 ");
        for(int i = 1; i <= n; i++){
            System.out.print("ST lui " + i); st[i] = sc.nextInt();
            System.out.print("DR lui " + i); dr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Preordine: "); preordine(1); System.out.println();
        System.out.print("Inordine: "); inordine(1); System.out.println();
        System.out.print("Postordine: "); postordine(1); System.out.println();
    }
        static void preordine(int x){
            if(x == 0);
            else {
                System.out.print(x + " ");
                preordine(st[x]);
                preordine(dr[x]);
            }
        }
        
        static void inordine(int x){
            if(x == 0);
            else {
                inordine (st[x]);
                System.out.print(x + " ");
                inordine (dr[x]);
            }
        }
        
        static void postordine(int x){
            if(x == 0);
            else {
                postordine (st[x]);
                postordine (dr[x]);
                System.out.print(x + " ");
            }
        }
}
