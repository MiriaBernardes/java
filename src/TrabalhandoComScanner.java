import java.util.Scanner;

public class TrabalhandoComScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algo: ");
        String palavra = scanner.nextLine();

        System.out.println("Digite algo: ");
        float preco = scanner.nextFloat();

        System.out.println("Digite algo: ");
        Boolean ehZero = scanner.nextBoolean();

        System.out.println(ehZero);
    }
}
