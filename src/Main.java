import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    static Scanner entradaTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Menu");
        int opcion = leerNumero("Seleccione una opcion \n 1)Aritmetica \n 2)Trigonometria \n 3)Estadistica \n 4)Calculo \n 5)Salir");
        
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
