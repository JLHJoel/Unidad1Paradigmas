//Lozano Hernandez Joel
import java.util.Scanner;

public class ejercicio2{

public static void main (String[] args){

    Scanner lector = new Scanner(System.in);
    
    System.out.println("Ejercicio 2 manejo de strings");
    String palabra;
    System.out.println("Escribe una palabra ");
    palabra = lector.nextLine();
    
    char[] chars = palabra.toCharArray(); 
    int cant = chars.length;
    int cont = 0;
    
    for(int i=0; i<cant; i++){
        if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u')
            cont++;
    }
    System.out.println("Total de vocales " + cont);
}
}