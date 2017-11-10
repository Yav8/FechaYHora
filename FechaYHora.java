
public class FechaYHora {
    private int dia;
    private int mes;
    private int ano;
    private int minuto;
    private int hora;

    public FechaYHora() {
        dia = 1;
        mes = 1;
        ano = 1;
        minuto = 0;
        hora = 0;
    }
    
    public String getFechaYHora(){
        String fechaHora = "";
        if(dia < 10) {
            fechaHora = "0" + dia;
        }
        else {
            fechaHora = "" + dia;
        }
        fechaHora += "-";
        if(mes < 10) {
            fechaHora += "0" + mes;
        }
        else {
            fechaHora += "" + mes;
        }
        fechaHora += "-";
        if(ano < 10) {
            fechaHora += "0" + ano;
        }
        else {
            fechaHora += "" + ano;
        }
        fechaHora += " ";
        if(hora < 10) {
            fechaHora += "0" + hora;
        }
        else {
            fechaHora += "" + hora;
        }
        fechaHora += ":";
        if(minuto < 10) {
            fechaHora += "0" + minuto;
        }
        else {
            fechaHora += "" + minuto;
        }
        return fechaHora;
    }    
}
