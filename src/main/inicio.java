package main;

import java.util.ArrayList;
import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INGRESE UN NUMERO: ");
        int numeroIngresado = scanner.nextInt();
        NumBinario binario = new NumBinario();
        String numBinario = binario.numBinarioDe(numeroIngresado);

        System.out.print("EL NUMERO EN BINARIO ES: " + numBinario);


    }


}
