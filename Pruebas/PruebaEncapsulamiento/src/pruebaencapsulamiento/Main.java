package pruebaencapsulamiento;


public class Main {
    public static void main(String[] args) {
        AutoMovil obj = new AutoMovil ("BMW", "2010");
        
        System.out.println(obj);
        
        obj.setModelo("2017");        
        System.out.println("Se ha modificado el modelo a: "+obj.getModelo());
        
    }
}
