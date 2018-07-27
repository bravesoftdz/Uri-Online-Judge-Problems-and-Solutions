import static java.lang.System.exit;
import java.util.Scanner;

// problem number: 1045
// problem title: Tipos de Triângulos
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1045

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        double A, B, C, aux;

        // data entry:
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        // determines the largest of the values:
        if ((B > A) && (B > C)) {
            aux = A;
            A = B;
            B = aux;
        } else if ((C > A) && (C > B)) {
            aux = A;
            A = C;
            C = aux;
        }

        // determines the second largest of the values
        if (C > B) {
            aux = B;
            B = C;
            C = aux;
        }

        // determining the type of triangle and data output:
        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
            exit(0);
        }

        if (Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if ((A == B) && (B == C) && (C == A)) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if ((A == B) || (B == C) || (C == A)) {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }

}