import java.util.Scanner;

public class Cashback {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("digite sua idade: ");
        int idade = leitor.nextInt();


        System.out.println("Digite o valor da compra:");
        double valorDeCompra = leitor.nextDouble();

        double cashbeck;

if( idade >= 21 && valorDeCompra < 1000){
    cashbeck = 0.05;
       }else if (idade < 21 && valorDeCompra < 1000 || idade >= 21 && valorDeCompra > 1000){
    cashbeck = 0.07;
       }else {
          cashbeck = 0.1;
       }
double valordacompracashback = valorDeCompra * cashbeck;

System.out.println("Olá " + nome + "o seu cashback é de " + valordacompracashback);
}
}
