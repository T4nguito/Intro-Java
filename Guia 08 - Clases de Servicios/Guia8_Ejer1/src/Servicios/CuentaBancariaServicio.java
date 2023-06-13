package Servicios;
/* Metodos
 Agregar la clase CuentaBancariaServicio en el paquete Servicios que
 contenga:
    a) Método para crear cuenta pidiéndole los datos al usuario.
    b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
    se le sumará al saldo actual.
    c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
    restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
    retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
    Validar que el usuario no saque más del 20%.
    e) Método consultarSaldo: permitirá consultar el saldo disponible en la
    cuenta.
    f) Método consultarDatos: permitirá mostrar todos los datos de la
    cuenta.
2 */
import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio{
    private Scanner leer;

    public CuentaBancariaServicio(){
        this.leer = new Scanner(System.in);
    }
    public CuentaBancaria crearCuenta(){
        System.out.println("Crear Cuenta Bancaria");
        System.out.println("Ingrese los numeros Usuario: ");
        int numeroCuenta = this.leer.nextInt();
        System.out.println("Ingrese el DNI: ");
        long dniCliente = this.leer.nextLong();
        System.out.println("Ingrese el Saldo Inicial: ");
        double saldoActual = this.leer.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);

    }

    public void ingresar( CuentaBancaria cuenta, double cantidad){
        double saldo = cuenta.getSaldoActual();
        saldo += cantidad;
        cuenta.setSaldoActual(saldo);
    }

    public void retirar( CuentaBancaria cuenta, double cantidad){
        double saldo = cuenta.getSaldoActual();
        if(cantidad <= saldo){
            saldo -= cantidad;
            cuenta.setSaldoActual(saldo);

        }
        else{
            System.out.println("No se puede retirar esa cantidad. Maximo a retirar:  " + saldo);
            crearCuenta().setSaldoActual(0.0);
        }
    }

    public void extraccionRapido(CuentaBancaria cuenta){
        double saldo = cuenta.getSaldoActual();
        if(saldo == 0.0){
            System.out.println("Su cuenta no tiene fondos! Saldo: " + saldo);
        }
        else{
            double limite = 0.2;
            saldo -=limite;
            cuenta.setSaldoActual(saldo);

        }
    }

    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo actual es de: " +cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Numero de DNI: " + cuenta.getDniCliente());
        System.out.println("Saldo de la Cuenta: " + cuenta.getSaldoActual());
    }
}