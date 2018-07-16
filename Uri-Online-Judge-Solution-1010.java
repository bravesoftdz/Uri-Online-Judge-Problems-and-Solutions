import java.util.Scanner;
import java.text.DecimalFormat;

// problem number: 1010
// problem title: Cálculo Simples
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1010

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        int codigo[] = new int[2];
        int num_pecas[] = new int[2];
        double val_unid[] = new double[2];
        double val_total;
        
        // data entry:
        codigo[0] = input.nextInt();
        num_pecas[0] = input.nextInt();
        val_unid[0] = input.nextDouble();
        
        codigo[1] = input.nextInt();
        num_pecas[1] = input.nextInt();
        val_unid[1] = input.nextDouble();

        // data processing:
        val_total = ((num_pecas[0] * val_unid[0]) + (num_pecas[1] * val_unid[1]));

        // data output:
        DecimalFormat formato = new DecimalFormat("0.00");
        System.out.print("VALOR A PAGAR: R$ " + formato.format(val_total) + "\n");

    }

}