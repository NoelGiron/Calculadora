import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    //escaner general
    static Scanner entradaTeclado = new Scanner(System.in);
    //variables para las operaciones Aritmeticas
    static int numero1, numero2;
    static double resultado;
    //variables para las operaciones Trigonometricas
    static double angulo;
    static int iteraciones;
    //variables para las operaciones Calculo
    static int n;
    static String cadena;
    static double[][] Matriz;
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
                Calculo();
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
                numero1 = entradaTeclado.nextInt();
                System.out.println("ingrese el segundo numero");
                numero2 = entradaTeclado.nextInt();
                resultado = numero1 + numero2;
                System.out.println(numero1 + "+" + numero2 + "=" + resultado);
                Aritmetica();
                break;
            case 2:
                System.out.println("ingrese el primer numero");
                numero1 = entradaTeclado.nextInt();
                System.out.println("ingrese el segundo numero");
                numero2 = entradaTeclado.nextInt();
                resultado = numero1 - numero2;
                System.out.println(numero1 + "-" + numero2 + "=" + resultado);
                Aritmetica();
                break;
            case 3:
                System.out.println("ingrese el primer numero");
                numero1 = entradaTeclado.nextInt();
                System.out.println("ingrese el segundo numero");
                numero2 = entradaTeclado.nextInt();
                resultado = numero1 * numero2;
                System.out.println(numero1 + "*" + numero2 + "=" + resultado);
                Aritmetica();
                break;
            case 4:
                System.out.println("ingrese el primer numero");
                numero1 = entradaTeclado.nextInt();
                System.out.println("ingrese el segundo numero");
                numero2 = entradaTeclado.nextInt();
                while (numero2 == 0) {
                    System.out.println("el segundo numero no puede ser 0 vuelva a ingresar");
                    numero2 = entradaTeclado.nextInt();
                }
                resultado = (double) numero1 / numero2;
                System.out.println(numero1 + "/" + numero2 + "=" + resultado);
                Aritmetica();
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
                angulo = entradaTeclado.nextDouble();
                System.out.println("Ingrese el numero de iteraciones");
                iteraciones = entradaTeclado.nextInt();
                System.out.println("Sen(" + angulo + ")= " + Seno(angulo,iteraciones));
                Trigonometria();
                break;
            case 2:
                System.out.println("Ingrese el angulo");
                angulo = entradaTeclado.nextDouble();
                System.out.println("Ingrese el numero de iteraciones");
                iteraciones = entradaTeclado.nextInt();
                System.out.println("Cos(" + angulo + ")= " + Coseno(angulo,iteraciones));
                Trigonometria();
                break;
            case 3:
                System.out.println("Ingrese el angulo");
                angulo = entradaTeclado.nextDouble();
                System.out.println("Ingrese el numero de iteraciones");
                iteraciones = entradaTeclado.nextInt();
                System.out.println("Tan(" + angulo + ")= " + Seno(angulo,iteraciones)/Coseno(angulo,iteraciones));
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
                Estadistica();
                break;
            case 4:
                menuInicio();
                break;
            default:
                Estadistica();
        }
    }
    static void Calculo(){
        System.out.println("Calculo");
        int opcion = leerNumero("Seleccione una opcion \n 1)Resolver un sistema de ecuaciones \n 2)Regresar");
        switch(opcion){
            case 1:
                System.out.println("Ingrese el tama??o del sistema a resovler");
                n = entradaTeclado.nextInt();
                entradaTeclado.nextLine();
                Matriz = new double[n][n+1];
                for (int i = 0; i < n; i++) {
                    System.out.println("ingrese una cadena de caracteres separados por una coma (,)");
                    cadena = entradaTeclado.nextLine();
                    String[] cadenaSplit = cadena.split(",");
                    for (int j = 0; j < Matriz[i].length; j++) {
                        Matriz[i][j] = Double.parseDouble(cadenaSplit[j]);
                    }    
                }    
                impresionMatriz(Gauss(Matriz));
                Calculo();
                break;
            case 2:
                menuInicio();
                break;
            default:
                Calculo();
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
        double sumatoria = 0;
        System.out.println("ingrese numeros separados por coma (,)");
        cadena = entradaTeclado.next();
        String[] cadenaNumero = cadena.split(","); 
        for (int i = 0; i < cadenaNumero.length; i++) {
            sumatoria += 1/Double.parseDouble(cadenaNumero[i]);
        }  
        return cadenaNumero.length/sumatoria;
    }
    static double varianza(String cadena){
        double sumatoria = 0;
        double contador = 0;
        System.out.println("ingrese numeros separados por coma (,)");
        cadena = entradaTeclado.next();
        String[] cadenaNumero = cadena.split(","); 
        for (int i = 0; i < cadenaNumero.length; i++) {
            contador += Integer.parseInt(cadenaNumero[i]);
        }
        double media = contador/cadenaNumero.length;
        for (int i = 0; i < cadenaNumero.length; i++) {
            sumatoria += (Math.pow((Double.parseDouble(cadenaNumero[i])-media),2));
        }
        double varianza = sumatoria/cadenaNumero.length;
        return varianza;
    }
    static double[][] Gauss(double[][] Matriz){
        double[][] vMatriz = Matriz;
        double vNumero;
        for (int i = 0; i <= vMatriz.length-1; i++) {
            vNumero = vMatriz[i][i];
            for (int j = 0; j <= vMatriz[0].length-1; j++) {
                vMatriz[i][j]= vMatriz[i][j]/vNumero;       
            }            
            if (i <= vMatriz.length-2) {
                for (int j = i+1; j <= vMatriz.length-1; j++) {
                    vNumero = vMatriz[j][i];
                    for (int k = 0; k <= vMatriz[0].length-1; k++) {
                        vMatriz[j][k] = (vMatriz[j][k]-(vNumero*vMatriz[i][k]));
                    }
                }
            }
        }
        return vMatriz;
    }
    static void impresionMatriz(double[][] Matriz){
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j <= Matriz.length; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println("");
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