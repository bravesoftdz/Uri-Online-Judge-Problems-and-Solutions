import java.util.Scanner;
import java.text.DecimalFormat;

// problem number: 1006
// problem title: Média 2
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1006

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        double A, B, C, MEDIA;

        // data entry:
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        // data processing:
        MEDIA = ((A * 0.2) + (B * 0.3) + (C * 0.5));

        // data output:
        DecimalFormat formato = new DecimalFormat("0.0");
        System.out.print("MEDIA = " + formato.format(MEDIA) + "\n");

    }

}
