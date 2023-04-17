package guia3;

public class Ejer7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctReadings = 0;
        int incorrectReadings = 0;
        
        while (true) {
            System.out.print("Ingrese una cadena (FDE para terminar): ");
            String input = scanner.nextLine();
            
            if (input.equals("&&&&&")) {
                break;
            } else if (input.length() != 5 || input.charAt(0) != 'X' || input.charAt(4) != 'O') {
                System.out.println("Cadena incorrecta.");
                incorrectReadings++;
            } else {
                System.out.println("Cadena correcta.");
                correctReadings++;
            }
        }
        
        System.out.println("Informe:");
        System.out.println("Cantidad de lecturas correctas: " + correctReadings);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrectReadings);
    }
}
}
