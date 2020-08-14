package src;


import java.util.Scanner;

public class TrabalhandoComOperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o operador: " +
                "para soma use + " +
                "para subtração use - " +
                "para multiplicação use * " +
                "para divisão use /");
        String operador = scanner.nextLine();

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();


        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if(operador.equals("+")) {
            int soma = numero1 + numero2;
            System.out.println(soma);
        }

        scanner.close();

//
//        String nome = "Miria ";
//        String sobrenome = "Bernardes";
//
//        String nomeCompleto = nome + sobrenome;
//
//        System.out.println(nomeCompleto);

    }
}
