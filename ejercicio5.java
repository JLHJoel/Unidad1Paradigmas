//Lozano Hernandez Joel
import java.util.Scanner;


public class ejercicio5{

public static void main(String[] args){

    Scanner lector = new Scanner(System.in);
    System.out.println("Ejercicio 5 calculo del rfc");
    String nombre, paterno, materno, rfc, mesnac, dianac, anionac;
    int mesnaci, dianaci;
    
    System.out.println("Anio de nacimiento: ");
    anionac = lector.nextLine();
    
    System.out.println("Mes de nacimiento: ");
    mesnac = lector.nextLine();

    //el mes en 2 posiciones
    if(mesnac.length()==1){
        mesnac = "0" + mesnac;     
    }
    //el mes sea del 1 al 12
    mesnaci = Integer.valueOf(mesnac);
    if(mesnaci<1 || mesnaci>12){
        System.out.println("Mes invalido");
    }
    System.out.println("Dia de nacimiento: ");
    dianac = lector.nextLine();

    //dia en 2 posiciones
    if(dianac.length()==1){
        dianac = "0"+ dianac;
    }
    //dia sea del 1 al 31
    dianaci = Integer.valueOf(dianac);
    if(dianaci<1 || dianaci>31){
        System.out.println("Dias inexistentes");
    }
    
    System.out.println("Nombre: ");
    nombre = lector.nextLine();

    System.out.println("Paterno: ");
    paterno = lector.nextLine();

    System.out.println("Materno: ");
    materno = lector.nextLine();

    
    //calcular los ultimos 3 digitos (homoclave)
    int ult2i;
    String ult1, ult2;
    char ult2c;
    //para el primero que sera una letra, usaremos la primer letra del apellido materno
    ult1 = materno.substring(0,1);
    //para el segundo y tercero que seran numeros, usaremos el codigo ascii de la primera letra del nombre
    ult2 = nombre.substring(0,1);
    //convertimos la primera letra en char para poder calcular el codigo ascii
    ult2c = ult2.charAt(0);
    //creamos una variable entera para guardar el valor ascii calculado y lo guardamos en la variable string
    ult2i = (int) ult2c;
    ult2 = String.valueOf(ult2i);
    

    rfc = paterno.substring(0,2) + materno.substring(0,1) 
    + nombre.substring(0,1) + anionac.substring(2,4) + mesnac + dianac
    + ult1 + ult2.substring(0,2);

    //las letras sean mayusculas
    rfc = rfc.toUpperCase();

    System.out.println("Su rfc: " + rfc);

}
}