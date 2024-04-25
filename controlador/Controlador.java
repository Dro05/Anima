package controlador;
public class Controlador {

    public static void limpiaPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
