
package guia12_ejercicioextra.pkg2.entidad;

/**
 *
 * @author Rocha Paula
 */
public class Polideportivo extends Edificio{

    private String nombre, tipoInstalacion;

    public Polideportivo(String nombre, String tipoInstalacion, Double ancho, Double largo, Double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }
    
            
    @Override
    public double calcularSuperficie() {
        return 2*(ancho*largo+ancho*alto+largo*alto);
    }

    @Override
    public double calcularVolumen() {
       return ancho*alto*largo;
    }
    
}
