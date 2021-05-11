/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import guisistema.Menu;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Main {
    
    public static void main(String[] args) {
        crearDocumentos();
        Menu mp = new Menu();
        mp.setVisible(true);
    }
    
    private static void crearDocumentos() {
        String documentos = System.getenv("USERPROFILE");
        
        File carpeta = new File(documentos + "\\Documents\\DataBase");

        if (carpeta.mkdir()) {
            ArrayList<String> horario = new ArrayList();

            for (int i = 0; i < 24; i++) {
                String hora = i + "~false~false~false~false~false~false~false";
                horario.add(hora);
            }
            DB baseDato = new DB();
            baseDato.guardarTxt(horario, baseDato.HORARIO);
        }
    }
}
