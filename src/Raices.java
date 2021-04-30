import java.util.Random;

public class Raices {

    private int a;
    private int b;
    private int c;


    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return (Math.pow(b, 2)-(4*a*c));
    }

    public boolean tieneRaices() {
        return ((Math.pow(b, 2)-(4*a*c)) >= 0);
    }

    public boolean tieneRaiz() {
        return ((Math.pow(b, 2)-(4*a*c)) == 0);
    }

    public double obtenerRaiz() {
        return (-b/2*a);
    }

    public String obtenerRaices() {
        Double solucionA = (-b+Math.sqrt((Math.pow(b, 2))-(4*a*c)))/(2*a);
        Double solucionB = (-b-Math.sqrt((Math.pow(b, 2))-(4*a*c)))/(2*a);
        return (solucionA.toString() + ", " + solucionB.toString());
    }

    public void calcular() {
        if (tieneRaiz()) {
            System.out.println(obtenerRaiz());
        }
        else if (tieneRaices()) {
            System.out.println(obtenerRaices());
        }
        else {
            System.out.println("No tiene soluciones reales.");
        }
    }
}
