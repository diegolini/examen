package Logica;

import java.util.HashSet;
import java.util.Set;

//Parte 2.
//dado un alfabeto y un lenguaje (conjunto de cadenas), indique cuales de esas cadenas pertenecen al alfabeto y cuáles no.
public class Checador {

    private static Set<Character> crearAlfabeto(String textoAlfabeto) {
        Set<Character> alfabeto = new HashSet<>();

        if (textoAlfabeto == null || textoAlfabeto.isEmpty()) {
            return alfabeto; // Retorna un conjunto vacío si no hay entrada.
        }

        // Iterar sobre cada carácter de la cadena ingresada
        for (char simbolo : textoAlfabeto.toCharArray()) {
            //ignoramos delimitadores y espacios:
            if (simbolo != ' ' && simbolo != ',') {
                alfabeto.add(simbolo);
            }

        }

        return alfabeto;
    }

    private static boolean perteneceAlfabeto(String cadena, Set<Character> alfabeto) {
        // La cadena vacía siempre pertenece a cualquier alfabeto.
        if (cadena.isEmpty()) {
            return true;
        }

        // Iterar sobre cada símbolo (carácter) de la cadena
        for (char simbolo : cadena.toCharArray()) {
            // La clave: verificar pertenencia al conjunto EXPLICITO
            if (!alfabeto.contains(simbolo)) {
                return false; // La cadena NO pertenece si encuentra un símbolo no definido
            }
        }
        return true; // Todos los símbolos son válidos
    }

}
