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
package Service;

public class ServicioDeNumeros {
    public void mostrarValores(double num1, double num2){  
        System.out.println("Este en el numero uno " +num1 +" y este es el numero dos "+ num2);
    }
    public double devolverMayor(double num1, double num2){
        if(num1 > num2){
            System.out.println("El numero uno: "+num1+" es mayor");
            return num1;
        }else{
            System.out.println("El numero dos: "+num2+" es mayor");
            return num2;
        }
    }
    public void calcularPotencia(double num1, double num2){
        num1 = Math.round(num1);
        num2 = Math.round(num2);
        mostrarValores(num1,num2);
        System.out.println("-----------------------");
        double mayor = devolverMayor(num1, num2);
        System.out.println("-----------------------");
        if (num1 == mayor) {
            System.out.println(Math.round(Math.pow(mayor, num2)));
        } else {
            System.out.println(Math.round(Math.pow(mayor, num1)));
        }
    }
    public void calcularRaiz(double num1, double num2){
        num1 = Math.round(num1);
        num2 = Math.round(num2);
        mostrarValores(num1,num2);
        System.out.println("-----------------------");
        double mayor = devolverMayor(num1, num2);
        System.out.println("-----------------------");
        if (num2 == mayor) {
            System.out.println(Math.sqrt(num1));
        } else {
            System.out.println(Math.sqrt(num2));
        }
    }
}
