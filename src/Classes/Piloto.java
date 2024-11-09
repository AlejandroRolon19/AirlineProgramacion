package Classes;

//------------------------------------- CLASE HIJA PARA PILOTO -------------------------------------\\
public class Piloto extends Persona {

    private String locacion;
    private String ranking;
    private String balance;
    //Se añadirá la información del avion/vuelo al que debe acudir
    Avion vuelo;

    public Piloto() {
    }

    public Piloto(String identificacion, String apellido, String nombre, int edad, String genero, String locacion, String ranking, String balance, Avion vuelo) {
        super(identificacion, apellido, nombre, edad, genero);
        this.locacion = locacion;
        this.ranking = ranking;
        this.balance = balance;
        this.vuelo = vuelo;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Avion getVuelo() {
        return vuelo;
    }

    public void setVuelo(Avion vuelo) {
        this.vuelo = vuelo;
    }


}
