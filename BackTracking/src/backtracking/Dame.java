/*
 * problema damelor
 * Se dau N dame. Sa se aranjeze pe o tabla N*N ai sa nu se atace
 */
package backtracking;

import java.util.*;

public class Dame {
    static int n;
    static int k;
    static int [] x;
    static boolean ok;
    static int count;
    
    public static void printSol(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(x[i] == j) System.out.print("X");
                else System.out.print("O");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String [] Args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Numer de regine: ");
       n = sc.nextInt();
       x = new int [n+1];
       k = 0;
       x[k] = -1;
       while(k >= 0){
           ok = false;
           while((x[k] < n-1) && (!ok)){
               ok = true;
               x[k]++;
               for(int i = 0; (i < k) && ok; i++){
                   if ((x[k] == x[i]) || (k - i == Math.abs((double)x[k] - x[i])))
                    ok = false;
               }
           }
           if(!ok) k--;
           else{
               if(k == n-1){
                   count++;
                   //printSol();
               }
               else {
                   k++;
                   x[k] = -1;
               }
           }
       }
       System.out.println(count + " solutii");
   } 
}
