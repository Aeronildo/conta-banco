package main;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        System.out.println("Bem vindo, digite o seu nome");
        Scanner scNome = new Scanner(System.in);
        String nome = scNome.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        Scanner scNumeroAgencia = new Scanner(System.in);
        String numeroAgencia = scNumeroAgencia.nextLine();

        System.out.println("Por favor, digite o número da conta !");
        Scanner scNumeroConta = new Scanner(System.in);
        int numeroConta = Integer.parseInt(scNumeroConta.nextLine());

        Scanner scSaldoConta = new Scanner(System.in);
        BigDecimal saldoConta;

        do {
            System.out.println("Por favor, digite o saldo inicial");
            try {
                saldoConta = scSaldoConta.nextBigDecimal();
                break; // Sai do loop se a entrada for válida
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                scSaldoConta.nextLine(); // Limpa o buffer do scanner
            }
        } while (true);

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + ",e seu saldo " + saldoConta + "já está disponível para saque.");
    }
}
