
package copiadeficheros;

import java.io.File;
import java.io.IOException;
public class CopiaDeFicheros {

    
    public static void main(String[] args) throws IOException {

        File rutanb = new File("");
        System.out.println("Los archivos a los que desee realizar una copia de seguridad deben estar situados en" + rutanb.getAbsolutePath()+ File.separator);
        String r = Utilidades.PedirDirección("Introduzca la direccion de el archivo que quiera copiar: ");

        File ruta = new File(rutanb.getAbsolutePath()+ File.separator + r );

        System.out.println(ruta.getAbsolutePath());

        String[] lista_archivos = ruta.list();
        
        
        File MiDircopia = new File(rutanb.getAbsolutePath()+ File.separator + r + "copia");
        
        MiDircopia.mkdir();

        for (int i = 0; i < lista_archivos.length; i++) {



            File f = new File(ruta.getAbsolutePath(), lista_archivos[i]);

            if (f.isDirectory() == true) {
        
                File copia = new File(rutanb.getAbsolutePath()+ File.separator + "MiDirCopia" + File.separator + lista_archivos[i] );
                copia.mkdir();
                String[] dentro = f.list();
                for (int j = 0; j < dentro.length; j++) {
                    Utilidades.write(copia.getAbsolutePath()+ File.separator + dentro[i] ,Utilidades.GuardarEnArray(rutanb.getAbsolutePath()+ File.separator + r + File.separator + lista_archivos[i] + File.separator + dentro[i]));
               
                }

            } else {
                
                Utilidades.write(rutanb.getAbsolutePath()+ File.separator + "MiDirCopia" + File.separator + lista_archivos[i] ,Utilidades.GuardarEnArray(rutanb.getAbsolutePath()+ File.separator + r + File.separator + lista_archivos[i]));
               

                

            }

        }
    }
    
}
