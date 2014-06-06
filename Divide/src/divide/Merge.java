/*
 * MERGE SORT
 */
package divide;

import java.util.*;

public class Merge {
    static int n;
    static int[] v;
    
    public static void mergeSort(int left, int right){
        if(left < right){  
            int m = (left + right)/2;
            mergeSort(left, m);
            mergeSort(m+1, right);
            merge(left, m, right);
        }
    }
    public static void merge(int left, int m, int right){
        int i = left;
        int j = m+1;
        int [] aux = new int [right - left + 1];
        int k = 0;
        while((i <= m)&&(j <= right)){
            if(v[i] <= v[j]){
                aux[k++] = v[i++]; 
            }
            else{
                aux[k++] = v[j++];
            }
        }
        while(i <= m) aux[k++] = v[i++];
        while(j <= right) aux[k++] = v[j++];
        for(i = 0; i < k; i++){
            v[left+i] = aux[i];
        }
        
    }
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n="); n = sc.nextInt();
        v = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("v[" + i + "]=");
            v[i] = sc.nextInt();
        }
        mergeSort(0, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(v[i] + " ");
        }
    }
}
