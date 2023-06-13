package Servicios;
 /*       Crear clase CafeteraServicio en
                el paquete Servicios con los siguiente:
                a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
                capacidad máxima.
                b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
                método recibe el tamaño de la taza y simula la acción de servir la
                taza con la capacidad indicada. Si la cantidad actual de café “no
                alcanza” para llenar la taza, se sirve lo que quede. El método le
                informará al usuario si se llenó o no la taza, y de no haberse llenado
                en cuanto quedó la taza.
                c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
                d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
                el método lo recibe y se añade a la cafetera la cantidad de café
                indicada.*/


import Entidades.Cafetera;

import java.util.Scanner;


public class CafeteraServicio {
 Scanner leer = new Scanner(System.in);
 Cafetera a = new Cafetera();

 public void llenarCafetera() {
  a.setCantidaActual(a.getCapacidadMaxima());
  System.out.println(a.getCantidaActual());
  System.out.println(a.getCapacidadMaxima());

 }

 public void servirTaza() {
  System.out.println(" Ingrese el tamaño de su taza ");
  int taza = leer.nextInt();

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
  int capmax = leer.nextInt();
  a.setCapacidadMaxima(capmax);
  System.out.println(" Ingrese la capacidad actual de la cafetera ");
  int capactual = leer.nextInt();
  a.setCantidaActual(capactual);
 }

}
