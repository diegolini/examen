package examen;
    // 1. Obtener la entrada del usuario
    String textoAlfabeto = alfabeto.getText();
    String cadenaAChecar = lenguaje.getText();

    // 2. Crear el conjunto del alfabeto
    Set<Character> alfabetoSet = Checador.crearAlfabeto(textoAlfabeto);

    // 3. Realizar la verificación
    boolean pertenece = Checador.perteneceAlfabeto(cadenaAChecar, alfabetoSet);

    // 4. Formatear el resultado (CORRECCIÓN CLAVE)
    String mensaje = "Alfabeto (Σ) creado: " + alfabetoSet.toString() + "\n";
    mensaje += "Cadena a checar: \"" + cadenaAChecar + "\"\n";
    
    if (pertenece) {
        mensaje += "Resultado: PERTENECE al alfabeto (Σ*) ✅";
    } else {
        mensaje += "Resultado: NO PERTENECE al alfabeto (Σ*) ❌";
    }
    
    // 5. Mostrar el resultado formateado
    resultadoArea.setText(mensaje);