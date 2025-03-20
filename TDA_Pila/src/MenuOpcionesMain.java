package TDA_Pila.src;
import java.util.Scanner;

public class MenuOpcionesMain {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Pila<String> texto = new Pila<>();

        while (true){
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Ingresar texto");
            System.out.println("2. DESHACER");
            System.out.println("3. REHACER");
            System.out.println("4. MOSTRAR");
            System.out.println("5. SALIR");
            System.out.print("Seleccione una opción: ");
            
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el texto: ");
                    String textoIngresado = scanner.nextLine();
                    texto.apilar(textoIngresado);
                    break;
                case "2":
                    texto.deshacer();
                    break;
                case "3":
                    texto.rehacer();
                    break;
                case "4":
                    texto.mostrar();
                    break;
                case "5":
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

    }    
}
