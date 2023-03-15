
package clases;

import java.util.Scanner;

public class hielo_seco {
    
    Scanner Leer = new Scanner(System.in);
    private String nombre;
    private int tipo;
    private int cantidad_hojas;
    private double precio_unidad;
    private double precio_final;
    private double precio_neto;
    private double porcentaje;
    
    public void acepta_datos(){
        System.out.println("Indique el nombre del cliente");
        this.nombre = Leer.nextLine();
        System.out.println("Que tipo de cliente es "+nombre+"?");
        this.tipo = Leer.nextInt();
        System.out.println("\nCuantas hojas compro?");
        this.cantidad_hojas = Leer.nextInt();
        System.out.println("A que precio se vendieron las hojas?");
        this.precio_unidad = Leer.nextDouble();
    }
    
    public void operaciones(){
        if (this.tipo == 1) {
            this.precio_neto = cantidad_hojas * precio_unidad;
            this.porcentaje = .05 * ((double) cantidad_hojas) * precio_unidad;
            this.precio_final = ((double) cantidad_hojas * precio_unidad) - porcentaje;
        }
            else
                if (this.tipo == 2) {
                this.precio_neto = cantidad_hojas * precio_unidad;
                this.porcentaje = .08 * ((double) cantidad_hojas) * precio_unidad;
                this.precio_final = ((double) cantidad_hojas * precio_unidad) - porcentaje;
                }
                    else
                        if (this.tipo == 3) {
                        this.precio_neto = cantidad_hojas * precio_unidad;
                        this.porcentaje = .12 * ((double) cantidad_hojas) * precio_unidad;
                        this.precio_final = ((double) cantidad_hojas * precio_unidad) - porcentaje;
                        }
                            else
                                if (this.tipo == 4) {
                                this.precio_neto = cantidad_hojas * precio_unidad;
                                this.porcentaje = .15 * ((double) cantidad_hojas) * precio_unidad;
                                this.precio_final = ((double) cantidad_hojas * precio_unidad) - porcentaje;                              
                                }
        }
    
    public void despliegue(){
        System.out.println("El cliente "+nombre+" compro una catidad de "+cantidad_hojas+
                " a un precio de "+precio_unidad+" cada una, siendo un total de "+precio_neto);
        System.out.println("Al ser un cliente tipo "+tipo+" la cantidad descontada de su producto es "+porcentaje+
                " dando como resultado "+precio_final);
    }
    
    
    
    
    
    
    
    
    
    
    
    }
    

