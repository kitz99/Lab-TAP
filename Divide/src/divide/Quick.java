/*
 * QUICKSORT
 */
package divide;
import java.util.*;
import java.io.*;

public class Quick {
    static int n;
    static int [] v;
    static Scanner sc;
    static PrintWriter pw;
    static Random rnd;
    
    public static void quickSort1(int left, int right){
        if(left >= right){
            return;
        }
        int m = v[left + rnd.nextInt() % (right - left)];
        int l = left, r = right;
        while(l < r){
            while(v[l] < m)
                l++;
            while(v[r] > m)
                r--;
            if(l <= r){
               int aux = v[l];
               v[l] = v[r];
               v[r] = aux;
               l++;
               r--;
            }
        }
        quickSort(left, r);
        quickSort(l, right);
    }
    public static void main(String [] Args){
        sc = new Scanner(System.in);
        n = sc.nextInt();
        v = new int[n];
        rnd = new Random();
        for(int i = 0; i < n; i++){
            v[i] = sc.nextInt();
        }
        quickSort1(0, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(v[i] + " ");
        }
    }
    public static void quickSort(int left, int right){
        if(left >= right){
            return;
        }
        int m = v[left + rnd.nextInt()%(right - left) + 1];
        int l = left;
        int r = right;
        while(l < r){
            while(v[l] < m){
                l++;
            }
            while(v[r] > m){
                r--;
            }
            if(l <= r){
                int aux = v[l];
                v[l] = v[r];
                v[r] = aux;
                l++;
                r--;
            }
        }
        quickSort(left, r);
        quickSort(l, right);
    }
}
