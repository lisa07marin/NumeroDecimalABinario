package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumBinarioTest {

    @Test
    public void numBinarioDe4() {
        NumBinario binario = new NumBinario();
        String resultado = binario.numBinarioDe(4);
        String esperado="100";
        assertEquals(esperado, resultado);
    }
}