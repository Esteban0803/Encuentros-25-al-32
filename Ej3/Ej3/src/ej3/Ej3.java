//Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
//Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
//Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
//Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
//Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
//Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
//En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
package ej3;
import Service.ArregloServ;
import java.util.Scanner;

public class Ej3 {
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        double numA[] = new double[50];
        double numB[] = new double[20];
        ArregloServ s1 = new ArregloServ();
        s1.iniciarA(numA);
        s1.iniciarB(numA, numB);
        
        s1.mostrarA(numA);
        System.out.println("----------------------------");
        s1.ordenarA(numA);
        System.out.println("----------------------------");
        s1.mostrarB(numB);
        
    }
}
