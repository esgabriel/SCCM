
package clases;

public class CitaMedica {
    String cita;
    
    public CitaMedica(){
        cita = "";
    }

    public void setCita(String cita){
        this.cita = cita;
    }
    
    public String getCita(){
        return cita;
    }
    
    public String formato(String [] arreglo){
        String texto = arreglo[0]+"~"+arreglo[1]+"~"+arreglo[2]+"~"+arreglo[3]+"~"+arreglo[4]+"~"+arreglo[5]+"~"+arreglo[6]+"~"+arreglo[7];
        return texto;
    }
}
