package tema3;
import java.util.*;
/**
 *
 * @author Bogdan aka SK
 */
public class Tema3 {

    static Scanner sc;
    static int choice;
    
    public static void main(String[] args) {
        double x, y;
        sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();
        System.out.println("Alegeti operatia ce se va efectua intre " + 
                x +" si " + y);
        dialog(x, y);
    }

    public static void menu(){
        System.out.println("******************************");
        System.out.println("Pentru Adunare introduceti 1");
        System.out.println("Pentru Scadere introduceti 2");
        System.out.println("Pentru Produs introduceti 3");
        System.out.println("Pentru Cat introduceti 4");
        System.out.println("Pentru Radical din x introduceti 5");
        System.out.println("Pentru Radical din y introduceti 6");
        System.out.println("Pentru x^y introduceti 7");
        System.out.println("Pentru y^x introduceti 8");
        System.out.println("Pentru toate operatiile 9");
        System.out.println("Exit 0");
        System.out.print("Choice = ");
    }
    
    public static void dialog(double x, double y) {
        Operatii W = new Operatii();
        do {
            menu();
            choice = sc.nextInt();
            switch(choice){
                case 0: {
                    System.out.println("Goodbye!");
                    sc.close();
                    System.exit(0);
                }
                case 1:{
                    System.out.println(x + "  + " + y + " = " + W.adunare(x, y));
                    break;
                }
                case 2:{
                    System.out.println(x + "  - " + y + " = " + W.scadere(x, y));
                    break;
                }
                case 3: {
                    System.out.println(x + "  * " + y + " = " + W.produs(x, y));
                    break;
                }
                case 4:{
                    System.out.println(x + "  / " + y + " = " + W.cat(x, y));
                    break;
                }
                case 5: {
                    System.out.println("sqrt( " + x + " ) = " + W.radical(x));
                    break;
                }
                case 6: {
                    System.out.println("sqrt( " + y + " ) = " + W.radical(y));
                    break;
                }
                case 7: {
                    System.out.println(x + "^" + y + " = " + W.putere(x, y));
                    break;
                }
                case 8: {
                    System.out.println(y + "^" + x + " = " + W.putere(y, x));
                    break;
                }
                case 9: {
                    System.out.println(x + "  + " + y + " = " + W.adunare(x, y));
                    System.out.println(x + "  - " + y + " = " + W.scadere(x, y));
                    System.out.println(x + "  * " + y + " = " + W.produs(x, y));
                    System.out.println(x + "  / " + y + " = " + W.cat(x, y));
                    System.out.println("sqrt( " + x + " ) = " + W.radical(x));
                    System.out.println("sqrt( " + y + " ) = " + W.radical(y));
                    System.out.println(y + "^" + x + " = " + W.putere(y, x));
                    System.out.println(y + "^" + x + " = " + W.putere(y, x));
                    System.exit(0);
                }
                default: {
                    System.out.println("Alegere invalida!");
                    break;
                }
            }
        }
        while(true);
    }
}
