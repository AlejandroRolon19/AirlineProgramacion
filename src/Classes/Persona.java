package Classes;


//------------------------------------- CLASE PADRE PARA PERSONAS -------------------------------------\\
public class Persona {
private String identificacion;
private String apellido;
private String nombre;
private int edad;
private String genero;

    public Persona() {
    }

    public Persona(String identificacion, String apellido, String nombre, int edad, String genero) {
        this.identificacion = identificacion;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
