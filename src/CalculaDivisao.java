import java.util.Scanner;

public class CalculaDivisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();


        if( numero2 != 0 ) {
           int resultado = numero1 / numero2;
            System.out.println(resultado);
        } else {
            System.out.println("Número precisa ser maior que 0");
        }


    }
}
