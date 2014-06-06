/*
 * Sa se determine cel mai lung subsir crescator al unui sir de numere intregi 
 * dat;
 */
package pd;

import java.util.*;
import java.io.*;
/**
 *
 * @author bogda_000
 */
public class SCrM {
    static int n;
    static int[] v;
    static int [] L;
    static Scanner sc;
    static PrintWriter pw;
    static int maxl = Integer.MIN_VALUE;
    static int indice;
    public static void main(String [] Args){
        try{
            sc = new Scanner(new File("SCrM.in"));
        }catch(FileNotFoundException e){
            System.out.println("Fisierul de intrare nu a fost gasit");
        }
        try{
            n = sc.nextInt();
        } catch(Exception e){
            System.out.println("Not a number!");
        }
        v = new int[n+1];
        L = new int[n+1];
        try{
            for(int i = 1; i <= n; i++)
                v[i] = sc.nextInt();
        }catch(Exception ex){
            System.out.println("Vector invalid!");
        }
        L[n] = 1;
        for(int k = n-1; k >=1; k--){
            int mx = 0;
            for(int i = k+1; i <= n; i++)
                if(v[k] < v[i] && L[i] > mx){
                    mx = L[i]; 
                }
            L[k] = mx + 1;
            if(L[k] > maxl){
                maxl = L[k];
                indice = k;
            }
        }
        try{
            pw = new PrintWriter(new File("SCrM.out"));
        }catch(FileNotFoundException ex){
            System.out.println("Eroare fisier de iesire!");
        }
        pw.write(maxl + "\n");
        pw.write(v[indice] + " ");
        int poz = indice;
        for(int i = indice + 1; i <= n; i++)
            if((v[poz] < v[i]) && (L[i] == maxl-1)){
                poz ++;
                pw.write(v[i] + " ");
                maxl --;
            }
        pw.close();
        sc.close();
    }
}
