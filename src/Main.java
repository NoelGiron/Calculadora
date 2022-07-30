import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    static Scanner entradaTeclado = new Scanner(System.in);
    static int a;
    static int b;
    static float res;
    public static void main(String[] args) {
        menuInicio();
    }
    static void menuInicio(){
        System.out.println("Menu");
        int opcion = leerNumero("Seleccione una opcion \n 1)Aritmetica \n 2)Trigonometria \n 3)Estadistica \n 4)Calculo \n 5)Salir");
        switch(opcion){
            case 1:
                Aritmetica();
                break;
            case 2:
                //Trigonometria();
                break;
            case 3:
                //Estadistica();
                break;
            case 4:
                //Calculo();
                break;
            case 5:
                break;
            default:
                menuInicio();
        }
    }
    static void Aritmetica(){
        System.out.println("Aritmetica");
        int opcion = leerNumero("Seleccione una opcion \n 1)Suma \n 2)Resta \n 3)Multiplicaion \n 4)Division \n 5)Regresar");
        switch(opcion){
            case 1:
                System.out.println("ingrese el primer numero");
                a = entradaTeclado.nextInt();
                System.out.println("ingrese el segundo numero");
                b = entradaTeclado.nextInt();
                res = a+b;
                System.out.println(a + "+" + b + "=" + res);
                break;
            case 2:
                System.out.println("ingrese el primer numero");
                a = entradaTeclado.nextInt();
                System.out.println("ingrese el segundo numero");
                b = entradaTeclado.nextInt();
                res = a-b;
                System.out.println(a + "-" + b + "=" + res);
                break;
            case 3:
                System.out.println("ingrese el primer numero");
                a = entradaTeclado.nextInt();
                System.out.println("ingrese el segundo numero");
                b = entradaTeclado.nextInt();
                res = a*b;
                System.out.println(a + "*" + b + "=" + res);
                break;
            case 4:
                System.out.println("ingrese el primer numero");
                a = entradaTeclado.nextInt();
                System.out.println("ingrese el segundo numero");
                b = entradaTeclado.nextInt();
                res = a/b;
                System.out.println(a+ "/" + b + "=" + res);
                break;
            case 5:
                menuInicio();
                break;
            default:
                Aritmetica();
        }
        
    }
    static int leerNumero(String mensaje){
        System.out.println(mensaje);
        try{
            int numero = entradaTeclado.nextInt();
            entradaTeclado.nextLine();
            return numero;
        }catch(InputMismatchException exception){
            System.out.println("Dato no valido");
            entradaTeclado.nextLine();
            return -1;
        }
    }
}
