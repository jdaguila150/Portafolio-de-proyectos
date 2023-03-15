package veterinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
//Declaración de vairables
int opcion;
int longLista = 0;
String mascotaBuscar;
boolean encontrado = false;
ArrayList<Mascota> LMascota = new ArrayList<>();
do {
    //Se despliega un menu de opciones
System.out.println("Menu");
System.out.println("1- Registrar mascota");
System.out.println("2- Ver las mascotas");
System.out.println("3. Buscar mascota");
System.out.println("4.- SALIR");
System.out.println("Teclee opcion deseada");
opcion = entrada.nextInt();
switch (opcion) {

case 1:
    //Se ingresan datos a la ArrayList
Mascota objMascota = new Mascota();
System.out.println("De el nombre de la mascota");
objMascota.setNombre(entrada.next());
System.out.println("De el nombre de la raza");
objMascota.setRaza(entrada.next());
LMascota.add(objMascota);
break;
case 2:
    //Se está desplegando al arrayList
System.out.println("las mascotas son : ");
longLista = LMascota.size();
for (int i = 0; i < longLista; i++) {
    //Busca dentro de la ArrayList el Nombre y lo despliega, y busca la raza y la despliega
System.out.println("Los datos de su masota son: " + LMascota.get(i).getNombre() + " " + LMascota.get(i).getRaza());
}
break;
case 3:
    //Busca un dato especifico dentro de la ArrayList
System.out.println("Teclee nombre de la mascota : ");
mascotaBuscar = entrada.next();
for (int i = 0; i <  LMascota.size(); i++) {
    //Si el dato fue encontrado, se desplegaran todos los datos de ese elemento dentro de la arrayList
if (LMascota.get(i).getNombre().equals(mascotaBuscar)) {
System.out.println(" Los datos de su masota son: " + LMascota.get(i).getNombre() + " " + LMascota.get(i).getRaza());
encontrado = true;

}
}
if (encontrado == false) {
    //Si no se encuentra el dato se despliega lo siguiente
System.out.println("Lo sentimos, no existe la mascota");
}
encontrado = false;
break;
case 4:
    //Finaliza el programa
System.out.println("GRACIAS POR USAR EL PROGRAMA BYE!!");
break;
} 
} while (opcion != 4);
} 
}

