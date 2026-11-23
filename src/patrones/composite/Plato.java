package patrones.composite;

/**
 * PATRÓN COMPOSITE - rol: LEAF (hoja).
 * Elemento simple: no tiene hijos.
 */
public class Plato implements ItemMenu {
    private final String nombre;
    private final double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override public String getNombre() { return nombre; }
    @Override public double getPrecio() { return precio; }

    @Override
    public void mostrar(String sangria) {
        // TODO (integrante 1): imprimir "sangria + nombre + precio"
    }
}
