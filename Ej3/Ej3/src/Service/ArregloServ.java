//Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
//Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
//Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
//Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
//Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
//Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
//En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
package Service;

import java.util.Arrays;

public class ArregloServ {
    public void iniciarA(double numA[]){
        for (int i = 0; i < numA.length; i++) {
            numA[i] = Math.random()*10;
        }
    }
    public void mostrarA(double numA[]){
        System.out.println(Arrays.toString(numA));
    }
    public double ordenarA(double numA[]){
        double num = 0;
        for (int i = 0; i < numA.length - 1; i++){
            for (int j = i + 1; j < numA.length; j++) {
                if (numA[i] < numA[j]){
                    num = numA[i];
                    numA[i] = numA[j];
                    numA[j] = num;
                }
            }
        }
        System.out.println(Arrays.toString(numA));
        return num;
    }
    public void iniciarB(double numA[],double numB[]){
                for (int i = 0; i < 10; i++) {
            numB[i] = numA[i];
        }
        for (int i = 10; i < numB.length; i++) {
            numB[i] = 0.5;
        }
    }
    public void mostrarB(double numB[]){
        System.out.println(Arrays.toString(numB));
    }
}
