package Ejercicios;

/**
 *
 * @author CH4RL13
 */
import java.io.*;

public class Reto515 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int entrada = 0;

            while (true) {
                entrada = Integer.parseInt(br.readLine());
                if (entrada == 0) {
                    break;
                }
                if (entrada == 1) {
                    System.out.println(entrada);
                } else if (entrada % 2 != 0) {
                    int result = entrada - 1;
                    System.out.println(result);
                } else {
                    System.out.println(entrada);

                }

            }
        } catch (Exception ex) {
            System.err.println("ERROR");
        }
    }
}
