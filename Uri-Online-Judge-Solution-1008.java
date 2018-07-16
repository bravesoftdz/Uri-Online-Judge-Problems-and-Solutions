import java.util.Scanner;
import java.text.DecimalFormat;

// problem number: 1008
// problem title: Salário
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1008

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        int codigo, num_horas;
        double val_hora, val_salario;

        // data entry:
        codigo = input.nextInt();
        num_horas = input.nextInt();
        val_hora = input.nextDouble();

        // data processing:
        val_salario = num_horas * val_hora;

        // data output:
        DecimalFormat formato = new DecimalFormat("0.00");
        System.out.print("NUMBER = " + codigo + "\n");
        System.out.print("SALARY = U$ " + formato.format(val_salario) + "\n");

    }

}