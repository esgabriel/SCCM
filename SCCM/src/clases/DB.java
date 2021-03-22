/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class DB {

    private final String direccion = System.getenv("USERPROFILE")+"\\Documents\\DB\\";
    
    public ArrayList leerTxt(String file) {
        ArrayList cadena = new ArrayList();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File(direccion + file);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            if (file.equalsIgnoreCase("MedicoDB.txt")) {
                while ((linea = br.readLine()) != null) {
                    String medicox[] = linea.split(",");
                    Medico medico = new Medico(medicox[4], medicox[0], medicox[1], medicox[2], medicox[3]);
                    cadena.add(medico);
                }
            }
            if (file.equalsIgnoreCase("HorarioDB.txt")) {
                while ((linea = br.readLine()) != null) {
                    cadena.add(linea);
                }
            }
            if (file.equalsIgnoreCase("PacienteDB.txt")) {
                //En construccion  -  Luis Roma,Mendez,Perez,1-1-1990,12345678901
                while ((linea = br.readLine()) != null) {
                    String pacientex[] = linea.split(",");
                    Paciente paciente = new Paciente(pacientex[4],pacientex[0],pacientex[1],pacientex[2],pacientex[3]);
                    cadena.add(paciente);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.toString());
            }
        }

        return cadena;
    }

    public void guardarTxt(ArrayList cadena, String file) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(direccion + file);
            pw = new PrintWriter(fichero);
            if (file.equalsIgnoreCase("PacienteDB.txt")) {
                ArrayList<Paciente> nuevo = cadena;
                for (Paciente paciente : nuevo) {
                    pw.println(paciente.toString());
                }
            }
            if (file.equalsIgnoreCase("MedicoDB.txt")) {
                ArrayList<Medico> nueva = cadena;
                for (Medico medico : nueva) {
                    pw.println(medico.toString());
                }
            }
            if (file.equalsIgnoreCase("HorarioDB.txt")) {
                ArrayList<String> nueva = cadena;
                for (String horario : nueva) {
                    pw.println(horario);
                }
            }
        } catch (Exception ex) {

        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception ex) {

            }
        }
    }
}
