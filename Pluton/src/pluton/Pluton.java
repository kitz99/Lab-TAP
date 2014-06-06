package pluton;
import java.util.*;
import java.io.*;

class Soldat{
    public String soldat;
    public String Ssoldat;
    public Soldat(String s1, String s2){
        soldat = s1; Ssoldat = s2;
    }
}
public class Pluton {
    static int n;
    static int nrPlutoane, maxSoldati = Integer.MIN_VALUE, nrPltM;
    static Scanner sc;
    static PrintWriter pw;
    static Vector<Soldat> S;
    
    private static String set(String S){
        char [] t = S.toCharArray();
        Arrays.sort(t);
        String aux = "";
        for(int i = 0; i < t.length; i++)
            aux += t[i];
        return aux;
    }
    
    public static void main(String[] args) {
        try {
            sc = new Scanner(new File("pluton.in"));
            pw = new PrintWriter(new File("pluton.out"));
        } catch (FileNotFoundException ex) {
            System.out.println("Eroare fisiere");
        }
        n = sc.nextInt();
        S = new Vector<Soldat>();
        
        for(int i = 0 ; i < n; i++){
            String s1 = sc.next();
            String s2 = set(s1); 
            S.add(new Soldat(s1, s2));
        }
        nrPlutoane = 0; int nrC = 0;
        int [] numar = new int[n];
        int k = 0;
        String P = "";
        for(int i = 0; i < n ; i++){
            nrPlutoane++; nrC = 1; P = P + "@" + S.get(i).soldat + " ";//P = P + "@" + soldati.get(i) + " ";
            for(int j = i+1; j < n; j++)
                if(S.get(i).Ssoldat.equals(S.get(j).Ssoldat)){
                    P = P + S.get(j).soldat + " ";
                    S.remove(j);
                    n--; nrC++;
                }
            numar[++k] = nrC;
            if(nrC > maxSoldati) maxSoldati = nrC;
        }
        int nr =0;
        for(int i = 1; i <= k; i++)
            if(numar[i] == maxSoldati) nr++;
        pw.write(nrPlutoane + "\n" + maxSoldati + "\n" + nr + "\n");
        String [] p = P.split("@");
        for(int i = 1; i < p.length; i++){
            String [] S1 = p[i].split(" ");
            if(S1.length == maxSoldati) {pw.write(p[i]); break;}
        }
        pw.close();
    }
}
