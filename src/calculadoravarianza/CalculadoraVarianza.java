package CalculadoraVarianza;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


public class CalculadoraVarianza {

    //Método calulcar Media
    public static double media(ArrayList<Double> valores){
        double store = 0;
        for (Double value : valores) {
            store += value;
        }
                
        return (store/valores.size());
    }
    //Método Calcular Varianza
    public static double varianza(ArrayList<Double> valores, double media){
        double store = 0;
        for(Double value : valores){
            store += ((value-media)*(value-media));
        }
        
        return (store/valores.size());
    }
    //Método Calcular Derivación Estándar
    public static double derviacionEstandar(double varianza){        
        return (Math.sqrt(varianza));
    }
    
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner (System.in);

        double varianza;
        int i, count=0;
        ArrayList<Double> valores = new ArrayList<Double>();
        
        System.out.println("Ingrese la cantidad de valores a ingresar: ");
        i = Integer.parseInt(entradaEscaner.nextLine());
        
        System.out.println("\nIngresa un valor: ");
        while(count<i){
                
            valores.add(Double.parseDouble(entradaEscaner.nextLine()));            
            count++;
        }
                
        //CALCULAR VARIANZA
        varianza = varianza(valores, media(valores));
        System.out.println("\nLa varianza es: " + varianza);
        
        //CALCULAR DESVIACIÓN ESTÁNDAR
        System.out.println("La desviación Estándar es: " + derviacionEstandar(varianza));
        
    }
    
}
