import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        var agencia = scanner.next();
        System.out.println("Por favor, digite o número da Conta !");
        var numero = scanner.nextInt();
        System.out.println("Por favor, digite seu Nome!");
        var nomeCliente = scanner.next();
        System.out.println("Por favor, digite o Saldo que gostaria de ter em Conta!");
        var saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s conta %s e seu saldo %s já está disponível para saque", nomeCliente, agencia, numero, saldo);


    }

}