package suma_maxima;
import java.util.*;
public class Suma_maxima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList < Integer > V;
        V = new LinkedList < Integer >();
        for(int i = 0; i < n; i++){
            V.add(sc.nextInt());
        }
        int s = V.getFirst();
        int Smax = s;
        for(int i = 1; i < n; i++){
            s += V.get(i);
//            System.out.print(V.get(i) + "+");
            if(s < 0) s = 0;
            if(s > Smax) Smax = s;
        }
        System.out.println("Cea mai mare suma de numere de pe pozitii consecutive este: " + Smax);
    }
}
