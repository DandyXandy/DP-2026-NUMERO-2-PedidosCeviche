package patrones.composite;

/**
 * PATRÓN COMPOSITE - rol: COMPONENT.
 * Contrato común para platos sueltos (hojas) y combos (compuestos).
 * El cliente trata a ambos de la misma forma.
 */
public interface ItemMenu {
    String getNombre();
    double getPrecio();
    void mostrar(String sangria);
}
