import java.util.Scanner;

// problem number: 1001
// problem title: Extremamente Básico
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1001

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        int a, b, x;

        // data entry:
        a = input.nextInt();
        b = input.nextInt();

        // data processing:
        x = a + b;

        // data output:
        System.out.print("X = " + x + "\n");

    }

}