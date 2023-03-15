
package veterinaria;
public class Mascota {
    //Debido a que son privadas, es necesario el uso de Setters y getters para poder asignar y devolver valores a las variables
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
