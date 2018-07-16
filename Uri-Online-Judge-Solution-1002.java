import java.util.Scanner;
import java.text.DecimalFormat;

// problem number: 1002
// problem title: Área do Círculo
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1002

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        double n, raio, area;

        // data entry:
        n = 3.14159;
        raio = input.nextDouble();
        
        // data processing:
        area = n * (raio * raio);
                
        // data output:
        DecimalFormat formato = new DecimalFormat("0.0000");      
        System.out.print("A = " + formato.format(area) + "\n");

    }

}
