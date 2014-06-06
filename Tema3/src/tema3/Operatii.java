package tema3;

/**
 *
 * @author Bogdan aka SK
 */
public class Operatii implements CalculatorStiintific{
    public double adunare(double x, double y){
        return (x + y);
    }
    public double scadere (double x, double y){
        return (x - y);
    }
    public double produs (double x, double y){
        return (x*y);
    }
    public double cat (double x, double y){
        return (x / y);
    }
    public double radical(double x){
        return (Math.sqrt(x));
    }
    public double putere(double x, double y){
        return (Math.pow(x, y));
    }
}
