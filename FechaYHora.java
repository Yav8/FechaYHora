
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

    public String getFechaYHora() {
        String fechaHora = "";
        if(dia < 10) {
            fechaHora += "0" + dia;
        }
        else {
            fechaHora += dia;
        }
        fechaHora += "-";
        if(mes < 10) {
            fechaHora += "0" + mes;
        }
        else {
            fechaHora += mes;
        }
        fechaHora += "-";
        if(ano < 10) {
            fechaHora += "0" + ano;
        }
        else {
            fechaHora += ano;
        }
        fechaHora += " ";
        if(hora < 10) {
            fechaHora += "0" + hora;
        }
        else {
            fechaHora += hora;
        }
        fechaHora += ":";
        if(minuto < 10) {
            fechaHora += "0" + minuto;
        }
        else {
            fechaHora += minuto;
        }
        return fechaHora;
    }
    
    public void avanzar() {
        minuto += 1;
        if(minuto == 60) {
            minuto = 0;
            hora += 1;
        }
        if(hora == 24) {
            hora = 0;
            dia += 1;
        }
        if(dia == 31) {
            dia = 1;
            mes += 1;
        }
        if(mes == 13) {
            mes = 1;
            ano += 1;
        }
        if(ano == 100) {
            ano = 1;
        }
    }
    
    public void fijarFechaYHora(int fijaDia, int fijaMes, int fijaAno, int fijaHora, int fijaMinuto) {
        dia = fijaDia;
        mes = fijaMes;
        ano = fijaAno;
        hora = fijaHora;
        minuto = fijaMinuto;
    }
}
