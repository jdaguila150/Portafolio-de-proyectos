
package arreglos;

import java.util.Scanner;

public class Estaturas {
    public static void main (String[] Args){
        
        Scanner Leer = new Scanner (System.in);
        String [] nombre = new String [10];
        double [] peso = new double[10];
        double [] estatura = new double[10];
        double prom_peso = 0d;
        double prom_estatura = 0;
        double suma_peso = 0;
        double peso_mayor = peso [0];
        double suma_estatura = 0;
        double estatura_mayor = estatura [0];
        String nombre_peso_mayor = "";
        String nombre_peso_menor = "";
        String nombre_estatura_mayor = "";
        String nombre_estatura_menor = "";
        int pos_menor_estatura = 0;
        int pos_mayor_estatura = 0;
        int pos_menor_peso = 0;
        int pos_mayor_peso=0;
        
        
        
        // Guarda los nombres
        for (int i = 0; i < 10; i++) {           
            System.out.println("Ingresa el nombre de la persona "+(i+1));
            nombre [i] = Leer.nextLine();
        }
        
        //Guarda y opera con pesos
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el peso en kilogramos de "+nombre[i]);
            peso [i] = Leer.nextDouble();
            suma_peso = suma_peso + peso[i];

        }  
        //Guarda y opera con estaturas
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa la estatura de "+nombre[i]);
            estatura [i] = Leer.nextDouble();
            suma_estatura = suma_estatura + estatura[i];

        }
        for (int i = 0; i < 10; i++) {
            if (peso [i] > peso_mayor) {
                peso_mayor = peso [i];
                pos_mayor_peso= i;
            }
        }
        double peso_menor = peso [0];
        for (int i = 0; i < 10; i++) {
            
            if (peso [i] < peso_menor){
                peso_menor = peso [i];
                pos_menor_peso = i;
            }            
        }
        
        for (int i = 0; i < 10; i++) {
            if (estatura [i] > estatura_mayor) {
                estatura_mayor = estatura [i];
                pos_mayor_estatura= i;
            }            
        }
        double estatura_menor = estatura [0];        
        for (int i = 0; i < 10; i++) {
            if (estatura [i] < estatura_menor){
                estatura_menor = estatura [i];
                pos_menor_estatura = i;
            }               
        }

        prom_peso = (suma_peso / 10);        
        prom_estatura = (suma_estatura / 10);
        
        
        nombre_peso_mayor = nombre [pos_mayor_peso];
        nombre_peso_menor = nombre[pos_menor_peso];
        nombre_estatura_mayor = nombre [pos_mayor_estatura];
        nombre_estatura_menor = nombre[pos_menor_estatura];
        
        
        

        //despliega datos
        
        System.out.println("\t\tNombre\t\t\tPeso\t\t\tEstatura");
        for (int i = 0; i < 10; i++) {
        System.out.println("\t\t"+nombre[i]+"\t\t\t"+peso[i]+"\t\t\t"+estatura[i]);
        }
        
        System.out.println("La persona con la mayor estatura es "+nombre_estatura_mayor);
        System.out.println("La persona con la menor estatura es "+nombre_estatura_menor);
        System.out.println("La persona con el mayor peso es "+nombre_peso_mayor);
        System.out.println("La persona con el menor peso es "+nombre_peso_menor);        
        System.out.println("El promedio de estatura es de "+prom_estatura);
        System.out.println("El promedio de peso es de "+prom_peso);
    }
}
