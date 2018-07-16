import java.util.Scanner;

// problem number: 1007
// problem title: Diferença
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1007

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        int A, B, C, D, DIFERENCA;

        // data entry:
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        // data processing:
        DIFERENCA = ((A * B) - (C * D));

        // data output:
        System.out.print("DIFERENCA = " + DIFERENCA + "\n");

    }

}
