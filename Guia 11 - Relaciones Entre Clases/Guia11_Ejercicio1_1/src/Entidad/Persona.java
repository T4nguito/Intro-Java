
package Entidad;


public class Persona {
    private String nombre;
    private String apellido;
    private int edadPersona;
    private int dni;
    private Perro perro;

    public Persona() {
        this.perro=new Perro();
    }

    public Persona(String nombre, String apellido, int edadPersona, int dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edadPersona = edadPersona;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edadPersona=" + edadPersona + ", dni=" + dni + ", perro=" + perro + '}';
    }
    
    
}
