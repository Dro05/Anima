package datos;
import java.io.*;
import java.util.ArrayList;

import personaje.Personaje;

public class Datos
{
    /*
     * Esta clase se encarga de leer los datos que tiene guardados de los personajes en x fichero dado
     * Consta de 3 metodos:
     * boolean ExisteFichero() encargado de mirar si existe o no el fichero de datos
     * LeerDatos() encargado de devolver los datos guardados en el fichero en ArrayList de personajes
     * GuardarDatos() encargado de guardar los personajes que tengas
     */

    private String nombrefichero;

    public Datos(String nombrefichero){
        this.nombrefichero=nombrefichero;
    }

    public boolean existeFichero(){
        /*
         * Comprueba que el fichero de datos existe
         */
        File file = new File(nombrefichero);
        return file.exists();
    }

    public ArrayList<Personaje> leerDatos(){
        /*
         * Este metodo lee el fichero de datos
         * Primero comprueba que existe el fichero
         * Revisa si los datos son leidos correctamente 
         * Devuelve un ArrayList<Personajes> con todos los personajes del usuario
         */
        ArrayList<Personaje> personajes = new ArrayList<>();

        if (existeFichero()) {
            FileInputStream leer = null;

            try {
                leer=new FileInputStream(nombrefichero);
                ObjectInputStream ois = new ObjectInputStream(leer);

                Object object = ois.readObject();//error

                if (object instanceof ArrayList<?>) {
                    ArrayList<?> aList = (ArrayList<?>)object;

                    if (aList.size()>0) {

                        for(int i = 0;i<aList.size();i++){
                            Object object2=aList.get(i);

                            if (object2 instanceof Personaje) {
                                Personaje personaje=(Personaje)object2;
                                personajes.add(personaje);

                            }else{
                                System.out.println("Personaje corrupto");
                            }
                        }
                    }else{
                        System.out.println("No hay personajes");
                    }
                }else{
                    System.out.println("Fichero corrupto, no se pudo leer");
                }

                ois.close();
                return personajes;

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

    public void guardarDatos(ArrayList<Personaje> arrayList){
        FileOutputStream fichero = null;

        try {
            fichero=new FileOutputStream(nombrefichero);

            ObjectOutputStream oos = new ObjectOutputStream(fichero);
            oos.writeObject(arrayList);
            oos.close();
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        } finally{

            try {
                fichero.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}