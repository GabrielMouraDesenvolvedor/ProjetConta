package Conta;

import java.util.Scanner;

public class Tela {

    public static void main(String[] args) {
        System.out.println("*************MENU*************");
        System.out.println("Escolha uma das opções");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Finalizar");

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int op = sc.nextInt();

        if (op == 1) {
            // Criar conta
            Conta conta = new Conta();
            System.out.println("Digite seu nome");
            conta.nome = sc1.nextLine();
            conta.saldo = 0.0;
            conta.limite = 1000.0;

        } else if (op == 2) {
            System.out.println("Finalizado");
        } else {
            System.out.println("Escolha inválida!");
        }
    }
}
