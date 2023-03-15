
package arreglos;

import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        Scanner Leer = new Scanner (System.in); 
        String [] articulos= new String[10];
        int [][] produccion = new int [10][3];
        int [] suma = new int [10];
        int [] sumasc = new int [3];
        int suma_total = 0;
        int suma_articulo_mayor = 0;
        int articulo_mayor = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca el articulo "+(i+1));

            articulos[i]=Leer.nextLine();
            
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce la produccion del turno "+(j+1));
                produccion[i][j]= Leer.nextInt();
            }
                        Leer.nextLine();
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i]=suma[i]+produccion[i][j];
            }
        }
        for (int i = 0; i < 10; i++) {
           sumasc[0]= sumasc[0]+produccion[i][0];
           sumasc[1]= sumasc[1]+produccion[i][1];
           sumasc[2]= sumasc[2]+produccion[i][2];
        }
        suma_articulo_mayor = suma[0];
        for (int i = 0; i < 10; i++) {
            suma_total = suma_total + suma[i];
            if(suma_articulo_mayor<suma[i]){
               suma_articulo_mayor = suma[i];
               articulo_mayor = i;
            }
        }
        

        System.out.println("Reporte diario de produccion");
        System.out.println("Articulo \t\tTurno 1 \t\t\t Turno 2 \t\t\t Turno 3 \t\t\t\t Tot. Prod.");
        for (int i = 0; i < 10; i++) {
                System.out.println(articulos[i]+"\t\t\t\t"+produccion[i][0]+"\t\t\t\t"+produccion[i][1]+"\t\t\t\t"+produccion[i][2]+"\t\t\t\t"+suma[i]);
            }
        System.out.println("Total \t\t\t\t"+sumasc[0]+"\t\t\t\t"+sumasc[1]+"\t\t\t\t"+sumasc[2]+"\t\t\t\t"+suma_total);

        System.out.println("Articulo con mayor produccion: "+articulos[articulo_mayor]);
        System.out.println("Produccion del articulo mayor: "+suma_articulo_mayor);

        }
        
        
}
    

