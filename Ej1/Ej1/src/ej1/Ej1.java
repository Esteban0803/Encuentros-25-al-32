//Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud. 
//Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. 
//El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
//Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
//Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase,
//por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase,
//por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
//Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no
package ej1;
import Entidad.Cadena;
import Service.CadenaServicio;
import java.util.Scanner;

public class Ej1 {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        CadenaServicio  s1 = new CadenaServicio();
        Cadena frase = new Cadena();
        System.out.println("Ingrese una frase");
        frase.setFrase(leer.next());
        String fra = frase.getFrase();
        int num= frase.getLongitud();
        System.out.println("-------------------");
        System.out.println("Elija una opcion, porfavor");
        System.out.println("1. Buscar vocales");
        System.out.println("2. Dar vuelta la frase");
        System.out.println("3. Veces que se repite una vocal");
        System.out.println("4. Comparar la longitud");
        System.out.println("5. Unir frases");
        System.out.println("6. Reemplazar la letra 'A'");
        System.out.println("7. Buscar letra");
        System.out.println("8. Salir");
        System.out.println("-------------------");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1:
                s1.mostrarVocales(fra, num);
                break;
            case 2:
                 s1.invertirFrase(fra, num);
                break;
            case 3:
                s1.vecesRepetido(fra);
                break;
            case 4:
                s1.compararLong(fra, fra);
                break;
            case 5:
                s1.unirFrases(fra, fra);
                break;
            case 6:
                s1.reemplazar(fra);
                break;
            case 7:
                s1.contiene(fra, fra);
                break;
            default:
                break;
        }
    }  
}
