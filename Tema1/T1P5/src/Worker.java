import java.util.*;
public class Worker {
    public static void main(String [] Args){
        long t1 = 1, t2 = 1, t3;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print(t1 + " " + t2 + " ");
        n-=2;
        while(n>0){
            t3 = t1 + t2;
            System.out.print(t3 + " ");
            t1 = t2; t2 = t3;
            n --;
        }
    }
}
