package arma;
import java.io.Serializable;
import java.util.Scanner;

public class Arma implements Serializable{
    Scanner teclado=new Scanner(System.in);
    private String nombre="";
    private int ataque=0,defensa=0,daño=0,turno=0;

    public Arma(){
        System.out.print("Nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Turno: ");
        turno=teclado.nextInt();
        System.out.print("Ataque: ");
        ataque=teclado.nextInt();
        System.out.print("Defensa: ");
        defensa=teclado.nextInt();
        System.out.print("Dano: ");
        daño=teclado.nextInt();
    }

    public Arma(String nombre, int turno, int ataque, int defensa, int daño){
        this.nombre = nombre;
        this.turno=turno;
        this.ataque=ataque;
        this.defensa=defensa;
        this.daño=daño;
    }

    public String getNombre(){
        return nombre;
    }
    public int getTurno(){
        return turno;
    }
    public int getAtaque(){
        return ataque;
    }
    public int getDefensa(){
        return defensa;
    }
    public int getDaño(){
        return daño;
    }
}
