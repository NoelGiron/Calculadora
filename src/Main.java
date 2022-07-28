import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    Scanner entradaTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    int leerNumero(String mensaje){
        try{
            int numero = entradaTeclado.nextInt();
            entradaTeclado.nextLine();
            return numero;
        }catch(InputMismatchException exception){
            return -1;
        }
    }
}
