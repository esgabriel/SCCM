package clases;

public class Paciente extends Persona{

    private String numeroSeguroSocial;
    
    public Paciente(String numeroSeguroSocial) {
        super();
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    public Paciente(String numeroSeguroSocial, String nombre, String aP, String aM, String fechaNacimiento)
    {
        super(nombre, aP, aM, fechaNacimiento);
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public void agregar() {

    }

    public void eliminar() {

    }

    @Override
    public String toString() {
        String paciente = super.toString() + "," + this.numeroSeguroSocial ;

        return paciente;
    }



    public void modificar() {

    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

}
