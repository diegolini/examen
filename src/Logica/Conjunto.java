package Logica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Parte 1.
//dados dos conjuntos, muestre el resultado de las operaciones unión, intersección, diferencia, producto cruz y
//conjunto potencia entre los conjuntos.
public class Conjunto {

    public static <T> Set<T> union(Set<T> conjuntoA, Set<T> conjuntoB) {
        Set<T> unionSet = new HashSet<>(conjuntoA);
        unionSet.addAll(conjuntoB);
        return unionSet;
    }

    public static <T> Set<T> interseccion(Set<T> conjuntoA, Set<T> conjuntoB) {
        Set<T> interseccion = new HashSet<>(conjuntoA); // Copia conjuntoA
        interseccion.retainAll(conjuntoB); //Mantiene los elementos que tenga el conjuntoB
        return interseccion;
    }

    public static <T> Set<T> diferencia(Set<T> conjuntoA, Set<T> conjuntoB) {
        Set<T> diferencia = new HashSet<>(conjuntoA); // Copia conjuntoA
        diferencia.removeAll(conjuntoB); //Elimina los elementos que tenga conjuntoB
        return diferencia;
    }

    public static <T> Set<T> productoCruz(Set<T> conjuntoA, Set<T> conjuntoB) {
        Set<T> productoCruz = new HashSet<>();
        for (T elementoA : conjuntoA) {
            for (T elementoB : conjuntoB) {
                productoCruz.add((T) ("(" + elementoA + ", " + elementoB + ")"));
            }
        }
        return productoCruz;
    }

    public static <T> Set<Set<T>> conjuntoPotencia(Set<T> conjuntoOriginal) {
        Set<Set<T>> conjuntoPotencia = new HashSet<Set<T>>();

        //P({}) = {{}}
        if (conjuntoOriginal.isEmpty()) {
            conjuntoPotencia.add(new HashSet<T>());
            return conjuntoPotencia;
        }

        // Convertir a lista para acceder por índice
        List<T> list = new ArrayList<T>(conjuntoOriginal);

        // Dividir el problema:
        T primerElemento = list.get(0);
        Set<T> resto = new HashSet<T>(list.subList(1, list.size()));

        // Llamada Recursiva para obtener P(resto)
        for (Set<T> set : conjuntoPotencia(resto)) {
            // 1. Añadir el subconjunto sin el primero
            conjuntoPotencia.add(set);

            // 2. Añadir el subconjunto con el primero
            Set<T> newSet = new HashSet<T>();
            newSet.add(primerElemento);
            newSet.addAll(set);
            conjuntoPotencia.add(newSet);
        }
        return conjuntoPotencia;
    }

}
