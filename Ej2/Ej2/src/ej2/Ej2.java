//Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes
//operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  
//En el constructor vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios, 
//que deberá además implementar los siguientes métodos:
//Método mostrarValores que muestra cuáles son los dos números guardados.
//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
//Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
//Previamente se deben redondear ambos valores.
//Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
package ej2;
import Entidad.ParDeNumeros;
import Service.ServicioDeNumeros;
import java.util.Scanner;

public class Ej2 {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        ServicioDeNumeros s1 = new ServicioDeNumeros();
        ParDeNumeros p1 = new ParDeNumeros();
        double num1 = p1.getNum1();
        double num2 = p1.getNum2();
        System.out.println("-------------------");
        System.out.println("Elija una opcion, porfavor");
        System.out.println("1. Mostrar valor");
        System.out.println("2. Devolver el mayor");
        System.out.println("3. Calcular la potencia");
        System.out.println("4. Calcular la raiz");
        System.out.println("5. Salir");
        System.out.println("-------------------");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1:
                s1.mostrarValores(num1, num2);
                break;
            case 2:
                s1.devolverMayor(num1, num2);
                break;
            case 3:
                s1.calcularPotencia(num1, num2);
                break;
            case 4:
                s1.calcularRaiz(num1, num2);
                break;
            default:
                break;
        }
    } 
}
