//Lozano Hernandez Joel
import java.util.Scanner;

public class ejercicio1{

public static void main (String[] args){
    Scanner lector = new Scanner(System.in);

    System.out.println("Ejercicio 1 encontrar el numero mayor ");

    int num1, num2, num3;
    System.out.println("\nnum1: ");
    num1 = lector.nextInt();
    System.out.println("\nnum2: ");
    num2 = lector.nextInt();
    System.out.println("\nnum3: ");
    num3 = lector.nextInt();

    if (num1>num2 && num1>num3)
        System.out.println("num1 es mayor " + num1);
    else
        if(num2>num1 && num2>num3)
            System.out.println("num2 es mayor " + num2);
        else
            if(num3>num1 && num3>num2)
                System.out.println("num3 es mayor " + num3);
                else
                    if(num1==num2 || num1==num3 || num2==num3)
                        System.out.println("los numeros son iguales");
}
}