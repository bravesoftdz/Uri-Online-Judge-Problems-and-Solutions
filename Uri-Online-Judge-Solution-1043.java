import java.util.Scanner;
import java.text.DecimalFormat;

// problem number: 1043
// problem title: Triângulo
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1043

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // variable declaration:
        double A, B, C, medida;
        boolean status;

        // data entry:
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        // data processing:
        status = ((A < (B + C)) && (B < (A + C)) && (C < (A + B)));

        // data output:
        DecimalFormat formato = new DecimalFormat("0.0");

        if (status) {
            medida = (A + B + C);
            System.out.println("Perimetro = " + formato.format(medida));
        } else {
            medida = ((A + B) * C) / 2;
            System.out.println("Area = " + formato.format(medida));
        }

    }

}