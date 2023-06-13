package servicios;
import entidades.Cadena;
import java.util.Scanner;
/**
 */
public class servicioCadena {
    Scanner leer = new Scanner(System.in);
    
    public void mostrarVocales(Cadena c1){
     
        String frase1 = c1.getFrase().toLowerCase();
        int vocales = 0;

        for (int i = 0; i < frase1.length(); i++) {
            char caracter = frase1.charAt(i);

            if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')) {
                vocales++;
            }
        }
        System.out.println("La frase '" + frase1 + "' tiene " + vocales + " vocales.");

    }   
    
    public void invertirFrase(Cadena c1){

String frase1 = c1.getFrase();

        System.out.print("La frase invertida es: ");

        for (int i = (frase1.length() - 1); i >= 0; i--) {

            System.out.print(frase1.charAt(i));

        }
        System.out.println("");

    }

   public void vecesRepetido(Cadena c1) {

     String frase= c1.getFrase();
      System.out.println("ingrese la vocal a evaluar:");
     char respuesta =leer.next().charAt(0);
       int cont=0;
       for (int i=0; i< frase.length(); i++){
       
       if (frase.charAt(i)==respuesta){
       cont++;
       }
       }
       if (cont ==0){
           System.out.println("no se encontro la letra");
           
       }else{
           System.out.println("la letra se encontro "+cont+" veces");
       }
   }

   public void compararLongitud(Cadena c1){
     String frase = c1.getFrase();
    
       System.out.println("ingrese frase a comparar");
      String frase1=leer.next();
      if (frase.length()== frase1.length()){
       System.out.println("las frases tienen el mismo longitud");
   }else{
            System.out.println("las frases no tienen la misma longitud");
}
   }   
   
   public void unirFrases(Cadena c1){
      String frase = c1.getFrase();
       System.out.println("ingrese una frase a concatenar");
       String frase1= leer.next();
       System.out.println("la frase final es: "+frase.concat(frase1));
   }
   public void reemplazar(Cadena c1){
    String letra;
    String frase= c1.getFrase();
    System.out.println ("ingrese una caracter a reemplazar por la  letra a");
    letra =leer.next();
    frase = frase.replace("a",letra);
       System.out.println("la frase final es: "+frase); 
    
   }
   
   public void contiene(Cadena c1){
       
   String frase=c1.getFrase();
     boolean contiene = false;
       System.out.println("ingrese una letra");
       String letra=leer.next();
       for (int i = 0; i < frase.length(); i++) {
           if (frase.substring(i,i+1).equalsIgnoreCase(letra)){
               contiene=true;
           }
       }
       if(contiene){
           System.out.println("la frase contiene la letra");
       }else{
           System.out.println("la frase no contiene la letra");
       }  
     }
} 
       
  

  
