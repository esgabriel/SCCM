/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author TheHu
 */
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
    
    @Override
    public String toString() {
        String medico = super.toString() + "," + this.cedula ;

        return medico;
    }
}
