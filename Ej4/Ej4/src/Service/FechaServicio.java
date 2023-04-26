//Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
//Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. 
//Ejemplo: Date fechaActual = new  Date();
//El método debe retornar el objeto Date.
//Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
package Service;
import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    public static Scanner leer = new Scanner (System.in);
    Date fechaA = new Date();
    public Date fechaNacimiento(){
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Ano");
        int anio = leer.nextInt() - 1900;
        System.out.println("Mes");
        int mes = leer.nextInt() - 1;
        System.out.println("Dia");
        int dia = leer.nextInt();
        return new Date(anio, mes, dia);
    }
    public void fechaActual() {
        System.out.println(fechaA);
    }
    public int diferencia(Date fecha1) {
          int edad = fecha1.getYear();
          int anio = fechaA.getYear();
          int total = anio - edad;
          System.out.println("La edad es: "+total+" anos");
          return total;
    }
 }
