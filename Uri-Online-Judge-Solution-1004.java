import java.util.Scanner;

// problem number: 1004
// problem title: Produto Simples
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1004

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        int v1, v2, PROD;

        // data entry:
        v1 = input.nextInt();
        v2 = input.nextInt();

        // data processing:
        PROD = v1 * v2;

        // data output:    
        System.out.print("PROD = " + PROD + "\n");

    }

}