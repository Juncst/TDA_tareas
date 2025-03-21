import java.util.Scanner;

public class MenuTurnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaTurnos<String> sistema = new SistemaTurnos<>(); 

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Mostrar Fila");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    sistema.agregarCliente(nombre);
                    break;
                case 2:
                    sistema.atenderCliente();
                    break;
                case 3:
                    sistema.mostrarFila();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
