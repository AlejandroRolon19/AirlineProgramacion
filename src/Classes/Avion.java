package Classes;

//------------------------------------- CLASE PADRE PARA LOS VUELOS -------------------------------------\\

import java.util.ArrayList;

public class Avion {

    private String modelo;
    private int asientos;
    private String partida;
    private String llegada;
    private String dia;
    private String hora;
    //Registro de los vuelos de las aerolíneas
    ArrayList<Avion> vueosAvianca = new ArrayList<>();
    ArrayList<Avion> vuelosLatam = new ArrayList<>();

    public Avion() {
    }

    public Avion(String modelo, int asientos, String partida, String llegada, String dia, String hora) {
        this.modelo = modelo;
        this.asientos = asientos;
        this.partida = partida;
        this.llegada = llegada;
        this.dia = dia;
        this.hora = hora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public ArrayList<Avion> getVueosAvianca() {
        return vueosAvianca;
    }

    public void setVueosAvianca(ArrayList<Avion> vueosAvianca) {
        this.vueosAvianca = vueosAvianca;
    }

    public ArrayList<Avion> getVuelosLatam() {
        return vuelosLatam;
    }

    public void setVuelosLatam(ArrayList<Avion> vuelosLatam) {
        this.vuelosLatam = vuelosLatam;
    }

   

 


}
