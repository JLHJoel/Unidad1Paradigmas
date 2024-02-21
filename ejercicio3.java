//Lozano Hernandez Joel
import java.util.Scanner;
import java.time.LocalDate;

public class ejercicio3{

public static void main (String[] args){

    Scanner lector = new Scanner(System.in);
    System.out.println("Ejercicio 3 calculo de la edad");
    LocalDate fecha_actual = LocalDate.now();
    int anionac, aniohoy, mesnac, meshoy, dianac, diahoy, edad;
    System.out.println("Anio de nacimiento: ");
    anionac = lector.nextInt();
    System.out.println("Mes de nacimiento: ");
    mesnac = lector.nextInt();
    System.out.println("Dia de nacimiento: ");
    dianac = lector.nextInt();
    lector.nextLine();

    aniohoy = fecha_actual.getYear();
    meshoy = fecha_actual.getMonthValue();

    System.out.println("El anio actual es: " + aniohoy);
    System.out.println("El mes actual es: " + meshoy);

    
    if(meshoy>=mesnac)
    {
        edad = aniohoy - anionac;
        System.out.println("Su edad actual es: " + edad);
    }
    else{
        edad = aniohoy - anionac - 1;
        System.out.println("Su edad actual es: " + edad);
    }

    

}
}