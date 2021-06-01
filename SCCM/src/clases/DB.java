
package clases;

import java.io.*;
import java.util.ArrayList;

public class DB {

    public final String DIRECCION = System.getenv("USERPROFILE")+"\\Documents\\DBF1\\";  //Direccion final

    public final String CITA_MEDICA = "CitasMedicas\\";
    public final String MEDICO = "MedicoDB.txt";
    public final String PACIENTE = "PacienteDB.txt";
    public final String HISTORIAL = "HistorialDB.txt";
    
    public ArrayList leerTxt(String file) {
        ArrayList cadena = new ArrayList();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File(DIRECCION + file);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            if (file.equalsIgnoreCase(MEDICO)) {
                while ((linea = br.readLine()) != null) {
                    String medicox[] = linea.split("~");
                    Medico medico = new Medico(medicox[4], medicox[0], medicox[1], medicox[2], medicox[3]);
                    cadena.add(medico);
                }
            }
            if(file.contains(CITA_MEDICA)){
                while ((linea = br.readLine()) != null) {
                    String citaX[] = linea.split("~");
                    int hora = Integer.parseInt(citaX[0]);
                    CitaMedica cita = new CitaMedica(hora,citaX[1],citaX[2],citaX[3],citaX[4]);
                    cadena.add(cita);
                }
            }
            if (file.equalsIgnoreCase(HISTORIAL)) {
                while ((linea = br.readLine()) != null) {
                    String hist[] = linea.split("~");
                    Historial historial = new Historial(hist[0],hist[1],hist[2],hist[3],hist[4]);
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
            //No se pudo acceder al archivo o no se encuentra creado
            System.out.println(ex.toString());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                //No se pudo cerrar el archivo con exito
                System.out.println(e2.toString());
            }
        }
        return cadena;
    }

    public void guardarTxt(ArrayList cadena, String file) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(DIRECCION + file);
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
            if(file.contains(CITA_MEDICA)){
                ArrayList<CitaMedica> Citas = cadena;
                for (CitaMedica cita : Citas) {
                    pw.println(cita.toString());
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
                System.out.println(ex.getMessage());
            }
        }
    }

    public boolean borrarTxt(ArrayList cadena, String file){
        if (cadena.size() == 0) {
            File archivo = new File(DIRECCION+CITA_MEDICA+file+".txt");
            archivo.delete();
            return true;
        }
        return false;
    }
}
