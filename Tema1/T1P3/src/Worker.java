import java.util.*;
public class Worker {
    public static void main(String [] Args){
        Vector < Double > V = new Vector < Double > (3);
        Scanner sc = new Scanner(System.in);
        System.out.print("a = "); V.add(sc.nextDouble()); 
        System.out.print("b = "); V.add(sc.nextDouble()); 
        System.out.print("c = "); V.add(sc.nextDouble()); 
        sc.close();
        Collections.sort(V);
        if((Math.pow(V.get(0), 2) + Math.pow(V.get(1), 2)) == Math.pow(V.get(2), 2)){
            System.out.println("Numerele sunt pitagoreice");
        }
        else 
            System.out.println("Numerele nu sunt pitagoreice");
    }
    
}
