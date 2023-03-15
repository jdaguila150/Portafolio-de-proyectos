package Archivo;

import java.io.Serializable;

public class Mascota implements Serializable {
    private String nombre;
    private String raza;
     
    // Método get para extraer el  valor de la variable de instancia nombre
    public String getNombre() {
        return nombre;
    }
  // Método set para asignar el valor a la variable de instancia nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 // Método get para extraer  el valor  de la variable de instancia raza
    public String getRaza() {
        return raza;
    }
 // Método set  para asigna valor a la variable de instancia raza 
    public void setRaza(String raza) {
        this.raza = raza;
    }
}

