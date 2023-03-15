package veterinaria2;
import java.io.Serializable;

public class Mascota implements Serializable {
    
    private String nombre;
    private String raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
