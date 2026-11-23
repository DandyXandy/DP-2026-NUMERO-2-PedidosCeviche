package modelo;

import patrones.composite.ItemMenu;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<ItemMenu> items = new ArrayList<>();

    public void agregar(ItemMenu item) { items.add(item); }

    public double total() {
        return 0;
    }
}
