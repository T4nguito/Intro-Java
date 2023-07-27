/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author JAVIER
 */
public class Armadura {
    
 private String colorPrimario;
    private String colorSecundario;
    private int resistencia;
    private int salud;
    private Generador generador;
    private Bota botaIzquierda;
    private Bota botaDerecha;
    private Guante guanteIzquierdo;
    private Guante guanteDerecho;
    private Consola consola;
    private Sintetizador sintetizador;
    private Dispositivo[] dispositivos;
    private ObjetoRadar[] radar;

    public Armadura(String colorPrimario, String colorSecundario, int resistencia, int salud) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = resistencia;
        this.salud = salud;
        this.generador = new Generador();
        this.botaIzquierda = new Bota();
        this.botaDerecha = new Bota();
        this.guanteIzquierdo = new Guante();
        this.guanteDerecho = new Guante();
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
        this.dispositivos = new Dispositivo[]{botaIzquierda, botaDerecha, guanteIzquierdo, guanteDerecho, consola, sintetizador};
        this.radar = new ObjetoRadar[10];
    }

    public void caminar(int tiempo) {
        int energiaConsumida = botaIzquierda.usar(tiempo);
        consumirEnergia(energiaConsumida);
    }

    public void correr(int tiempo) {
        int energiaConsumida = botaIzquierda.usar(tiempo * 2);
        consumirEnergia(energiaConsumida);
    }

    public void propulsar(int tiempo) {
        int energiaConsumida = botaIzquierda.usar(tiempo * 3);
        consumirEnergia(energiaConsumida);
    }

    public void volar(int tiempo) {
        int energiaConsumida = botaIzquierda.usar(tiempo * 3) + guanteIzquierdo.usar(tiempo * 2);
        consumirEnergia(energiaConsumida);
    }

    public void usarGuanteIzquierdo(int tiempo) {
        int energiaConsumida = guanteIzquierdo.usar(tiempo * 3);
        consumirEnergia(energiaConsumida);
    }

    public void usarGuanteDerecho(int tiempo) {
        int energiaConsumida = guanteDerecho.usar(tiempo * 3);
        consumirEnergia(energiaConsumida);
    }

    public void escribir(String mensaje) {
        int energiaConsumida = consola.usar(mensaje.length());
        consumirEnergia(energiaConsumida);
    }

    public void leer() {
        int energiaConsumida = consola.usar(1);
        consumirEnergia(energiaConsumida);
    }

    private void consumirEnergia(int energia) {
        generador.consumirEnergia(energia);
    }

    public void mostrarEstado() {
        System.out.println("Estado de la Armadura de Iron Man:");
        System.out.println("Color Primario: " + colorPrimario);
        System.out.println("Color Secundario: " + colorSecundario);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Salud: " + salud);
        System.out.println("Estado de la Batería: " + generador.getPorcentajeBateria() + "%");

        System.out.println("\nEstado de los Dispositivos:");
        for (Dispositivo dispositivo : dispositivos) {
            String estado = dispositivo.estaDanado() ? "Dañado" : "Funcionando";
            System.out.println(dispositivo.getClass().getSimpleName() + ": " + estado);
        }
    }

    public void informarEstadoBateria() {
        float porcentajeBateria = generador.getPorcentajeBateria();
        System.out.println("Estado de la Batería: " + porcentajeBateria + "%");
    }

    public void informarEstadoReactor() {
        float porcentajeBateria = generador.getPorcentajeBateria();
        float conversion1 = porcentajeBateria * 0.5f;
        float conversion2 = porcentajeBateria * 0.25f;

        System.out.println("Estado del Reactor:");
        System.out.println("En Watts: " + conversion1);
        System.out.println("En Voltios: " + conversion2);
    }

    public void revisarDispositivos() {
        Random random = new Random();

        for (Dispositivo dispositivo : dispositivos) {
            if (random.nextDouble() <= 0.3) {
                dispositivo.revisar();
                if (dispositivo.estaDanado()) {
                    repararDispositivo(dispositivo);
                }
            }
        }
    }

    private void repararDispositivo(Dispositivo dispositivo) {
        Random random = new Random();
        if (random.nextDouble() <= 0.4) {
            dispositivo.reparar();
        }
    }

    public void detectarObjetosRadar() {
        Random random = new Random();
        for (int i = 0; i < radar.length; i++) {
            float resistencia = random.nextInt(100) + 1;
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            int z = random.nextInt(100);
            boolean hostil = random.nextBoolean();
            radar[i] = new ObjetoRadar(resistencia, x, y, z, hostil);
        }
    }

    public void atacarEnemigos() {
        for (ObjetoRadar objeto : radar) {
            if (objeto != null && objeto.isHostil()) {
                double distancia = Math.sqrt(objeto.getX() * objeto.getX() + objeto.getY() * objeto.getY() + objeto.getZ() * objeto.getZ());
                if (distancia <= 5000) {
                    int potencia = (int) (100 / distancia);
                    objeto.recibirDanio(potencia);
                    if (objeto.getResistencia() <= 0) {
                        objeto.destruir();
                    }
                }
            }
        }
    }
}

