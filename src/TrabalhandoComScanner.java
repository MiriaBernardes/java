import java.util.Scanner;

public class TrabalhandoComScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra;

        System.out.println("Digite algo: ");
        palavra = scanner.nextLine();

        System.out.println("Digite algo: ");
        float preco = scanner.nextFloat();

        System.out.println("Digite algo: ");
        Boolean ehZero = scanner.nextBoolean();

        System.out.println(ehZero);
    }
}
