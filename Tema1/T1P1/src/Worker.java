import java.util.*;
public class Worker {
    static int n;
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Vector < NumarP > V = new Vector < NumarP >(n);
        for(int i = 0; i < n; i++){
            V.add(new NumarP(sc.nextDouble(), sc.nextDouble()));
        }
        sc.close();
        double num = 0, P = 0;
        for(int i = 0; i < n; i++){
            num += (V.get(i).a * V.get(i).p);
            P += V.get(i).p;
        }
        System.out.println("Media ponderata = " + (num/P));
    }
}
