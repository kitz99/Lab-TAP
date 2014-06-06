package pd;

import java.util.*;
import java.io.*;

class Ruxac {
    static int n, g;
    static int [] W;
    static int [] P;
    static int [][] M;
    static Scanner sc;
    static PrintWriter pw;
    
    public static void main(String [] Args){
        try{
            sc = new Scanner(new File("ruxac.in"));
        }catch(FileNotFoundException ex){
            System.out.println("Eroare fisier intrare");
        }
        try{
            n = sc.nextInt();
            g = sc.nextInt();
        }catch(Exception ex){
            System.out.println("Not numbers");
        } 
        W = new int[n+1];
        P = new int[n+1];
        M = new int[n+1][g+1];
        try{
            for(int i = 1; i <= n; i++){
                W[i] = sc.nextInt();
                P[i] = sc.nextInt();
            }
        }catch(Exception ex){
            System.out.println("Date eronate");
        }
        for(int i = 1; i <= n; i++)
            for(int cw = 0; cw <= g; cw++){
                M[i][cw] = M[i-1][cw];
                if(W[i] <= cw)
                    if(M[i - 1][cw - W[i]] + P[i] > M[i][cw]) 
                        M[i][cw] = M[i - 1][cw - W[i]] + P[i];
            }
        try{
            pw = new PrintWriter(new File("ruxac.out"));
        }catch(Exception ex){
            System.out.println("Eroare la fisier de scriere");
        }
        pw.write(M[n][g] + " ");
        pw.close();
    }
}
