public class Pila {

    private Nodo tope;

    //Constructor
    public Pila() {
        tope = null;
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return tope == null;
    }

    // Insertar pizza
    public void push(Pizza pizza) {

        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo 
        nuevo.siguiente = tope;

        tope = nuevo;
    }

    // Eliminar pizza del tope
    public Pizza pop() {

        if (isEmpty()) {
            return null;
        }

        // Guardamos la pizza del tope
        Pizza pizza = tope.pizza;

        // El tope avanza al siguiente nodo
        tope = tope.siguiente;

        return pizza;
    }

    // Ver pizza actual sin eliminar
    public Pizza peek() {

        if (isEmpty()) {
            return null;
        }

        return tope.pizza;
    }
}