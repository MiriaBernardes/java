import java.util.Scanner;

public class TrabalhandoComInteiros {

    public static void main(String[] args) {
        System.out.println("Digite uma senha: ");

        Scanner scanner = new Scanner(System.in);
        int senha = scanner.nextInt();

        if(senha == 123) {
            System.out.println("ok, tudo certo");
        }else {
            System.out.println("ops, senha inválida");
        }
    }
}
