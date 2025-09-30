package Logica;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JTextPane;

public class Limpiar {

    public static Set<String> limpiar(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return new HashSet<>();
        }

        // 1. Divide la cadena usando la expresión regular "\s*,\s*" (coma con espacios) 
        //    o por uno o más espacios (\s+), si no hay comas.
        String[] elementos;
        if (texto.contains(",")) {
            elementos = texto.split("\\s*,\\s*");
        } else {
            elementos = texto.split("\\s+");
        }

        // 2. Procesa: Limpia espacios residuales, filtra vacíos y recolecta en un Set.
        return Arrays.stream(elementos)
                .map(String::trim)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toSet());
    }
    
        // Cambiado de Set<String> a List<String>
    public static List<String> limpiarLista(String texto) { 
        if (texto == null || texto.trim().isEmpty()) {
            return List.of(); // Devuelve una List vacía
        }

        String[] elementos;
        if (texto.contains(",")) {
            elementos = texto.split("\\s*,\\s*");
        } else {
            elementos = texto.split("\\s+");
        }

        // 2. Procesa: Limpia y recolecta AHORA en una List.
        // Nota: Aunque es una List, la lógica de los conjuntos NO depende del orden, 
        // y para este caso práctico, List<String> es la estructura requerida.
        return Arrays.stream(elementos)
                .map(String::trim)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList()); // ¡Cambiado a toList()!
    }

}
