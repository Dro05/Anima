import java.io.*;

public class EscribeFichero
{
    public static void main (String args[]){
        Personaje personaje = new Personaje("Sergio", "Sombra");
        FileOutputStream fichero = null;

        try {
            fichero=new FileOutputStream("datos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fichero);
            oos.writeObject(personaje);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } finally{

            try {
                fichero.close();
                
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}