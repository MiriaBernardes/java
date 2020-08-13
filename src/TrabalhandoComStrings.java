import java.util.Scanner;

public class TrabalhandoComStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma senha: ");

        String senha = scanner.nextLine();

        if ( senha.length()  < 8) {
            System.out.println("Senha precisa ter no minimo 8 caracteres");
        }
        else {
            System.out.println("Tudo certo");
        }

    }
}
