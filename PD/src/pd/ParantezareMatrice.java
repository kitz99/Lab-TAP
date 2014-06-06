/*
 * Se dau N matrice descrise prin numarul de linii respectiv nr de coloane
 * Sa se gaseasca o parantezare optima pentru a realiza produsul celor N matrice
 * facand cat mai putine inmultiri scalare
 */
package pd;

import java.util.*;
import java.io.*;
/**
 *
 * @author bogda_000
 */
public class ParantezareMatrice {
    static int N;
    static int[] D;
    static int[][] cost;
    static Scanner sc;
    static PrintWriter pw;
    
    public static void main(String [] Args){
        try{
            sc = new Scanner(new File("matrice.in"));
        }catch(FileNotFoundException ex){
            System.out.println("File not found!");
        }
        try{
            N = sc.nextInt();
        }catch(Exception ex){
            System.out.println("Not a number");
        }
        D = new int[N+1];
        cost = new int[N+1][N+1];
        
        try{
            for(int i = 0; i <= N; i++)
                D[i] = sc.nextInt();
        }catch(Exception ex){
            System.out.println("Vector invalid");
        }
        
        for(int j = 2; j <= N; j++){
            for(int i = j-1; i>=1; i--){
                int m = Integer.MAX_VALUE;
                for(int k = i; k < j; k++){
                    int aux = cost[i][k] + cost[k+1][j] + D[i-1]*D[k]*D[j];
                    if(aux  < m) m = aux;
                }
                cost[i][j] = m;
            }
        }
        try{
            pw = new PrintWriter(new File("matrice.out"));
        }catch(FileNotFoundException ex){
            System.out.println("Eroare fisier de scriere");
        }
        pw.write(cost[1][N] + " ");
        pw.close();
    }
}
