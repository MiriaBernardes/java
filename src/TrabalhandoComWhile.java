package src;

import java.util.Scanner;

public class TrabalhandoComWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int contador = 0;

        while( contador <= 2 ) {

            System.out.println("Digite o primeiro numero: ");
            int numero = scanner.nextInt();

            if( numero % 2 == 0 ) {
                System.out.println("eh par");
            } else {
                System.out.println("Impar");
            }

            contador ++;
        }

//
//
//        System.out.println("Digite o segundo numero: ");
//        int numero2 = scanner.nextInt();
//
//        if(numero2 % 2 == 0) {
//            System.out.println("eh par");
//        } else {
//            System.out.println("eh impar");
//        }
//
//        System.out.println("Digite o terceiro numero: ");
//        int numero3 = scanner.nextInt();
//
//        if(numero3 % 2 == 0) {
//            System.out.println("eh par");
//        } else {
//            System.out.println("eh impar");
//        }
    }
}
