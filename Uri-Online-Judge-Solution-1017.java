import java.util.Scanner;
import java.text.DecimalFormat;

// problem number: 1017
// problem title: Gasto de Combustível
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1017

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        int tempo;
        double gasto_auto, vel_media, dist_perc, qtd_litros;

        // data entry:
        gasto_auto = 12;
        tempo = input.nextInt();
        vel_media = input.nextDouble();

        // data processing:
        dist_perc = vel_media * tempo;
        qtd_litros = dist_perc / gasto_auto;

        // data output:
        DecimalFormat formato = new DecimalFormat("0.000");
        System.out.print(formato.format(qtd_litros) + "\n");

    }

}