import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Personaje implements Serializable{
    static Scanner teclado=new Scanner(System.in);
    private String nombre;
    private String clase;
    private int vida;
    private int ki;
    private ArrayList<Arma> armas=new ArrayList<>();
    private Arma arma;
    private int turno;
    private int ataque;
    private int defensa;
    private int daño;
    
    public Personaje(){
        System.out.println("¿Nombre?");
        this.nombre=teclado.nextLine();
        System.out.println("¿Clase?");
        this.clase=teclado.nextLine();
        System.out.println("¿Vida?");
        this.vida=teclado.nextInt();
        System.out.println("¿Ki?");
        this.ki=teclado.nextInt();

        armas.add(new Arma("desarmado", 115, 80, 160, 20));
        teclado.nextLine();

        EligeArma();
    }
    
    boolean EligeArma(){
        String nombre;

        for(int i =0;i<armas.size();i++){
            nombre=armas.get(i).getNombre();
            System.out.println(i+"-"+nombre);
        }

        System.out.println(armas.size()+"-Anadir arma");
        System.out.println("(Cualquier otro numero para cancelar)");
        System.out.print("Numero:");
        int numero = teclado.nextInt();
        teclado.nextLine();

        if(numero<armas.size()){
            arma = armas.get(numero);
            Equipar(arma);
            return true;
        }else{
            if(numero==armas.size()){
                return CrearArma();
            }else{
                return false;
            }
        }
    }

    boolean CrearArma(){
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Turno: ");
        int turno=teclado.nextInt();
        System.out.print("Ataque: ");
        int ataque=teclado.nextInt();
        System.out.print("Defensa: ");
        int defensa=teclado.nextInt();
        System.out.print("Dano: ");
        int daño=teclado.nextInt();

        arma=new Arma(nombre, turno, ataque, defensa, daño);
        armas.add(arma);
        Equipar(arma);

        return true;
    }

    boolean Equipar(Arma arma){
        ataque=arma.getAtaque();
        daño=arma.getDaño();
        defensa=arma.getDefensa();
        turno=arma.getTurno();
        return true;
    }
    String getNombre(){
        return nombre;
    }
    String getClase(){
        return clase;
    }
    int getVida(){
        return vida;
    }
    int getTurno(){
        return turno;
    }
    int getKi(){
        return ki;
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
