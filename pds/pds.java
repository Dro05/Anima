package pds;

import java.util.Scanner;

public class pds {
    String[][][] puntos = new String[3][7][12];
    int pDispo = 0;
    // Habilidades de combate (0)
    //// Base (0-3)
    double ataque = 0;
    double parada = 0;
    double esquiva = 0;
    double armadura = 0;

    // Habilidades secundarias(1)
    //// Atleticas (10) (0-6)
    double acrobacias = 0;
    double atletismo = 0;
    double montar = 0;
    double nadar = 0;
    double trepar = 0;
    double saltar = 0;
    double pilotar = 0;

    //// Sociales (11) (0-6)
    double estilo = 0;
    double intimidar = 0;
    double liderazgo = 0;
    double persuasion = 0;
    double comercio = 0;
    double callejeo = 0;
    double etiqueta = 0;

    //// Percepcion (12) (0-2)
    double advertir = 0;
    double buscar = 0;
    double rastrear = 0;

    //// Intelectual (13) (0-11)
    double animales = 0;
    double ciencia = 0;
    double ley = 0;
    double herbolaria = 0;
    double historia = 0;
    double tactica = 0;
    double medicina = 0;
    double memorizar = 0;
    double navegacion = 0;
    double ocultismo = 0;
    double tasacion = 0;
    double vMagica = 0;

    //// Vigor (14) (0-2)
    double frialdad = 0;
    double pFuerza = 0;
    double rDolor = 0;

    //// Subterfugio (15) (0-6)
    double cerrageria = 0;
    double disfraz = 0;
    double ocultarse = 0;
    double robo = 0;
    double sigilo = 0;
    double tramperia = 0;
    double venenos = 0;

    //// Creativas (16) (0-11)
    double arte = 0;
    double baile = 0;
    double forja = 0;
    double runas = 0;
    double alquimia = 0;
    double animismo = 0;
    double musica = 0;
    double tManos = 0;
    double caligrafiaRitual = 0;
    double orfebreria = 0;
    double confeccion = 0;
    double cMarionetas = 0;

    // Vida (2)
    double pvs = 0;

    public pds() {
        puntos[0][0][0] = "Ataque";
        puntos[0][0][1] = "Parada";
        puntos[0][0][2] = "Esquiva";
        puntos[0][0][3] = "Armadura";

        puntos[1][0][0] = "Acrobacias";
        puntos[1][0][1] = "Atletismo";
        puntos[1][0][2] = "Montar";
        puntos[1][0][3] = "Nadar";
        puntos[1][0][4] = "Trepar";
        puntos[1][0][5] = "Saltar";
        puntos[1][0][6] = "Pilotar";

        puntos[1][1][0] = "Estilo";
        puntos[1][1][1] = "Intimidar";
        puntos[1][1][2] = "Liderazgo";
        puntos[1][1][3] = "Persuasion";
        puntos[1][1][4] = "Comercio";
        puntos[1][1][5] = "Callejeo";
        puntos[1][1][6] = "Etiqueta";

        puntos[1][2][0] = "Advertir";
        puntos[1][2][1] = "Buscar";
        puntos[1][2][2] = "Rastrear";

        puntos[1][3][0] = "Animales";
        puntos[1][3][0] = "Ciencia";
        puntos[1][3][0] = "Ley";
        puntos[1][3][0] = "Herbolaria";
        puntos[1][3][0] = "Historia";
        puntos[1][3][0] = "Tactica";
        puntos[1][3][0] = "Medicina";
        puntos[1][3][0] = "Memorizar";
        puntos[1][3][0] = "Navegacion";
        puntos[1][3][0] = "Ocultismo";
        puntos[1][3][0] = "Tasacion";
        puntos[1][3][0] = "Valoracion magica";

        puntos[1][4][0] = "Frialdad";
        puntos[1][4][0] = "Proeza de fuerza";
        puntos[1][4][0] = "Resistencia al dolor";

        puntos[1][5][0] = "Cerrageria";
        puntos[1][5][0] = "Disfraz";
        puntos[1][5][0] = "Ocultarse";
        puntos[1][5][0] = "Robo";
        puntos[1][5][0] = "Sigilo";
        puntos[1][5][0] = "Tramperia";
        puntos[1][5][0] = "Venenos";

        puntos[1][6][0] = "Arte";
        puntos[1][6][0] = "Baile";
        puntos[1][6][0] = "Forja";
        puntos[1][6][0] = "Runas";
        puntos[1][6][0] = "Alquimia";
        puntos[1][6][0] = "Animismo";
        puntos[1][6][0] = "Musica";
        puntos[1][6][0] = "Truco de manos";
        puntos[1][6][0] = "Caligrafia ritual";
        puntos[1][6][0] = "Orfebreria";
        puntos[1][6][0] = "Confeccion";
        puntos[1][6][0] = "Confeccion de marionetas";

        puntos[2][0][0] = "Vida";
    }

    Scanner teclado = new Scanner(System.in);

    void menu() {
        int i, j, k, valor;
        System.out.println("Indica lugar");
        System.out.println("0-Ayuda");
        System.out.println("1-Habilidades de combate");
        System.out.println("2-Habilidades secundarias");
        System.out.println("3-Vida");

        i = teclado.nextInt();
        switch (i) {
            case 0:

                break;
            case 1:
                System.out.println("Indica caracteristica a modificar");
                System.out.println("0-Ayuda");
                System.out.println("1-Ataque");
                System.out.println("2-Parada");
                System.out.println("3-Esquiva");
                System.out.println("4-Armadura");
                j = teclado.nextInt();

                switch (j) {
                    case 0:

                        break;
                    case 1:
                        System.out.print("Cantidad a sumar:");
                        valor = teclado.nextInt();
                        pDispo -= valor;
                        ataque += valor;
                        break;
                    case 2:
                        System.out.print("Cantidad a sumar:");
                        valor = teclado.nextInt();
                        pDispo -= valor;
                        parada += valor;

                        break;
                    case 3:
                        System.out.print("Cantidad a sumar:");
                        valor = teclado.nextInt();
                        pDispo -= valor;
                        esquiva += valor;

                        break;
                    case 4:
                        System.out.print("Cantidad a sumar:");
                        valor = teclado.nextInt();
                        pDispo -= valor;
                        armadura += valor;

                        break;

                    default:
                        break;
                }

                break;
            case 2:
            System.out.println("Indica lugar");
            System.out.println("0-Ayuda");
            System.out.println("1-Habilidades de combate");
            System.out.println("2-Habilidades secundarias");
            System.out.println("3-Vida");
            j = teclado.nextInt();

                switch (j) {
                    case value:
                        
                        break;
                
                    default:
                        break;
                }

                break;
            case 3:

                break;

            default:
                break;
        }
    }
}
