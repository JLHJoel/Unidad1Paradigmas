//Lozano Hernandez Joel
import java.util.Scanner;
import java.time.LocalDate;

public class ejercicio4{

public static void main (String[] args){

    Scanner lector = new Scanner(System.in);
    System.out.println("Ejercicio 4 calculo de los dias vividos");
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
    diahoy = fecha_actual.getDayOfMonth();

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

    //Calculo de dias vividos
    int dias=0;
    int auxdias=0;
    dias = edad * 365;

    if(mesnac<meshoy)
    {
        auxdias = (meshoy - mesnac) * 30;
    }
    else{
        if(mesnac==meshoy && dianac>diahoy)
        {
            auxdias+= dianac - diahoy;
        }
    }
    if(dianac<diahoy)
    {
        auxdias+= diahoy-dianac;
    }
    dias += auxdias;
    System.out.println("Los dias vividos son: " + dias);



}
}