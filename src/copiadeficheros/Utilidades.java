
package copiadeficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Utilidades {
    
        public static String[] GuardarEnArray(String a) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(a));

        String thisLine = null;

        int c = 0;

        while ((thisLine = br.readLine()) != null) {
            c++;
        }
        String arr[] = new String[c];
        int i = 0;
        thisLine = null;
        BufferedReader nr = new BufferedReader(new FileReader(a));
        while ((thisLine = nr.readLine()) != null) {
            arr[i] = thisLine;
            i++;
        }
        
        return arr;

    }
    public static void write(String ruta, String[] a) throws IOException {
        File archivo = new File(ruta);
  
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < a.length; i++) {

                bw.write(a[i] + "\n");

            }
            bw.close();
      
        
    }
    public static String PedirDirección(String a) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(a);
        String x = teclado.nextLine();
        return x;
    }
    }
