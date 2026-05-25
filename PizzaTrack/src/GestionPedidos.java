public class GestionPedidos {

    private Pila pilaUndo;
    private Pila pilaRedo;

    public GestionPedidos() {

        pilaUndo = new Pila();
        pilaRedo = new Pila();
    }

    // Registrar pizza
    public void registrarPizza(Pizza pizza) {

        pilaUndo.push(pizza);

        pilaRedo = new Pila();

        System.out.println("Pizza registrada correctamente.");
    }

    // Deshacer
    public void undo() {

        if (pilaUndo.isEmpty()) {

            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza pizza = pilaUndo.pop();

        pilaRedo.push(pizza);

        System.out.println("Pedido deshecho.");
    }

    // Rehacer
    public void redo() {

        if (pilaRedo.isEmpty()) {

            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza pizza = pilaRedo.pop();

        pilaUndo.push(pizza);

        System.out.println("Pedido restaurado.");
    }

    // Mostrar pedido actual
    public void mostrarPedidoActual() {

        if (pilaUndo.isEmpty()) {

            System.out.println("No hay pedidos.");
            return;
        }

        System.out.println("\nPedido actual:");
        System.out.println(pilaUndo.peek());
    }
}