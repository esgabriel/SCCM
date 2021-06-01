
package clases;

import guisistema.Menu;
import java.io.File;

public class Main {
    
    public static void main(String[] args) {
        crearDocumentos();
        Menu mp = new Menu();
        mp.setVisible(true);
    }
    
    private static void crearDocumentos() {
        DB db = new DB();
        File carpeta1 = new File(db.DIRECCION);
        File carpeta2 = new File(db.DIRECCION+db.CITA_MEDICA);
        
        carpeta1.mkdir();
        carpeta2.mkdir();
    }
}
