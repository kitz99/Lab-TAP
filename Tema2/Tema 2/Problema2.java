/*
 Se da un vector de noduri. Verificati daca arborele format este un arbore de sortare.
 * pentru input a se verifica imaginea JPEG (pentru a evita confuziile
 */

/**
 *
 * @author Bogdan a.k.a SK
 */
import java.util.*;
public class Problema2 {
    static Integer [] st;
    static Integer [] dr;
    static Integer [] et;
    static Vector <Integer> inord;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numarul de noduri: "); n = sc.nextInt();
        st = new Integer [n+1];
        dr = new Integer [n+1];
        et = new Integer [n+1];
        inord = new Vector <Integer>(1000);
        for(int i = 1; i <= n; i++){
            System.out.println("Nodul " + i);
            System.out.print("ET nodului " + i + " "); et[i] = sc.nextInt();
            System.out.print("Vecin Stanga: "); st[i] = sc.nextInt();
            System.out.print("Vecin Dreapta: "); dr[i] = sc.nextInt();
        }
        sc.close();
        inordine(1);
        if(test()) System.out.println("Arborele este arbore binar de sortare");
        else System.out.println("Arborele nu este arbore binar de sortare");
    }
       
        static void inordine(int x){
            if(x == 0);
            else {
                inordine (st[x]);
                inord.add(et[x]);
                inordine (dr[x]);
            }
        }
        
        public static boolean test(){
            for(int i = 0; i < n-1; i++){
                if(inord.get(i) > inord.get(i+1))
                    return false;
            }
            return true;
        }
}
