package Logica;

import java.util.ArrayList;
import java.util.List;

//Parte 4.
//Que, dada una cadena, indique la longitud de cadena, los prefijos y sufijos.
public class Cadena {

    public static String analizarCadena(String cadena) {
        cadena = cadena.replace("{", "").replace("}", "").trim();

        // 1. Longitud de la Cadena
        int longitud = cadena.length();

        // 2. Prefijos (P)
        // Los prefijos son subcadenas que empiezan en la primera posición.
        List<String> prefijos = new ArrayList<>();
        // Incluir la cadena vacía
        prefijos.add("ε (cadena vacía)");

        // Generar prefijos desde longitud 1 hasta la longitud total
        for (int i = 1; i <= longitud; i++) {
            // substring(0, i) obtiene la subcadena desde el índice 0 hasta i (exclusivo)
            prefijos.add(cadena.substring(0, i));
        }

        // 3. Sufijos (S)
        // Los sufijos son subcadenas que terminan en la última posición.
        List<String> sufijos = new ArrayList<>();
        // Incluir la cadena vacía (ε)
        sufijos.add("ε (cadena vacía)");

        // Generar sufijos desde la longitud total - 1 hasta 0
        for (int i = 1; i <= longitud; i++) {
            // substring(longitud - i) obtiene la subcadena que comienza en (longitud - i)
            sufijos.add(cadena.substring(longitud - i));
        }

        // Invertimos la lista para mostrar los sufijos de menor a mayor longitud
        java.util.Collections.reverse(sufijos);

        // 4. Construcción del resultado (String)
        StringBuilder resultado = new StringBuilder();
        resultado.append("Cadena (w): \"").append(cadena).append("\"\n");
        resultado.append("-------------------------------------------\n");
        resultado.append("1. Longitud (|w|): ").append(longitud).append("\n");
        resultado.append("2. Prefijos: ").append(prefijos.toString()).append("\n");
        resultado.append("3. Sufijos: ").append(sufijos.toString()).append("\n");

        return resultado.toString();
    }
}
