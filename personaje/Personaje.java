package personaje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import arma.Arma;
import controlador.Controlador;

public class Personaje implements Serializable{
    Scanner teclado=new Scanner(System.in);
    private int completado=0;

    //Datos base del personaje p1
    private String nombre;
    private String raza;
    private String sexo;
    private float altura;
    private float peso;
    private String ojos;
    private String cabello;
    private int edad;
    private String apariencia;

    //Datos extra del personaje p2
    private String particularidadesApreciaDetesta;
    //Datos extra del personaje p3
    private String personalidadMotivacion;
    //Datos extra del personaje p4
    private String suenosObjetivos;
    //Datos extra del personaje p5
    private String resumenHistoria;

    //Mas cosas
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
        constPorPartes();
    }

    public void constPorPartes(){
        switch (completado) {
            case 0:
                primeraParte();
                break;
            case 1:
                segundaParte();
                break;
            case 2:
                terceraParte();
                break;
            case 3:
                cuartaParte();
                break;
            case 4:
                quintaParte();
                break;
        
            default:
                break;
        }
    }
    private void primeraParte(){
        System.out.println("¿Como te llamas?");
        this.nombre=teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("Y exactamente tu eres un...");
        this.raza=teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("¿Que es lo que tienes ahi abajo?");
        this.sexo=teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("¿Dime cuanto mides?");
        this.altura=teclado.nextFloat();
        teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("¿Y el peso?");
        this.peso=teclado.nextFloat();
        teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("Okey, perfe");
        System.out.println("Describeme tus ojos");
        this.ojos=teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("Y ahora describeme tu pelo");
        this.cabello=teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("¿Cuantos anios tienes?");
        this.edad=teclado.nextInt();
        teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("¿Como es tu apariencia?");
        this.apariencia=teclado.nextLine();
        Controlador.limpiaPantalla();

        
        armas.add(new Arma("desarmado", 115, 80, 160, 20));
        Equipar(armas.get(0));

        completado=1;
        
        System.out.println("Aun te queda bastante");
        System.out.println("A continuacion te preguntare por: ");
        System.out.println("sus particularidades, lo que aprecia y detesta");
        System.out.println("¿Que quieres hacer?");
        System.out.println("1-Continuar");
        System.out.println("2-Guardar y salir");
        int decision = teclado.nextInt();
        teclado.nextLine();
        Controlador.limpiaPantalla();
        switch (decision) {
            case 1:
                segundaParte();
                break;
        
            default:
                break;
        }
    }
    private void segundaParte(){
        System.out.println("Continuamos la ficha de tu personaje "+nombre);
        System.out.println("Cuentame las particularidades");
        String particularidad = teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("Entiendo...");
        System.out.println("Ahora dime que es lo que aprecia ");
        String aprecia=teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("Yo aprecio el tiempo que le estas dedicando al personaje");
        System.out.println("Seguimos. ¿Que detesta?");
        String detesta=teclado.nextLine();
        Controlador.limpiaPantalla();

        particularidadesApreciaDetesta= "Algo particular de este personaje es que "+particularidad+"/n"+
        "Tambien "+aprecia+"/n"+
        "Y no nos olvidemos de "+detesta;

        System.out.println("MUY BIEN!!");
        completado=2;

        System.out.println("A continuacion te preguntare por: ");
        System.out.println("su personalidad y que le motiva");
        System.out.println("¿Que quieres hacer?");
        System.out.println("1-Continuar");
        System.out.println("2-Guardar y salir");
        int decision = teclado.nextInt();
        teclado.nextLine();
        Controlador.limpiaPantalla();
        switch (decision) {
            case 1:
                terceraParte();
                break;
        
            default:
                break;
        }
    }
    private void terceraParte(){
        System.out.println("Continuamos la ficha de tu personaje "+nombre);
        System.out.println("Cuentame como es su personalidad");
        String personalidad = teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("Debes tenerlo en cuenta a la hora de rolear, acuerdate");
        System.out.println("Ahora dime cual es su motivacion ");
        String motivacion=teclado.nextLine();
        Controlador.limpiaPantalla();

        personalidadMotivacion= "Su personalidad se basa en "+personalidad+"/n"+
        "y su motivacion es  "+motivacion;

        System.out.println("MUY BIEN!!");
        completado=3;

        System.out.println("A continuacion te preguntare por: ");
        System.out.println("Cuales son sus suenos y objetivos");
        System.out.println("¿Que quieres hacer?");
        System.out.println("1-Continuar");
        System.out.println("2-Guardar y salir");
        int decision = teclado.nextInt();
        teclado.nextLine();
        Controlador.limpiaPantalla();
        switch (decision) {
            case 1:
                cuartaParte();
                break;
        
            default:
                break;
        }
    }
    private void cuartaParte(){
        System.out.println("Continuamos la ficha de tu personaje "+nombre);
        System.out.println("Cuentame cual es su sueno");
        String sueno = teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("Curioso cuanto menos");
        System.out.println("Ahora dime cual es su objetivo ");
        String objetivo=teclado.nextLine();
        Controlador.limpiaPantalla();

        suenosObjetivos= "Su sueno es "+sueno+"/n"+
        "y su objetivo es "+objetivo;

        System.out.println("YA SOLO QUEDA EL FINAL DE MUCHO TEXTO");
        completado=4;

        System.out.println("Lo ultimo que te queda es contarnos su historia ");
        System.out.println("¿Te ves con fuerza para terminar o lo tienes que pensar aun?");
        System.out.println("1-Terminar");
        System.out.println("2-Guardar y salir");
        int decision = teclado.nextInt();
        teclado.nextLine();
        Controlador.limpiaPantalla();
        switch (decision) {
            case 1:
                quintaParte();
                break;
        
            default:
                break;
        }
    }
    private void quintaParte(){
        System.out.println("Continuamos la ficha de tu personaje "+nombre);
        System.out.println("Cuentame cual es su historia, sin saltos de linea:");
        String resumenHistoria = teclado.nextLine();
        Controlador.limpiaPantalla();

        System.out.println("YA SOLO QUEDA EL RESTO DE LA FICHA");
        completado=5;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }
    public String getSexo() {
        return sexo;
    }
    public float getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }
    public String getOjos() {
        return ojos;
    }
    public String getCabello() {
        return cabello;
    }
    public int getEdad() {
        return edad;
    }
    public String getApariencia() {
        return apariencia;
    }
    public String getParticularidadesApreciaDetesta() {
        return particularidadesApreciaDetesta;
    }
    public String getPersonalidadMotivacion() {
        return personalidadMotivacion;
    }
    public String getSuenosObjetivos() {
        return suenosObjetivos;
    }
    public String getResumenHistoria() {
        return resumenHistoria;
    }
    public String getClase() {
        return clase;
    }
    public int getVida() {
        return vida;
    }
    public int getKi() {
        return ki;
    }
    public ArrayList<Arma> getArmas() {
        return armas;
    }
    public Arma getArma() {
        return arma;
    }
    public int getTurno() {
        return turno;
    }
    public int getAtaque() {
        return ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public int getDaño() {
        return daño;
    }
    public int getCompletado(){
        return completado;
    }
    
    public boolean EligeArma(){
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
        arma=new Arma();
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

}
