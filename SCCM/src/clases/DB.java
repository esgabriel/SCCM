
package clases;

import java.io.*;
import java.util.ArrayList;

public class DB {

    private final String direccion = System.getenv("USERPROFILE")+"\\Documents\\DataBase\\";
    
    public final String HORARIO = "HorarioDB.txt";
    public final String MEDICO = "MedicoDB.txt";
    public final String PACIENTE = "PacienteDB.txt";
    public final String HISTORIAL = "HistorialDB.txt";
    
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
            if (file.equalsIgnoreCase(MEDICO)) {
                while ((linea = br.readLine()) != null) {
                    String medicox[] = linea.split("~");
                    System.out.println(linea);
                    Medico medico = new Medico(medicox[4], medicox[0], medicox[1], medicox[2], medicox[3]);
                    cadena.add(medico);
                }
            }
            if (file.equalsIgnoreCase(HORARIO)) {
                while ((linea = br.readLine()) != null) {
                    cadena.add(linea);
                }
            }
            if (file.equalsIgnoreCase(HISTORIAL)) {
                while ((linea = br.readLine()) != null) {
                    String hist[] = linea.split("~");
                    Historial historial = new Historial(hist[0],hist[1],hist[2],hist[3]);
                    cadena.add(historial);
                }
            }
            if (file.equalsIgnoreCase(PACIENTE)) {
                while ((linea = br.readLine()) != null) {
                    String pacientex[] = linea.split("~");
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
            if (file.equalsIgnoreCase(PACIENTE)) {
                ArrayList<Paciente> nuevo = cadena;
                for (Paciente paciente : nuevo) {
                    pw.println(paciente.toString());
                }
            }
            if (file.equalsIgnoreCase(MEDICO)) {
                ArrayList<Medico> nueva = cadena;
                for (Medico medico : nueva) {
                    pw.println(medico.toString());
                }
            }
            if (file.equalsIgnoreCase(HORARIO)) {
                ArrayList<String> nueva = cadena;
                for (String horario : nueva) {
                    pw.println(horario);
                }
            }
            if (file.equalsIgnoreCase(HISTORIAL)) {
                ArrayList<Historial> nueva = cadena;
                for (Historial historial : nueva) {
                    pw.println(historial.toString());
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
