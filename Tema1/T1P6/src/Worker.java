import java.util.*;
public class Worker {
    public static void main(String [] Args){
        Integer n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("n= "); n = sc.nextInt();
        System.out.print("m= "); m = sc.nextInt();
        System.out.println("conversie: " + Integer.toString(n, m).toUpperCase()); // varianta smart like a boss
        sc.close();
        conversie(n, m); // varianta noob
        }
    
    public static void conversie(int n, int m){
            if(n == 0) return;
            conversie(n/m, m);
            System.out.print(n%m);
            
    }
}
