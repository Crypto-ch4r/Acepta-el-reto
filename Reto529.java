package ejercicios;

/**
 *
 * @author CH4R13
 */
import java.io.*;

public class Reto529 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int nCasos = Integer.parseInt(br.readLine());
            String linea;
            char[] ch;
            int in, times;
            for (int i = 0; i < nCasos; i++) {

                linea = br.readLine();
                ch = linea.toCharArray();

                in = times = 0;
                for (int j = 0; j < ch.length; j++) {
                    if (ch[j] == 'O') {
                        if (in > 0) {
                            in -= 1;
                        } else {
                            times += 1;
                        }
                    }
                    if (ch[j] == 'I') {
                        in += 1;
                    }
                    if (in > times) {
                        times = in;
                    }
                }
                System.out.println(times);
            }
        } catch (Exception ex) {

        }
    }
}
