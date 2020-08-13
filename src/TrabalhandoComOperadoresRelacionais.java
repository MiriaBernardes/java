import java.util.Scanner;

public class TrabalhandoComOperadoresRelacionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma senha: ");

/*
        operador de atribuição:  =
*/

        String senha = scanner.nextLine();


/*
         maior: >
         diferente: !=
         maior ou igual que: >=
         menor ou igual que: <=
         igualdade:         ==
*/


        if ( senha.length()  < 8) {
            System.out.println("Senha precisa ter no minimo 8 caracteres");
        }
        else {
            System.out.println("Tudo certo");
        }
    }
}
