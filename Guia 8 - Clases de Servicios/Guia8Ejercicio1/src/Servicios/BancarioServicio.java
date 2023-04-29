
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;


public class BancarioServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    public BancarioServicio() {
    }
  
    public CuentaBancaria craearCuenta() {
        System.out.println("Ingrese número de cuenta");
        int numcuenta = leer.nextInt();
        System.out.println("Ingrese su número de DNI");
        long dni = leer.nextLong();
        System.out.println("Ingrese su saldo actual");
        double saldo = leer.nextDouble();
        return new CuentaBancaria (numcuenta, dni, saldo);
    }
  
    public void ingresar(CuentaBancaria cuenta, double cantidad) {
        cuenta.setSaldo(cuenta.getSaldo()+ cantidad);
    }
  
    public void retirar(CuentaBancaria cuenta, double cantidad) {
        if (cuenta.getSaldo() < cantidad) {
            cantidad = cuenta.getSaldo();
        }
        cuenta.setSaldo(cuenta.getSaldo() - cantidad);
    }
    
  
    public void extraccionRapido(CuentaBancaria cuenta) {
        double cantidad = cuenta.getSaldo() * 0.2;
        cuenta.setSaldo(cuenta.getSaldo() - cantidad);
    }
    
  
    public double consultarSaldo(CuentaBancaria cuenta) {
        return cuenta.getSaldo();
    }
  
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumcuenta());
        System.out.println("DNI del cliente: " + cuenta.getDni());
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
