package loteria;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Comparacion {

    public void comparar() {

        Random ra = new Random();
        int ram = ra.nextInt(10) + 1;
        int[] lim;
        int aux = 0;
        lim = new int[5];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros");
        for (int i = 0; i < lim.length; i++) {
            lim[i] = entrada.nextInt();
        }
        System.out.println(Arrays.toString(lim));
        for (int i = 0; i < lim.length - 1; i++) {
            for (int j = i + 1; j < lim.length; j++) {
                if (lim[i] == lim[j]) {
                    System.out.println("valores repetidos");
                    Comparacion obj = new Comparacion();
                    obj.comparar();
                    break;
                } else {
                    for (int p = 0; p < lim.length; i++) {
                        if (lim[i] == ram) {
                            System.out.println("Felicidades has ganado");
                        }

                    }

                }
            }
        }
    }

}
