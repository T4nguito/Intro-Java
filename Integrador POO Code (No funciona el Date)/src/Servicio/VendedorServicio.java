package Servicio;

import java.sql.Date;
import java.util.Scanner;
import Entidades.Vendedor;

public class VendedorServicio {

    public Vendedor altaVendedor(){

        //Intanciar un objeto del tipo vendedor
        Vendedor v1 = new Vendedor();
        //Lleno los atributos
        Scanner leer = new Scanner(System.in);
        System.out.println(leer.next("Ingrese el nombre del vendedor"));
        v1.setNombre(leer.next());
        System.out.print("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia que comenzo a trabajar");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año en que comenzo a trabajar");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        return v1;
    }
    public void sueldoMensual(Vendedor v1){
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoBasico(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensial del vendrdor: " + v1.getNombre() + " es de $ " + v1.getSueldoMensual());
        
    }
    public void vacaciones(Vendedor v1){
        Date hoy = new Date();
        int antiguedad =  hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5){
            System.out.println("Le corresponden 14 dias de vacaciones");
        } else if (antiguedad < 10){
            System.out.println("Le corresponden 21 dias de vacaciones");
        }else if (antiguedad < 20){
            System.out.println("Le corresponden 28 de vacaciones");
        }else if (antiguedad > 20){
            System.out.println("Le corresponden 35 dias de vacaciones");
        }else{
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }

}
