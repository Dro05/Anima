import java.util.Scanner;

public class calculaMediaHora {
    static Scanner teclado = new Scanner(System.in);
    public static void main (String args[]){
        boolean otro = false;
        float horas=0, espectador =0, total=0,arriba=0,abajo=0;
        do{
            horas=pideHoras();
            espectador=pideMedia();
            arriba=arriba+(horas*espectador);
            abajo = abajo+horas;
            total=arriba/abajo;
            System.out.println("La media ahora es de "+total);
            otro=pideOtro();
        }while(otro);
    }
    static float pideHoras(){
        System.out.print("Dame las horas: ");
        float horas = teclado.nextFloat();
        System.out.print("Dame los minutos: ");
        float minutos = teclado.nextFloat();
        horas = horas + (minutos/60);
        return horas;
    }
    static float pideMedia(){
        System.out.print("Dame la media: ");
        return teclado.nextFloat();
    }
    static boolean pideOtro(){
        System.out.print("¿Vas a meter otro? (true/false): ");
        return teclado.nextBoolean();
    }
}
