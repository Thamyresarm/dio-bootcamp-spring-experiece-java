// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Digite o numero de casos: ");
        int casos = input.nextInt();
        int cont = 0;
        while (cont < casos) {
           // System.out.println("Digite o primeiro valor: ");
            double a = input.nextDouble();
           // System.out.println("Digite o segundo valor: ");
            double b = input.nextDouble();
           // System.out.println("Digite o terceiro valor: ");
            double c = input.nextDouble();

            System.out.printf("%.1f", ((2.0 * a) + (3.0 * b) + (5.0 * c)) / 10.0);
            System.out.println("");
            cont++;
        }

    }
}