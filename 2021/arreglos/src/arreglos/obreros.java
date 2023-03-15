
package arreglos;

import java.util.Scanner;

public class obreros {
    public static void main (String[] Args){
        Scanner Leer = new Scanner (System.in);
        String nombre = "";
        double [] produccion = new double [30];
        double suma_produccion = 0;
        double prom_produccion = 0;
        double cont_arriba_prom = 0;
        double mayor_produccion = produccion [0];
        double pos_dia_productivo = 0;
        
        System.out.println("Ingrese el nombre del trabajador ");
        nombre  = Leer.nextLine();        
        for (int i = 0; i < 30; i++) {

            System.out.println("Que antidad produjo en el dia "+(i+1));
            produccion [i] = Leer.nextDouble();
            
            //Operaciones para sacar el promedio
            suma_produccion = suma_produccion + produccion [i];
            prom_produccion = (suma_produccion / 30);
                        
            //Calcular el dia con la mayor produccion
            if (produccion [i] > mayor_produccion) {
                mayor_produccion = produccion [i];
                pos_dia_productivo = i;
            }
            Leer.nextLine();
        }
        for (int i = 0; i < 30; i++) {
            //calcular la cantidad de dias arriba del prom
            prom_produccion = (suma_produccion / 30);
            if (produccion [i] > prom_produccion) {           
                cont_arriba_prom++; 
            }            
        }   
        System.out.println("El trabajador "+nombre+" obtuvo un promedio de produccion de "+prom_produccion);
        System.out.println("Obtuvo "+cont_arriba_prom+" dias por encima del promedio");
        System.out.println("Ademas que su mayor produccion fue de "+mayor_produccion+" hecha en el día "
                +(pos_dia_productivo+1));

        
        
        
        
        
        
    }
}
