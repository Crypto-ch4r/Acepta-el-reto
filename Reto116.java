package Diciembre;

import java.io.*;

public class Reto116 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n;
            n=Integer.parseInt(br.readLine());
                while(n>0 && n<=5 ){
                System.out.println("Hola mundo.");
                n = n-1;
                }
            
        }catch(Exception ex){
            System.err.println("E R R O R.");
        }
    }
}
