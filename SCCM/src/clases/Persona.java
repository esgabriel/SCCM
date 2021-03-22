package clases;

public class Persona {

    private String nombre;
    private String aP;
    private String aM;
    private String fechaNacimiento;

    public Persona() {
        this.nombre = "";
        this.aP = "";
        this.aM = "";
        this.fechaNacimiento = "";
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

    @Override
    public String toString() {
        String persona = nombre + "," + aP + "," + aM + "," + fechaNacimiento;

        return persona;
    }

}
