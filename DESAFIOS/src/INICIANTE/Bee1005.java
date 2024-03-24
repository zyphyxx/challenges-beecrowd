package INICIANTE;

import java.util.Locale;
import java.util.Scanner;

public class Bee1005 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Define o local para usar ponto como separador decimal

        // Leitura das notas A e B
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        // Cálculo da média ponderada
        double media = (A * 3.5 + B * 7.5) / 11;

        // Exibição do resultado com precisão de 5 casas decimais
        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
    }
}
