import java.io.Serializable;

public class Personaje implements Serializable{
    private String nombre;
    private String clase;

    public Personaje(String nombre, String clase){
        this.nombre = nombre;
        this.clase = clase;

    }
}
