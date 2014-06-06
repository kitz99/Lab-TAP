/*
 * BACKTRACKING
 */
package backtracking;

import java.util.LinkedList;
import java.util.Scanner;

public class Combinari {
    public static void comb(LinkedList <Integer> L, int n, int k){
        if(L.size() == k){ 
            System.out.println(L);
            return;
        }
        int aux = 0;
        if(!L.isEmpty()) {
            aux = L.peekLast();
        }
        for(int i = aux + 1; i <= n; i++){
            L.add(i);
            comb(L, n, k);
            L.removeLast();
        }
    }
    public static void perm(LinkedList <Integer> l, int n){
        if(l.size() == n){
            System.out.println(l);
            return;
        }
        for(int i = 1; i <= n; i++){
            if(l.contains(i)) continue;
            l.add(i);
            perm(l, n);
            l.removeLast();
        }
    }
    public static void aranj(LinkedList <Integer> l, int n, int k){
        if(l.size() == k){
            System.out.println(l);
            return;
        }
        for(int i = 1; i <= n; i++){
            if(l.contains(i)) continue;
            l.add(i);
            aranj(l, n, k);
            l.removeLast();
        }
    }
    public static void submultimi(LinkedList <Integer> l, int n){
        if(!l.isEmpty()) 
            System.out.println(l);
        int aux = 1;
        if(!l.isEmpty()){
            aux = l.peekLast() + 1;
        }
        for(int i = aux; i <= n; i++){
            l.add(i);
            submultimi(l, n);
            l.removeLast();
        }
    }
    public static void main(String [] Args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.close();
        LinkedList <Integer> L = new LinkedList<>();
        comb(L, n, k);
        System.out.println("-----------------------------");
        LinkedList <Integer> l = new LinkedList<>();
        perm(l, 3);
        System.out.println("-----------------------------");
        LinkedList<Integer> ll = new LinkedList<>();
        aranj(ll, n, k);
        System.out.println("-----------------------------");
        LinkedList<Integer> lll = new LinkedList<>();
        submultimi(lll, 3);
    }
}
