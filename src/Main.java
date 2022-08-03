import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    static Scanner entradaTeclado = new Scanner(System.in);
    static int a;
    static int b;
    static double x;
    static int n;
    static double res;
    static double number;
    static String cadena;
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
                Trigonometria();
                break;
            case 3:
                Estadistica();
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
                res = (double) a/b;
                System.out.println(a+ "/" + b + "=" + res);
                break;
            case 5:
                menuInicio();
                break;
            default:
                Aritmetica();
        }    
    }
    static void Trigonometria(){
        System.out.println("Trigonometria");
        int opcion = leerNumero("Seleccione una opcion \n 1)Seno \n 2)Coseno \n 3)Tangente \n 4)Regresar");
        switch(opcion){
            case 1:
                System.out.println("Ingrese el angulo");
                x = entradaTeclado.nextDouble();
                System.out.println("Ingrese el numero de iteraciones");
                n = entradaTeclado.nextInt();
                System.out.println("Sen("+x+")= " + Seno(x,n));
                Trigonometria();
                break;
            case 2:
                System.out.println("Ingrese el angulo");
                x = entradaTeclado.nextDouble();
                System.out.println("Ingrese el numero de iteraciones");
                n = entradaTeclado.nextInt();
                System.out.println("Cos("+x+")= " + Coseno(x,n));
                Trigonometria();
                break;
            case 3:
                System.out.println("Ingrese el angulo");
                x = entradaTeclado.nextDouble();
                System.out.println("Ingrese el numero de iteraciones");
                n = entradaTeclado.nextInt();
                System.out.println("Tan("+x+")= " + Seno(x,n)/Coseno(x,n));
                Trigonometria();
                break;
            case 4:
                menuInicio();
                break;
            default:
                Trigonometria();
        }  
    }
    static void Estadistica(){
        System.out.println("Estadistica");
        int opcion = leerNumero("Seleccione una opcion \n 1)Media \n 2)Varianza \n 3)Desviacion Estandar \n 4)Regresar");
        switch(opcion){
            case 1:
                System.out.println(media(cadena));
                Estadistica();
                break;
            case 2:
                System.out.println(varianza(cadena));
                Estadistica();
                break;
            case 3:
                System.out.println(Math.pow(varianza(cadena), 0.5));  
                Trigonometria();
                break;
            case 4:
                menuInicio();
                break;
            default:
                Estadistica();
        }
    }
    static double Seno(double x, int n){
        double seno, dividendo, divisor, signo;
        seno = 0;
        for (int i = 0; i <= n; i++) {
            dividendo = 1;
            for (int j = 0; j < 2*i+1; j++) {
                dividendo = dividendo * x;
            }
            divisor = 1;
            for (int j = 1; j <= 2*i+1; j++) {
                divisor = divisor * j;
            }
            if (i%2 == 0) {
                signo = 1;
            }else{
                signo = -1;
            }
            seno = seno + (dividendo/divisor)*signo;
        }
        return seno;
    }
    static double Coseno(double x, int n){
        double coseno, dividendo, divisor, signo;
        coseno = 0;
        for (int i = 0; i <= n; i++) {
            dividendo = 1;
            for (int j = 0; j < 2*i; j++) {
                dividendo = dividendo * x;
            }
            divisor = 1;
            for (int j = 1; j <= 2*i; j++) {
                divisor = divisor * j;
            }
            if (i%2 == 0) {
                signo = 1;
            }else{
                signo = -1;
            }
            coseno = coseno + (dividendo/divisor)*signo;
        }
        return coseno;
    }
    static double media(String cadena){
        number = 0;
        System.out.println("ingrese numeros separados por coma (,)");
        cadena = entradaTeclado.next();
        String[] cadenaNumero = cadena.split(","); 
        for (int i = 0; i < cadenaNumero.length; i++) {
            number += Integer.parseInt(cadenaNumero[i]);
        }  
        return number/cadenaNumero.length;
    }
    static double varianza(String cadena){
        double sumatoria = 0;
        number = 0;
        System.out.println("ingrese numeros separados por coma (,)");
        cadena = entradaTeclado.next();
        String[] cadenaNumero = cadena.split(","); 
        for (int i = 0; i < cadenaNumero.length; i++) {
            number += Integer.parseInt(cadenaNumero[i]);
        }
        double media = number/cadenaNumero.length;
        for (int i = 0; i < cadenaNumero.length; i++) {
            sumatoria += (Math.pow((Double.parseDouble(cadenaNumero[i])-media),2));
        }
        double varianza = sumatoria/cadenaNumero.length;
        return varianza;
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