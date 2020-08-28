package loteria;

import java.util.Random;
import java.util.Scanner;

public class Comp {

    public void comparar() {

        Random ra = new Random();
        int ram = ra.nextInt(10) + 1;
        int[] lim;
        int aux = 0;
        lim = new int[5];
        Scanner entrada = new Scanner(System.in);
        lim[0] = entrada.nextInt();
        lim[1] = entrada.nextInt();
        lim[2] = entrada.nextInt();
        lim[3] = entrada.nextInt();
        lim[4] = entrada.nextInt();
    }
}
