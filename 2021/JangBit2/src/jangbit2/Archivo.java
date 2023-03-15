package jangbit2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Archivo {
    public ArrayList<DatosUser> ListRecuperada = new ArrayList<>();
    
    public ArrayList<DatosUser> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("usuario.dat"));
            ListRecuperada = (ArrayList<DatosUser>)in.readObject();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "BIENVENIDO POR PRIMERA VEZ AL SISTEMA");
        }
        
        return ListRecuperada;
    }
    
   public void serializar(ArrayList<DatosUser> ListaSeriar){
        try{
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("usuario.dat"));
            objOut.writeObject(ListaSeriar);
            objOut.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo escribir el Archivo de usuario");
        }
    }
}
