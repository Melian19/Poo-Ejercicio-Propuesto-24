import java.util.Scanner;

public class PooEj24 {
    public static void main(String[] args) {
        System.out.println("Ingrese el peso de la primera esfera:");
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        System.out.println("Ingrese el peso de la segunda esfera:");
        double b = entrada.nextDouble();
        System.out.println("Ingrese el peso de la tercera esfera:");
        double c = entrada.nextDouble();
        entrada.close();    

        if ((a>b)&&(a>c)){
            System.out.println("La primera esfera es la que tiene un mayor peso.");
        }else if((b>a)&&(b>c)){
            System.out.println("La segunda esfera es la que tiene un mayor peso.");
        }else if((c>a)&&(c>b)){
            System.out.println("La tercera esfera es la que tiene un mayor peso.");
        }
    }
}