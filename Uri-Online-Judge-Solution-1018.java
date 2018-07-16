import java.util.Scanner;

// problem number: 1018
// problem title: Cédulas
// available in: https://www.urionlinejudge.com.br/judge/pt/problems/view/1018

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration:
        int valor, aux, i = 0;
        int tipo_nota[] = new int[7];
        int qtd_nota[] = new int[7];

        tipo_nota[0] = 100; // compara notas R$ 100
        tipo_nota[1] = 50;  // compara notas R$ 50
        tipo_nota[2] = 20;  // compara notas R$ 20
        tipo_nota[3] = 10;  // compara notas R$ 10
        tipo_nota[4] = 5;   // compara notas R$ 5
        tipo_nota[5] = 2;   // compara notas R$ 2
        tipo_nota[6] = 1;   // compara notas R$ 1

        qtd_nota[0] = 0; // guarda qtd. notas R$ 100
        qtd_nota[1] = 0; // guarda qtd. notas R$ 50
        qtd_nota[2] = 0; // guarda qtd. notas R$ 20
        qtd_nota[3] = 0; // guarda qtd. notas R$ 10
        qtd_nota[4] = 0; // guarda qtd. notas R$ 5
        qtd_nota[5] = 0; // guarda qtd. notas R$ 2
        qtd_nota[6] = 0; // guarda qtd. notas R$ 1
        
        // data entry:
        valor = input.nextInt();
        aux = valor;

        // data processing:
        while (aux >= 1) {
            while (aux >= tipo_nota[i]) {
                aux = aux - tipo_nota[i];
                qtd_nota[i] = qtd_nota[i] + 1;
            }
            i++;
        }

        // data output:
        System.out.print(valor + "\n");
        System.out.print(qtd_nota[0] + " nota(s) de R$ 100,00\n");
        System.out.print(qtd_nota[1] + " nota(s) de R$ 50,00\n");
        System.out.print(qtd_nota[2] + " nota(s) de R$ 20,00\n");
        System.out.print(qtd_nota[3] + " nota(s) de R$ 10,00\n");
        System.out.print(qtd_nota[4] + " nota(s) de R$ 5,00\n");
        System.out.print(qtd_nota[5] + " nota(s) de R$ 2,00\n");
        System.out.print(qtd_nota[6] + " nota(s) de R$ 1,00\n");

    }

}