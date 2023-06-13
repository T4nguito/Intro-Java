package Entidad;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Raices {
    Scanner leer = new Scanner(System.in);

    public Raices crearRaices(){
        System.out.println("Ingrese el Coeficiente a: ");
        double a = leer.nextDouble();
        System.out.println("Ingrese el Coificiente b: ");
        double  b = leer.nextDouble();
        System.out.println("Ingrese el Coificiente c:");
        double  c = leer.nextDouble();
        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices r){
        return Math.pow(r.getB()), 2) - 4 * r.getA() * r.getC();
    }



}
