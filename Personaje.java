import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Personaje implements Serializable{
    static Scanner teclado=new Scanner(System.in);
    //Datos base del personaje
    private String nombre;
    private String raza;
    private String sexo;
    private long altura;
    private long peso;
    private String ojos;
    private String cabello;
    private int edad;
    private String apariencia;

    //Datos extra del personaje
    private String particularidadesApreciaDetesta;
    private String personalidadMotivacion;
    private String suenosObjetivos;
    private String resumenHistoria;

    //Hola
    private String clase;
    private int vida;
    private int ki;
    private ArrayList<Arma> armas=new ArrayList<>();
    private Arma arma;
    private int turno;
    private int ataque;
    private int defensa;
    private int daño;
    //transient int algo; hace que cada vez que se cargue el personaje tenga cero en el numero

    public Personaje(){
        System.out.println("¿Como te llamas?");
        this.nombre=teclado.nextLine();
        limpiaPantalla();

        System.out.println("Y exactamente tu eres un...");
        this.raza=teclado.nextLine();
        limpiaPantalla();

        System.out.println("¿Que es lo que tienes ahi abajo?");
        this.sexo=teclado.nextLine();
        limpiaPantalla();

        System.out.println("¿Dime cuanto mides?");
        this.altura=teclado.nextLong();
        teclado.nextLine();
        limpiaPantalla();

        System.out.println("¿Y el peso?");
        this.peso=teclado.nextLong();
        teclado.nextLine();
        limpiaPantalla();

        System.out.println("Okey, perfe");
        System.out.println("Describeme tus ojos");
        this.ojos=teclado.nextLine();
        limpiaPantalla();

        System.out.println("Y ahora describeme tu pelo");
        this.cabello=teclado.nextLine();
        limpiaPantalla();

        System.out.println("Oye ¿Cuantos anios tienes?");
        this.edad=teclado.nextInt();
        teclado.nextLine();
        limpiaPantalla();
        System.out.println("Eso explica ese aura de estupided que emanas");
        System.out.println("JAJAJAJA");

        System.out.println("Y pues bueno 'Adonis' describete fisicamente");
        this.apariencia=teclado.nextLine();
        limpiaPantalla();

        System.out.println("¿Clase?");
        this.clase=teclado.nextLine();
        System.out.println("¿Vida?");
        this.vida=teclado.nextInt();
        System.out.println("¿Ki?");
        this.ki=teclado.nextInt();
        teclado.nextLine();

        armas.add(new Arma("desarmado", 115, 80, 160, 20));
        Equipar(armas.get(0));
        

        EligeArma();
    }
    void limpiaPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
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
