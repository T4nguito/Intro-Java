
package guia8ejercicio1;

import Entidad.CuentaBancaria;
import Servicios.BancarioServicio;
import java.util.Scanner;
/**
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con
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
2
 */
public class Guia8Ejercicio1 {    

    public static void main(java.lang.String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        BancarioServicio servicio = new BancarioServicio();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de cuenta:");
        cuenta.setNumcuenta(scanner.nextInt());

        System.out.println("Ingrese el DNI del cliente:");
        cuenta.setDni(scanner.nextLong());

        System.out.println("Ingrese el saldo actual:");
        cuenta.setSaldo(scanner.nextDouble());

        servicio.crearCuenta(cuenta);

        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Realizar extracción rápida");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar datos de la cuenta");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cantidad a ingresar:");
                double cantidadIngresar = scanner.nextDouble();
                servicio.ingresar(cuenta, cantidadIngresar);
                System.out.println("El nuevo saldo es: " + servicio.consultarSaldo(cuenta));
                break;
            case 2:
                System.out.println("Ingrese la cantidad a retirar:");
                double cantidadRetirar = scanner.nextDouble();
                servicio.retirar(cuenta, cantidadRetirar);
                System.out.println("El nuevo saldo es: " + servicio.consultarSaldo(cuenta));
                break;
            case 3:
                servicio.extraccionRapida(cuenta);
                System.out.println("El nuevo saldo es: " + servicio.consultarSaldo(cuenta));
                break;
            case 4:
                System.out.println("El saldo actual es: " + servicio.consultarSaldo(cuenta));
                break;
            case 5:
                servicio.consultarDatos(cuenta);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}