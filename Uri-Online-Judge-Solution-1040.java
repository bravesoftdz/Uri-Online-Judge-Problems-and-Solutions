import java.util.Scanner;
import java.text.DecimalFormat;

// problem number: 1040
// problem title: Média 3
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1040

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        double N[] = new double[4];
        double media, n_exame, m_final;

        // data entry:
        N[0] = input.nextDouble();
        N[1] = input.nextDouble();
        N[2] = input.nextDouble();
        N[3] = input.nextDouble();

        // data processing:
        media = ((N[0] * 2) + (N[1] * 3) + (N[2] * 4) + (N[3] * 1)) / 10;

        // data output:
        DecimalFormat formato = new DecimalFormat("0.0");
        System.out.print("Media: " + formato.format(media) + "\n");

        if (media >= 7.0) {
            System.out.print("Aluno aprovado.\n");
        } else if (media < 5.0) {
            System.out.print("Aluno reprovado.\n");
        } else {
            System.out.print("Aluno em exame.\n");

            n_exame = input.nextDouble();
            System.out.print("Nota do exame: " + formato.format(n_exame) + "\n");
            m_final = (media + n_exame) / 2;

            if (m_final >= 5.0) {
                System.out.print("Aluno aprovado.\n");
            } else {
                System.out.print("Aluno reprovado.\n");
            }

            System.out.print("Media final: " + formato.format(m_final) + "\n");

        }

    }

}