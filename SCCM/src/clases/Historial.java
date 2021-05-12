package clases;

import java.util.ArrayList;
import java.util.Arrays;

public class Historial {

    private String cedula;
    private String Nss;
    private String diagnostico;
    private String receta;
    
    public Historial() {
        cedula = "";
        Nss = "";
        diagnostico = "";
        //receta = new ArrayList<>();
        receta = "";
    }
    
    public Historial(String Nss, String cedula,  String diagnostico, String receta){
        this.Nss = Nss;
        this.cedula = cedula;
        this.diagnostico = diagnostico;
        this.receta = receta;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNss() {
        return Nss;
    }

    public void setNss(String Nss) {
        this.Nss = Nss;
    }

    public String getDiagnostico() {
        return diagnostico.replace("@", "\n");
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }
    
    public ArrayList toArray(){
        ArrayList lista = new ArrayList<>();
        lista.addAll(Arrays.asList(receta.split("¬")));
        return lista;
    }
    
    @Override
    public String toString(){
        return String.format("%s~%s~%s~%s", Nss,cedula,diagnostico,receta);
    }
    
    public String forma(){
        return String.format("Doctor: %s", cedula);
    }
}
