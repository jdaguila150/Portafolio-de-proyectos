
package clases;

import java.util.Scanner;

public class cheque {
    
    Scanner Leer = new Scanner (System.in); 
    String nombre;
    int tipo;
    int num_horas;
    double cuota;
    double sueldo;
    
    public void acepta_datos(){
        System.out.println("Ingrese el nombre de su empleado ");
        this.nombre = Leer.nextLine();
        System.out.println("Ingrese el tipo de empleado que es "+nombre);
        this.tipo = Leer.nextInt();
        System.out.println("Cuantas horas trabajo?");
        this.num_horas = Leer.nextInt();
    }
    
    public void operaciones(){
        if ( tipo >0 && tipo <= 3 ) {
            if (tipo == 1) {
                cuota = 1000;
                sueldo = cuota  * num_horas;
                }
            else
                if (tipo == 2) {
                cuota = 1500;
                sueldo = cuota  * num_horas;               
                }
                else{
                    cuota = 2000;
                    sueldo = cuota * num_horas;
                    }  
        }
        else{
            cuota = 4000;
            sueldo = cuota * num_horas;
        }
    }
    
    public void desplegarDatos(){
        
        System.out.println("\t\t\tNombre\t\tsueldo");
        System.out.println("\t\t\t"+nombre+"\t\t"+sueldo);
        
        System.out.println("\t\tTipo de Empleado\t Horas Trabajadas\tCuota por Hora");
        System.out.println("\t\t\t"+tipo+"\t\t\t"+num_horas+"\t\t\t"+cuota);
    }
    
    
    
    
    
}
