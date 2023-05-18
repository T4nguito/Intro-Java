/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej2nespresso.servicios;

import guia8ej2nespresso.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author CDRCONS02
 */
public class CafeteraServicios {

    Cafetera a = new Cafetera();
    Scanner leer = new Scanner(System.in);

    public void llenarCafetera() {
        a.setCantidaActual(a.getCapacidadMaxima());
        System.out.println(a.getCantidaActual());
        System.out.println(a.getCapacidadMaxima());

    }

    public void servirTaza() {
        System.out.println(" Ingrese el tamaño de su taza ");
        double taza = leer.nextDouble();

        if (a.getCantidaActual() >= taza) {
            a.setCantidaActual(a.getCantidaActual() - taza);
            System.out.println(" Su taza esta llena ");
            System.out.println(a.getCapacidadMaxima());

        } else {
            System.out.println("Su taza se lleno con " + a.getCantidaActual());
            a.setCantidaActual(0);
            System.out.println(a.getCapacidadMaxima());
        }

    }

    public void vaciarCafetera() {
        a.setCantidaActual(0);
    }

    public void agregarCafe() {
        System.out.println(" Ingrese la cantidad a recargar ");
        int recarga = leer.nextInt();

        if (a.getCantidaActual() + recarga > a.getCapacidadMaxima()) {
            System.out.println("el excedente de recarga es " + (a.getCantidaActual() + recarga - a.getCapacidadMaxima()));
            a.setCantidaActual(a.getCapacidadMaxima());
            System.out.println(" La cafetera quedo completa ");
        } else {
            a.setCantidaActual(a.getCantidaActual() + recarga);
            System.out.println("la carga de la cafetera quedo en " + a.getCantidaActual());
        }

    }

    public void iniciarCafetera() {
        System.out.println(" Ingrese la capacidad maxima de la cafetera ");
        double capmax = leer.nextDouble();
        a.setCapacidadMaxima(capmax);
        System.out.println(" Ingrese la capacidad actual de la cafetera ");
        double capactual = leer.nextDouble();
        a.setCantidaActual(capactual);
    }

}
