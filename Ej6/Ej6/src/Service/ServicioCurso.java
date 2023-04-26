//Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso. 
//Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, 
//turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 
//(cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
//Un constructor por defecto.
//Un constructor con todos los atributos como parámetro.
//
//Métodos getters y setters de cada atributo.
//
//Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
//Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada
//repetición que se ingrese el nombre de cada alumno.
//
//Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después 
//se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() 
//para asignarle valor al atributo alumnos
//
//Método calcularGananciaSemanal(): este método se encarga 
//de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar 
//la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
package Service;
import Entidad.Curso;
import java.util.Scanner;

public class ServicioCurso {
    public static Scanner leer = new Scanner (System.in).useDelimiter("\n");
    Curso c1 = new Curso();
    public String [] cargarAlumnos(){
        String [] alumnos = new String [6];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los nombres de sus alumnos " + (i+1));
            alumnos[i]=leer.next();
        }
        return alumnos;
    }
    public Curso crearCurso(String[] alumnos){
        System.out.println("A que curso asisten?");
        c1.setNombreCurso(leer.next());
        System.out.println("Cuantas horas cursan al dia?");
        c1.setHorasPorDias(leer.nextInt());
        System.out.println("Cuantos dias vienen por semana?");
        c1.setDiasPorSemana(leer.nextInt());
        System.out.println("Asisten al turno manana o tarde?");
        String turno = leer.next();
            while (!(turno.equals("manana") || turno.equals("tarde"))){
            System.out.println("Ese horario no es valido");
              turno= leer.next();
        }
        System.out.println("El precio por hora es de:");
        c1.setPrecioPorHora(leer.nextFloat());
        c1.setAlumnos(alumnos);
        return c1;
    }
        public void mostrar (String[] alumnos){
        System.out.println("Nombre deL curso: " + c1.getNombreCurso());
        System.out.println("Horas al dia: " + c1.getHorasPorDias());
        System.out.println("Dias a la semana " + c1.getDiasPorSemana());
        System.out.println("Turno: " + c1.getTurno());
        System.out.println("Precio por hora: $" + c1.getPrecioPorHora());
        System.out.println("Los alumnos inscriptos son: ");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + alumnos[i]);
        }
    }

    public float calcularGananciaSemanal() {
        int hs = c1.getHorasPorDias();
        float pr = c1.getPrecioPorHora();
        int dia = c1.getDiasPorSemana();
        float total = hs * pr * dia * 5;
        System.out.println("La ganancia total es:" + total);
        return total;
    }
}
