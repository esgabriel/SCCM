package clases;

public class Paciente extends Persona{

    private int numeroSeguroSocial;
    
    public Paciente(int numeroSeguroSocial) {
        super();
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    public Paciente(int numeroSeguroSocial, String nombre, String aP, String aM, String fechaNacimiento)
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

    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

}
