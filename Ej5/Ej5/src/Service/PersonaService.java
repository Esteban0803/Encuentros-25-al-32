//Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
//constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
//Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
//Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
//Método mostrarPersona que muestra la información de la persona deseada.
package Service;
import Entidad.Persona;
import static Service.PersonaService.leer;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PersonaService {

    Persona p1 = new Persona();
    public static Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Cual es su nombre?");
        String nombre = leer.next();
        p1.setNombre(nombre);
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt() - 1;
        System.out.println("Año");
        int anio = leer.nextInt() - 1900;
        Date nacimiento = new Date(anio, mes, dia);
        p1.setFechaN(nacimiento);
        return p1;
    }

    public int calcularEdad(Persona p1) {
        Calendar fechaA = Calendar.getInstance();
        Calendar fechaN = new GregorianCalendar();
        fechaN.setTime(p1.getFechaN());
        int anioActual = fechaA.get(Calendar.YEAR);
        int anioNacimiento = fechaN.get(Calendar.YEAR);
        int edad = anioActual - anioNacimiento;
        int mesActual = fechaA.get(Calendar.MONTH);
        int mesNacimiento = fechaN.get(Calendar.MONTH);
        if (mesNacimiento > mesActual) {
            edad--;
        } else if (mesActual == mesNacimiento) {
            int diaActual = fechaA.get(Calendar.DAY_OF_MONTH);
            int diaNacimiento = fechaN.get(Calendar.DAY_OF_MONTH);
            if (diaNacimiento > diaActual) {
                edad--;
            }
        }
        return edad;
    }

    public boolean menorEdad(Persona p1) {
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNacimiento = new GregorianCalendar();
        fechaNacimiento.setTime(p1.getFechaN());
        int anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
        int edad = fechaActual.get(Calendar.YEAR) - anioNacimiento;
        if (edad < 18) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarPersona(Persona p1) {
        System.out.println("Desea mostrar a la persona?");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Su nombre es: " + p1.getNombre());
            System.out.println("Su edad es: " + calcularEdad(p1));
            System.out.println("Es mayor de edad? " + !menorEdad(p1));
        } else if (respuesta.equalsIgnoreCase("no")) {
            System.out.println("No se mostrara a la persona");
        } else {
            System.out.println("Respuesta invalida");
        }
    }
}

