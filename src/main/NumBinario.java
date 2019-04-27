package main;

import java.util.ArrayList;

public class NumBinario {

    public static String numBinarioDe(int numeroIngresado) {
        ArrayList<String> numBinario = new ArrayList<>();
        do {
            numBinario.add(0, Integer.toString(numeroIngresado % 2));
            numeroIngresado = numeroIngresado / 2;
        } while (numeroIngresado > 0);
        String x = "";
        for (int i = 0; i < numBinario.size(); i++) {
            x += numBinario.get(i);
        }
        return x;
    }
}
