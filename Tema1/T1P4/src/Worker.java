import java.util.*;
public class Worker {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        double pi = 0;
        for(int i = 0; i <= n; i++){
            pi += Math.pow((double)-1, (double)i)*(1.0/(2*i+1));
        }
        pi*=4;
        System.out.println("Pi ~ " + pi);
    }
}
