import java.util.Scanner;

public class valida{
    public static void saludo(){
        System.out.println("Hola mundo");
    }

    public static boolean strvacio(String dato){
        if(dato==""){
            return true;
        }
        else{
            return false;
        }
    }

    public static String leeString(){
        Scanner lector = new Scanner(System.in);
        String dato;
        do{
            dato = lector.nextLine();
        }while(valida.strvacio(dato)==true);
        return dato;
    }
    //validar los numeros
    public static boolean numPosit(String dato){//valida que sea entero
        int num = 0;
        try{
            num = Integer.parseInt(dato);
            if(num>0){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception error){
            System.out.println(error.getMessage());
            return false;
        }
}

public static boolean numNeg(String dato){//valida que sea entero
    int num = 0;
    try{
        num = Integer.parseInt(dato);
        if(num<0){
            return true;
        }
        else{
            return false;
        }
    }
    catch(Exception error){
        System.out.println(error.getMessage());
        return false;
    }
}

public static boolean num(String dato){//valida que sea entero
    int num = 0;
    try{
        num = Integer.parseInt(dato);
        return true;
    }
    catch(Exception error){
       //System.out.println(error.getMessage());
        return false;
    }
}

public static boolean rango(int num, int liminf, int limsup){
    if(num>=liminf && num<=limsup){
        return true;
    }
    else{
        return false;
    }
}
//no contempla los espacios en blanco
//para espacio en blanco "[a-zA-Z ]"
    public static boolean onlyStr(String dato){
        if(dato.matches("[a-zA-Z]+")){
            return true;
        }
        else{
            return false;
        }
    }
}