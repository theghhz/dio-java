import java.util.Scanner;
import java.util.*;
import java.io.*;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agência da conta: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o saldo atual da conta: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+titular+", obrigado por criar uma conta no nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");

        scanner.close();
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

    }
}
