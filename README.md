# DP-2026-GrupoN-PedidosCeviche

## Integrantes
| Nombre | Código UTP | Usuario GitHub | Rol |
|Dandy Alexandre Abadie Atoche|U23217843|DandyXandy|(vamos definir)|
| Axel Samir Ojeda Paredes | U24252010 |            |(Vamos defirni)|
|Any Yanela Raymundo Ancajima| U24252130|           |(Vamos Definir)|
|Diego Armando Prieto Chavez| U24232045|            |(Vamos Definir)|
## Problema que resuelve
Una cevichería vende platos sueltos y combos. Los combos pueden contener platos
y también otros combos. Sin un diseño adecuado, calcular el total o mostrar el
pedido obliga a revisar el tipo de cada ítem (`instanceof`) y el código se rompe
cada vez que aparece un nuevo tipo de combo.

## Patrón aplicado
- **Nombre:** Composite
- **Tipo:** Estructural
- **Problema que resuelve:** tratar de forma uniforme objetos individuales y
  agrupaciones de objetos (estructura de árbol).
- **Clases que participan:**
  - `ItemMenu` — Component
  - `Plato` — Leaf
  - `Combo` — Composite
  - `Pedido` / `Main` — Client

## Diagrama de clases
![Diagrama de clases](docs/diagrama-clases.png)

## Cómo compilar y ejecutar
```
javac -d bin src/Main.java src/modelo/*.java src/patrones/composite/*.java
java -cp bin Main
```

## Capturas de pantalla
(pendiente)

## Estado (avance 50 %)
- [x] Repositorio y estructura inicial
- [x] Diagrama de clases preliminar
- [ ] Implementación del patrón (en curso)
