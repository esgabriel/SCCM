package clases;

public class CitaMedica {

    int hora;
    String cedulaMedico;
    String nombreMedico;
    String nSSPaciente;
    String nombrePaciente;

    public CitaMedica() {
        hora = 0;
        cedulaMedico = "";
        nombreMedico = "";
        nSSPaciente = "";
        nombrePaciente = "";
    }

    public CitaMedica(int hora, String cedulaMedico, String nombreMedico, String nSSPaciente, String nombrePaciente) {
        this.hora = hora;
        this.cedulaMedico = cedulaMedico;
        this.nombreMedico = nombreMedico;
        this.nSSPaciente = nSSPaciente;
        this.nombrePaciente = nombrePaciente;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setCedulaMedico(String cedulaMedico) {
        this.cedulaMedico = cedulaMedico;
    }

    public String getCedulaMedico() {
        return cedulaMedico;
    }

    public String getNSSPaciente() {
        return nSSPaciente;
    }

    public void setNSSPaciente(String nSSPaciente) {
        this.nSSPaciente = nSSPaciente;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    @Override
    public String toString() {
        return hora + "~" + cedulaMedico + "~" + nombreMedico + "~" + nSSPaciente + "~" + nombrePaciente;
    }
}