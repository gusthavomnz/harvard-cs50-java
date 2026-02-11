import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorTroco;

        do {
            System.out.println("Digite o valor do troco");
            valorTroco = sc.nextDouble();
        } while (valorTroco < 0);


        int centavos = (int) (valorTroco * 100);

        int moeda50 = centavos / 50;
        centavos %= 50;

        int moeda25 = centavos / 25;
        centavos %= 25;

        int moeda10 = centavos / 10;
        centavos %= 10;

        int moeda5 = centavos / 5;
        centavos %= 5;

        int moead1 = centavos;

        int soma_moedas = moeda5 + moeda10 + moeda25 + moeda50 + moead1;

        System.out.println(soma_moedas);

        {

        }
    }
}