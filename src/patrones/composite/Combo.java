package patrones.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * PATRÓN COMPOSITE - rol: COMPOSITE (compuesto).
 * Contiene ItemMenu (platos u otros combos) y delega en ellos.
 */
public class Combo implements ItemMenu {
    private final String nombre;
    private final List<ItemMenu> hijos = new ArrayList<>();

    public Combo(String nombre) { this.nombre = nombre; }

    public void agregar(ItemMenu item) { hijos.add(item); }
    public void quitar(ItemMenu item) { hijos.remove(item); }

    @Override public String getNombre() { return nombre; }

    @Override
    public double getPrecio() {
        // TODO (integrante 2): sumar el precio de TODOS los hijos (recursión)
        return 0;
    }

    @Override
    public void mostrar(String sangria) {
        // TODO (integrante 3): imprimir el combo y luego cada hijo con más sangría
    }
}
