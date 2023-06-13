package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;



public class CuentaBancariaServicio {
    private  Scanner leer;

    public CuentaBancariaServicio() {

        this.leer = new Scanner(System.in);
    }


    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese su numero de cuenta: ");
        int numcuenta = leer.nextInt();
        System.out.println("Ingrese su DNI: ");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese su saldo inicial: ");
        double saldoActual = leer.nextDouble();

        return new CuentaBancaria(numcuenta,dniCliente,saldoActual);
    }

    public void ingresar (CuentaBancaria cuenta,double cantidad){
        double saldo = cuenta.getSaldoActual();
        int  cantidad;
        saldo += cantidad;
        cuenta.setSaldoActual(saldo);
    }
    public void retirar (CuentaBancaria cuenta, double cantidad) {
        double saldo = cuenta.getSaldoActual();
        if (cantidad <= saldo) {
            saldo -= cantidad;
            cuenta.setSaldoActual(saldo);
        } else {
            System.out.println("No tiene suficiente manto en la cuenta, su monto total retirado es de: " + saldo);
            cuenta.setSaldoActual(0);
        }
    }

    public void extraccionRapida (CuentaBancaria cuenta){
        double saldo = cuenta.getSaldoActual();
        if (saldo == 0){
            System.out.println("No tiene dinero en su cuenta");
        }
        else {
            double extraccionrapida = saldo * 0.2;
            saldo -= extraccionrapida;
            cuenta.setSaldoActual(saldo);
            System.out.println("Su retiro es de: $"+extraccionrapida);
        }
    }

    public void consultarSaldo (CuentaBancaria cuenta){
        System.out.println("Su saldo actual es de: $"+cuenta.getSaldoActual());
    }

    public void consultarDatos (CuentaBancaria cuenta){
        System.out.println("Numero de cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("DNI: "+cuenta.getDniCliente());
        System.out.println("Saldo de la cuenta: $"+cuenta.getSaldoActual());
    }
}
