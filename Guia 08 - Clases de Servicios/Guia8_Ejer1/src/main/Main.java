package main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

import java.util.Scanner;

/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
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
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio bs = new CuentaBancariaServicio();
        CuentaBancaria cuenta = bs.crearCuenta();
        int selec = 0;
        while (selec != 6){
            System.out.println("==============================");
            System.out.println("Seleccione una opcion");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar deposito");
            System.out.println("3 - Realizar retiro");
            System.out.println("4 - Realizar extraccion rapida");
            System.out.println("5 - Consultar dato da la cuenta");
            System.out.println("6 - Salir");
            System.out.println("==============================");
            selec = leer.nextInt();

            switch (selec) {
                    case 1 : {
                        System.out.println("==============================");
                        bs.consultarSaldo(cuenta);
                        System.out.println("==============================");

                        continue;
                    }
                    case 2 : {
                        System.out.println("==============================");
                        System.out.println("Ingresar cantidad a depositar");
                        double cantidad = leer.nextDouble();
                        bs.ingresar(cuenta, cantidad);
                        System.out.println("==============================");
                        System.out.println("Se a realizado el deposito");
                        System.out.println("==============================");

                        continue;
                    }
                    case 3 : {
                        System.out.println("==============================");
                        System.out.println("Ingrese cantidad a retirar");
                        final double cantidadr = leer.nextDouble();
                        System.out.println("==============================");
                        bs.retirar(cuenta, cantidadr);

                        continue;
                    }
                    case 4 : {
                        System.out.println("==============================");
                        if (cuenta.getSaldoActual() == 0.0) {
                            System.out.println("No se puede realizar la extraccion rapida. el saldo actuade la cuenta es $0000");
                            System.out.println("==============================");

                        }
                        bs.extraccionRapido(cuenta);
                        System.out.println("Se ha realizado la extraccion rapida");
                        System.out.println("==============================");

                        continue;

                    }
                    case 5 : {
                        System.out.println("==============================");
                        bs.consultarDatos(cuenta);
                        System.out.println("==============================");

                        continue;
                    }
                    case 6 : {
                        System.out.println("==============================");
                        System.out.println("Gracias por usar el programa");
                        System.out.println("==============================");

                        continue;
                    }
                    default : {
                        System.out.println("==============================");
                        System.out.println("Opcion invalida, intente de nuevo");
                        System.out.println("==============================");
                    }
            }
        }
    }
}



