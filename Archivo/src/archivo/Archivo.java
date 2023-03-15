package Archivo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Archivo {
    ArrayList<Mascota> ListRecuperada = new ArrayList<>();
    
    ArrayList<Mascota> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("animal.dat"));
            ListRecuperada = (ArrayList<Mascota>)in.readObject();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "BIENVENIDO POR PRIMERA VEZ AL SISTEMA");
        }
        
        return ListRecuperada;
    }
    
    void serializar(ArrayList<Mascota> ListaSeriar){
        try{
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("animal.dat"));
            objOut.writeObject(ListaSeriar);
            objOut.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo escribir el Archivo de marcotas");
        }
    }
}
