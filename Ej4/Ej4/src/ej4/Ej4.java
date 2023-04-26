//Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
//Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. 
//Ejemplo: Date fechaActual = new  Date();
//El método debe retornar el objeto Date.
//Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
package ej4;
import Service.FechaServicio;
import java.util.Date;
import java.util.Scanner;

public class Ej4 {
    public static Scanner leer = new Scanner (System.in);
    public static void main(String[] args) {
        FechaServicio f1 = new FechaServicio();
        Date fechaNaciemiento = f1.fechaNacimiento();
        System.out.println("--------------------");
        f1.diferencia(fechaNaciemiento);
    }
}
