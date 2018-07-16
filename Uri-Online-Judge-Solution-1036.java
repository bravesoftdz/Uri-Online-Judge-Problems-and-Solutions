import static java.lang.System.exit;
import java.util.Scanner;
import java.text.DecimalFormat;

// problem number: 1036
// problem title: Fórmula de Bhaskara
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1036

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        double A, B, C, DELTA, R1, R2;

        // data entry:
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        // data processing:
        DELTA = (Math.pow(B, 2)) - (4 * A * C);

        if ((DELTA < 0) || (A == 0)) {
            System.out.print("Impossivel calcular\n");
            exit(0);
        }

        R1 = ((-B) + Math.sqrt(DELTA)) / (2 * A);
        R2 = ((-B) - Math.sqrt(DELTA)) / (2 * A);

        // data output:
        DecimalFormat formato = new DecimalFormat("0.00000");
        System.out.print("R1 = " + formato.format(R1) + "\n");
        System.out.print("R2 = " + formato.format(R2) + "\n");

    }

}