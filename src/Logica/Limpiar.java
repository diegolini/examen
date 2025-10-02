package Logica;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Limpiar {

    public static Set<String> limpiar(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return new HashSet<>();
        }

        // 🔹 Elimina llaves { y }
        texto = texto.replace("{", "").replace("}", "");

        // Divide la cadena
        String[] elementos;
        if (texto.contains(",")) {
            elementos = texto.split("\\s*,\\s*");
        } else {
            elementos = texto.split("\\s+");
        }

        // Procesa
        return Arrays.stream(elementos)
                .map(String::trim)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toSet());
    }
    
    // Versión que devuelve List<String>
    public static List<String> limpiarLista(String texto) { 
        if (texto == null || texto.trim().isEmpty()) {
            return List.of();
        }

        // 🔹 Elimina llaves { y }
        texto = texto.replace("{", "").replace("}", "");

        String[] elementos;
        if (texto.contains(",")) {
            elementos = texto.split("\\s*,\\s*");
        } else {
            elementos = texto.split("\\s+");
        }

        return Arrays.stream(elementos)
                .map(String::trim)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());
    }
}
