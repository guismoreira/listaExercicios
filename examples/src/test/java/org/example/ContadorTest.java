package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ContadorTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void deveContar6Palavras()
    {
        String frase = "Olá, bom dia meu querido amigo";
        Contador contador = new Contador();
        int quantidadePalavra = contador.contaPalavra(frase);
        assertEquals( 6, quantidadePalavra );
    }

    @Test
    public void deveContar0PalavrasComFraseVazia()
    {
        String frase = "";
        Contador contador = new Contador();
        int quantidadePalavra = contador.contaPalavra(frase);
        assertEquals( 0, quantidadePalavra );
    }

    @Test
    public void deveContar0PalavrasComFraseComEspacoEmBranco()
    {
        String frase = " ";
        Contador contador = new Contador();
        int quantidadePalavra = contador.contaPalavra(frase);
        assertEquals( 0, quantidadePalavra );
    }
}
