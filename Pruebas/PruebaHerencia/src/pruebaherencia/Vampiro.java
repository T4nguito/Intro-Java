
package pruebaherencia;

public class Vampiro {
    private String nombre;
    private int edad;

    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void morder(){
        System.out.println("metodo morder");
    }
    public void chupaSangre(){
        System.out.println("metodo chumar sangre");
    }
}
