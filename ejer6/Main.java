//Lozano Hernandez Joel
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 6 Validaciones");
        String nombre, paterno, materno;
        String mnac, dnac;
        do{
            System.out.println("Nombre: ");
            nombre = lector.nextLine();
        }while(valida.strvacio(nombre));
        do{
            System.out.println("Paterno: ");
            paterno = lector.nextLine();
        }while(valida.strvacio(paterno)!=false);

        do{
        System.out.println("Materno: ");
        materno = valida.leeString();
        }while(valida.strvacio(materno)!=false);   
        
        do{
        System.out.println("Dia: ");
        dnac = valida.leeString();
        }while(valida.numPosit(dnac)==false ||
        valida.rango(Integer.parseInt(dnac),1,31) == false);

        do{
            System.out.println("Mes de nacimiento: ");
            mnac = lector.nextLine();
        }while(valida.numPosit(mnac)==false ||
        valida.rango(Integer.parseInt(mnac), 1, 12) == false);

        mnac = (mnac.length()==1) ? "0" + mnac : mnac; 
        if(mnac.length()==1){
            mnac = "0" + mnac;
        }

        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido paterno: " + paterno);
        System.out.println("El apellido materno: " + materno);
        System.out.println("El mes de nacimiento: " + mnac);
        System.out.println("El dia de nacimiento: " + dnac);
        //valida.saludo();

    }
}