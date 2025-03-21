import java.util.LinkedList;
import java.util.Queue;

public class SistemaTurnos<T> {
    private Queue<T> filaClientes = new LinkedList<>();

    public void agregarCliente(T cliente) {
        filaClientes.add(cliente);
        System.out.println("El cliente agregado es: " + cliente);
    }

    public void atenderCliente() {
        if (!filaClientes.isEmpty()) {
            System.out.println("Atentiendo a: " + filaClientes.poll());
        } else {
            System.out.println("No hay clientes en la cola.");
        }
    }

    public void mostrarFila() {
        if (filaClientes.isEmpty()) {
            System.out.println("No hay clientes en la cola.");
        } else {
            System.out.println("cola actual: " + filaClientes);
        }
    }
}
