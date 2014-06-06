/*
 * Sa se determine cel mai lung subsir comun a doua siruri de numere intregi
 */
package pd;

import java.util.*;
import java.io.*;
/**
 *
 * @author bogda_000
 */
public class CMLSC {
    static int N, M;
    static int [] a;
    static int [] b;
    static int [][] D;
    static Scanner sc;
    static PrintWriter pw;
    
    public static void main(String [] Args){
        try{
            sc = new Scanner(new File("cmlsc.in"));
        } catch(Exception ex){
            System.out.println("Eroare fisier de intrare");
        }
        try{
            N = sc.nextInt();
            M = sc.nextInt();
        } catch(Exception ex){
            System.out.println("Not a number1!");
        }
        a = new int[N+1];
        b = new int[M+1];
        D = new int [N+1][M+1];
        try{
            for(int i = 1 ; i <= N; i++){
                a[i] = sc.nextInt();
            }
            for(int j = 1 ; j <= M; j++){
                b[j] = sc.nextInt();
            }
        }catch(Exception ex){
            System.out.println("Not a number2!");
        }
        // determinare subsir
        for(int i = 1; i <= N; i++)
            for(int j = 1; j <= M; j++)
                if(a[i] == b[j]) 
                    D[i][j] = D[i-1][j-1] + 1;
                else{
                    if(D[i-1][j] >= D[i][j-1])
                        D[i][j] = D[i-1][j];
                    else D[i][j] = D[i][j-1];
                }    
        // end determinare
        try{
            pw = new PrintWriter(new File("cmlsc.out"));
        }catch(Exception ex){
            System.out.println("Eroare fisier de scriere");
        }
        pw.write(D[N][M] + "\n");
        printSir(N, M);
        pw.close();
    }

    private static void printSir(int k, int h) {
        if(D[k][h]!=0){
        if(a[k] == b[h]){
            printSir(k-1, h-1);
            pw.write(a[k] + " ");
        }
        else if(D[k-1][h] >= D[k][h]){
            printSir(k-1, h);
        }
        else printSir(k, h-1);
        }
    }
        
}
