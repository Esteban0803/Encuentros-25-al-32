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
package Service;
import java.util.Scanner;

public class CadenaServicio {
    public static Scanner leer = new Scanner(System.in);
      public int mostrarVocales(String frase1, int Long){
        int Vocales = 0;
        char let;
        for (int i = 0; i < Long; i++) {
            let = Character.toLowerCase(frase1.charAt(i));//se convierte en minuscula antes de comparar
            if (let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u') {
                Vocales++;
            }
        }
          System.out.println("La frase tiene un total de "+Vocales+" vocales");
        return Vocales;
    }
    public String invertirFrase(String frase1, int Long){
        String fraseInv = "";
        for(int i = Long - 1; i >= 0; i--){
            fraseInv += String.valueOf(frase1.charAt(i));
        }
        System.out.println("La frase queda asi["+fraseInv+"]");
        return fraseInv;
    }
    public int vecesRepetido(String frase1) {
        System.out.println("Ingrese el caracter a buscar:");
        char caracter = leer.next().charAt(0);
        int cantCaracter = 0;
        for (int i = 0; i < frase1.length(); i++) {
            char let = frase1.charAt(i);
            if (let == caracter) {
                cantCaracter++;
            }
        }
        System.out.println("Se encontro un total "+cantCaracter+" de veces");
        return cantCaracter;
    }
    public String compararLong(String frase1, String fraseN){
        System.out.println("Ingrese una nueva frase");
        fraseN = leer.next();
        int longF1 = frase1.length();
        int longF2 = fraseN.length();
        if (longF1 == longF2){
            System.out.println("La frases son igual de largas");
        }else if (longF1 > longF2){
            System.out.println("La frase uno es mas larga que la frase dos");        
        }else{
            System.out.println("La frase dos es mas larga que la frase uno");
        }
        return fraseN;
    }
    public String unirFrases(String frase1, String fraseN){
        System.out.println("Ingrese una nueva frase");
        fraseN = leer.next();
        System.out.println(frase1.concat(fraseN));
        return fraseN;
    }
    public String reemplazar(String frase1) {
        String letra = "";
        String comp;
        String result = " ";
        System.out.println("Ingrese un caracter");
        letra = leer.next();
        for (int i = 0; i<frase1.length();i++){
            comp = String.valueOf(frase1.charAt(i));
            if(comp.equals("a")){
                result+=letra;
            }else{
                result += frase1.charAt(i);
            }
        }
        System.out.println("La frase quedaria asi " + result);
        return result;
    }
    public boolean contiene(String frase1, String let) {
        System.out.println("Que letra desea buscar");
        let = leer.next();
        boolean valor = true;
        int buscador = frase1.indexOf(let);
        if (buscador != -1){
            System.out.println("Se encontro la letra");
            valor = true;
        }else{
            System.out.println("No se encontro la letra");
            valor = false;
        }
        return valor;
    }
}

