import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*  Inicialmente el programa debe de buscar si existe o no el fichero de guardado de personajes
     *   si existe lo lee 
     *   si no, lo crea
     */ 
    static ArrayList<Personaje> personajes;
    static Personaje personaje=null;
    static Scanner teclado = new Scanner(System.in);
    static boolean seguir=true , seguir2=true;
    static Datos datos;

    public static void main (String args[]){

        datos = new Datos("datos.txt");
        if (datos.ExisteFichero()){
            personajes = datos.LeerDatos();
        }else{
            personajes = new ArrayList<>();
        }
        /*
         * Menu
         * 1-Crear Personaje
         * 2-Elegir personaje disponible
         * 3-Salir
         */
        MenuPersonaje();
        
    }
    static boolean Jugar(){
        
        

        int dado,resultado;
        while (true){
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println(personaje.getNombre()+"-------------"+personaje.getClase());
            System.out.println("Vida: "+personaje.getVida()+"-------------Ki: "+personaje.getKi());
            System.out.println("Ataque: "+personaje.getAtaque()+"-------------Defensa: "+personaje.getDefensa());
            System.out.println("-------------");
            System.out.println("Elige numero:");
            System.out.println("-------------");
            System.out.println("1-Atacar");
            System.out.println("2-Defender");
            System.out.println("3-Elige arma");
            System.out.println("4-Salir");
            System.out.println("-------------");
            System.out.print("Numero:");
            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch(opcion){
                case 1://Atacar
                System.out.print("Dado: ");
                dado = teclado.nextInt();
                teclado.nextLine();
                resultado = dado+personaje.getAtaque();
                System.out.println("Tu HA es de "+resultado);
                System.out.println("(Press Enter to continue)");
                teclado.nextLine();

                System.out.print("\033[H\033[2J");
                System.out.flush();

                break;

                case 2://Defender
                System.out.print("Dado: ");
                dado = teclado.nextInt();
                teclado.nextLine();
                resultado = dado+personaje.getDefensa();
                System.out.println("Tu HD es de "+resultado);
                System.out.println("(Press Enter to continue)");
                teclado.nextLine();

                System.out.print("\033[H\033[2J");
                System.out.flush();
                
                break;

                case 3://Elige arma
                personaje.EligeArma();
                break;

                case 4://Salir
                System.out.println("----------Saliendo-----------");
                System.out.println("-----------------------------");
                return MenuPersonaje();

                default:
                    System.out.println("Esa opcion no existe.");
            }
         }
    }

    static boolean MenuPersonaje(){
        

        while (true){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.println("-------------");
            System.out.println("Elige numero:");
            System.out.println("-------------");
            System.out.println("1-Crear personaje");
            System.out.println("2-Elegir personajes disponibles");
            System.out.println("3-Eliminar personaje");
            System.out.println("4-Salir");
            System.out.println("-------------");
            System.out.print("Numero:");
            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch(opcion){
                case 1:
                personaje=CrearPersonaje();
                personajes.add(personaje);
                datos.GuardarDatos(personajes);
                return Jugar();

                case 2:
                if(ElegirPersonaje()){
                    return Jugar();
                }else{
                    break;
                }

                case 3:
                if(EliminarPersonaje()){
                    datos.GuardarDatos(personajes);
                }
                break;

                case 4:
                return false;

                default:
                    System.out.println("Esa opcion no existe.");
            }
         }
    }
    static Personaje CrearPersonaje(){
        return new Personaje();
    }
    static boolean ElegirPersonaje(){
        String nombre;
        for(int i =0;i<personajes.size();i++){
            nombre=personajes.get(i).getNombre();
            System.out.println(i+"-"+nombre);
        }
        System.out.println("(Cualquier otro numero para cancelar)");
        System.out.print("Numero:");
        int numero = teclado.nextInt();
        if(numero<personajes.size()){
            personaje = personajes.get(numero);
            return true;
        }else{
            return false;
        }
    }
    static boolean EliminarPersonaje(){

        String nombre;
        for(int i =0;i<personajes.size();i++){
            nombre=personajes.get(i).getNombre();
            System.out.println(i+"-"+nombre);
        }
        System.out.println("(Cualquier otro numero para cancelar)");
        System.out.print("Numero:");
        int numero = teclado.nextInt();
        if(numero<personajes.size()){
            personajes.remove(numero);
            return true;
        }else{
            return false;
        }
    }
}
