package veterinaria2;
import java.util.ArrayList;
import java.util.Scanner;

public class mVeterinaria {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int longLista = 0;
        String mascotaBuscar;
        boolean encontrado = false;
        String resp = "";
        ArrayList<Mascota> LMascota = new ArrayList<>(); 
        Archivo objArchivo = new Archivo();
        LMascota = objArchivo.leer();
        
        do{
            System.out.println("Menú");
            System.out.println("1.- Registrar mascotas");
            System.out.println("2.- Ver las mascotas");
            System.out.println("3.- Buscar mascota");
            System.out.println("4.- Borrar mascota");
            System.out.println("5.- SALIR");
            System.out.println("Teclee opcion deseada");
            opcion = entrada.nextInt();
            
            switch (opcion){
                
                case 1: 
                    Mascota objMascota = new Mascota();
                    System.out.println("De el nombre de la mascota.");
                    objMascota.setNombre(entrada.next());
                    System.out.println("De el nombre de la raza.");
                    objMascota.setRaza(entrada.next());
                    LMascota.add(objMascota);
                    break;
                case 2: 
                    System.out.println("Las mascotas son: ");
                    longLista = LMascota.size();
                    for (int i = 0; i < longLista; i++) {
                        System.out.println("Los datos de su mascota son: "+LMascota.get(i).getNombre()+" "+LMascota.get(i).getRaza());
                    }
                    break;
                case 3: 
                    System.out.println("Teclee el nombre de la mascota.");
                    mascotaBuscar = entrada.next();
                    for (int i = 0; i < LMascota.size(); i++) {
                        if (LMascota.get(i).getNombre().equalsIgnoreCase(mascotaBuscar)) {
                            System.out.println("Los datos de su mascota son: "+LMascota.get(i).getNombre()+" "+LMascota.get(i).getRaza());
                            encontrado = true;
                            break;
                        }
                    }
                    if(encontrado == false){
                        System.out.println("Lo sentimos, no existe la mascota.");
                    }
                    encontrado = false;
                    break;
                case 4:
                    System.out.println("Teclee el nombre de la mascota: ");
                    mascotaBuscar = entrada.next();
                    for (int i = 0; i < LMascota.size(); i++) {
                        if (LMascota.get(i).getNombre().equals(mascotaBuscar)) {
                            System.out.println("Los datos de su mascota son: "+LMascota.get(i).getNombre()+" "+LMascota.get(i).getRaza());
                            encontrado = true;
                            
                            System.out.println("¿Desea dar de baja a la mascota? si/no");
                            resp = entrada.next();
                            if(resp.equalsIgnoreCase("si")){
                                LMascota.remove(i);
                            }
                            else{
                                System.out.println("No se borró la mascota");
                            }
                            
                            if (encontrado == false) {
                                System.out.println("Lo sentimos, no existe la mascota");
                            }
                            
                            encontrado = false;
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa, Bye!!");
                    objArchivo.serializar(LMascota);
                    break;
            }
            
        } while(opcion != 4); 
        
    }
    
}
