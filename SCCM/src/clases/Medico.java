
package clases;

import java.util.ArrayList;

public class Medico extends Persona {
    private String cedula;

    public Medico() {
        super();
        this.cedula = "";
    }

    public Medico(String cedula, String nombre, String aP, String aM, String fechaNacimiento) {
        super(nombre, aP, aM, fechaNacimiento);
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public static Medico buscar(ArrayList<Medico> listaMedicos, String cedula){
        for(Medico medicoTemp : listaMedicos){
            if (medicoTemp.getCedula().equals(cedula)) {
                return medicoTemp;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        String medico = super.toString() + "~" + this.cedula ;

        return medico;
    }
}
