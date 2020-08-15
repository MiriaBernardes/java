package src.contaCorente;

import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ag = 12345;
        int cc = 32145;
        int password = 1234;
        float saldo = 2000;
        boolean ehValido = false;
        boolean senhaEhValida = false;
        int cont = 0;


        while(ehValido == false) {
            System.out.println("Digite sua agencia: ");
            int agencia = scanner.nextInt();

            System.out.println("Digite sua conta: ");
            int conta = scanner.nextInt();

            if (agencia == ag && conta == cc) {
                ehValido = true;
            }
        }

        while(cont < 3) {
            System.out.println("Digite sua senha: ");
            int senha = scanner.nextInt();

            if (senha == password) {
                senhaEhValida = true;
                break;
            }
            cont++;

        }

        if (senhaEhValida == true) {
            System.out.println("Acesso permitido.");
        }
    }
}
