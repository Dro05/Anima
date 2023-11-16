import java.io.Serializable;

public class Arma implements Serializable{
    private String nombre="";
    private int ataque=0,defensa=0,daño=0,turno=0;

    Arma(String nombre, int turno, int ataque, int defensa, int daño){
        this.nombre=nombre;
        this.turno=turno;
        this.ataque=ataque;
        this.defensa=defensa;
        this.daño=daño;
    }

    String getNombre(){
        return nombre;
    }
    int getTurno(){
        return turno;
    }
    int getAtaque(){
        return ataque;
    }
    int getDefensa(){
        return defensa;
    }
    int getDaño(){
        return daño;
    }
}
