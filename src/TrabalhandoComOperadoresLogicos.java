import java.util.Scanner;

public class TrabalhandoComOperadoresLogicos {

    public static void main(String[] args) {
        // &&

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");

        int idade = scanner.nextInt();

        if(idade >= 16 && idade <= 17 && idade > 60) {
            System.out.println("voto facultativo");
        }  else if (idade >= 18 && idade <= 60) {
            System.out.println("Voto obrigatório");
        } else if(idade > 60) {
        }
    }
}
