package Logica;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

//Parte 3.
//dado un lenguaje (conjunto de cadenas) muestre el alfabeto al que pertenecen las cadenas.
public class determinarAlfabeto {

    public static Set<Character> obtenerAlfabeto(List<String> lenguaje) {
        Set<Character> alfabeto = new HashSet<>();

        // 1. Iterar sobre cada cadena (palabra) del lenguaje
        for (String cadena : lenguaje) {
            // 2. Iterar sobre cada símbolo (carácter) dentro de la cadena
            for (char simbolo : cadena.toCharArray()) {
                // 3. Añadir el símbolo al Set. El Set ignora los duplicados.
                alfabeto.add(simbolo);
            }
        }
        
        return alfabeto;
    }
    
}