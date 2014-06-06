import java.util.*;
public class Worker {
    
    static int n;
    
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Vector < Double > V = new Vector < Double >(n);
        for(int i = 0; i < n; i++){
            V.add(sc.nextDouble());
        }
        sc.close();
        Double Num = 0.0;
        for(int i = 0; i < n; i++){
            Num += (1/V.get(i));
        }
        System.out.println("Media armonica a numerelor este: " + (double)(n/Num));
    }
}
