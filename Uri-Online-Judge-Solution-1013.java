import java.util.Scanner;

// problem number: 1013
// problem title: O Maior
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1013

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        int a, b, c, maior = 0;

        // data entry:
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        // data processing:
        if ((a > b) && (a > c))
            maior = a;
        else if ((b > a) && (b > c))
            maior = b;
        else if ((c > a) && (c > b))
            maior = c;

        // data output:
        System.out.print(maior + " eh o maior\n");

    }

}