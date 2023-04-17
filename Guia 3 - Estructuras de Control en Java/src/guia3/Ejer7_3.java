package guia3;

public class Ejer7_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int conCorrectos = 0;
        int conIncorrectos = 0;
        String variableCad;
        do {
            System.out.println("Ingresa una Cadena de 5 caracteres con formato (X###O).");
            variableCad = leer.next();
            if (variableCad.equals("&&&&&")) {
                break;
            }
            if ((variableCad.substring(0, 1).equals("X")) && (variableCad.substring(4, 5).equals("O"))
                    && (variableCad.length() == 5)) {
                conCorrectos++;
            } else {
                conIncorrectos++;
            }
        } while (!variableCad.equals("&&&&&"));
        System.out.println("La Cantidad de Cadenas Ingresadas Correctamente es: " + conCorrectos);
        System.out.println("La Cantidad de Cadenas Ingresadas Incorrectamente es: " + conIncorrectos);
    }
}
