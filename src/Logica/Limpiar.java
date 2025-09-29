package Logica;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JTextPane;

public class Limpiar {

    public Set<String> limpiar(String texto) {
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

}
