package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

    private String nombre;
    private String aP;
    private String aM;
    private String fechaNacimiento;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.aP = "";
        this.aM = "";
        this.fechaNacimiento = "";
        this.edad = 0;
    }

    public Persona(String nombre, String aP, String aM, String fechaNacimiento) {
        this.nombre = nombre;
        this.aP = aP;
        this.aM = aM;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaP() {
        return aP;
    }

    public void setaP(String aP) {
        this.aP = aP;
    }

    public String getaM() {
        return aM;
    }

    public void setaM(String aM) {
        this.aM = aM;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad() {
        Date fechaActual = new Date();
        SimpleDateFormat formatoDate = new SimpleDateFormat("yyyy");
        String fecha = formatoDate.format(fechaActual);
        
        
        edad = Integer.valueOf(fecha) - Integer.valueOf(getFechaNacimiento().split("-")[2]);
    }

    public int getEdad(){
        return edad;
    }
    
    public String getNombreCompleto(){
        return nombre+" "+aP+" "+aM;
    }
    @Override
    public String toString() {
        String persona = nombre + "~" + aP + "~" + aM + "~" + fechaNacimiento;

        return persona;
    }
}
