package org.example;

public class Contador {
    public Integer contaPalavra(String frase) {

        if(frase.isBlank())
            return 0;

        return frase.trim().split("\\s").length;
    }
}
