
package Classes;
//------------------------------------- CLASE HIJA PARA USUARIO -------------------------------------\\

import java.util.ArrayList;

public class Pasajero extends Persona {
    private int telefono; 
     //Se añadirá la información del avion/vuelo al que debe acudir
    Avion vuelo;
    //Registros de ambas aerolineas 
    ArrayList <Pasajero> pasajeroAvianca = new ArrayList<>();
    ArrayList <Pasajero> pasajeroLatam = new ArrayList<>();

    public Pasajero() {
    }

    public Pasajero(String identificacion, String apellido, String nombre, int edad, String genero, int telefono, Avion vuelo) {
        super(identificacion, apellido, nombre, edad, genero);
        this.telefono = telefono;
        this.vuelo = vuelo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Avion getVuelo() {
        return vuelo;
    }

    public void setVuelo(Avion vuelo) {
        this.vuelo = vuelo;
    }

    public ArrayList<Pasajero> getPasajeroAvianca() {
        return pasajeroAvianca;
    }

    public void setPasajeroAvianca(ArrayList<Pasajero> pasajeroAvianca) {
        this.pasajeroAvianca = pasajeroAvianca;
    }

    public ArrayList<Pasajero> getPasajeroLatam() {
        return pasajeroLatam;
    }

    public void setPasajeroLatam(ArrayList<Pasajero> pasajeroLatam) {
        this.pasajeroLatam = pasajeroLatam;
    }
    
    
}
