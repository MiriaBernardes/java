package src;

import java.util.Scanner;

public class TrabalhandoComStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma senha: ");

        String senha = scanner.nextLine();

        // tipo nome_variavel = "";
        // tipo nome_varialve;

        // @ ! #

        //abacate = [a , b , a , c , a, t, e ]

       // System.out.println(senha.length());

//        if ( senha.length()  < 8) {
//            System.out.println("Senha precisa ter no minimo 8 caracteres");
//        }
//        else {
//            System.out.println("Tudo certo");
//        }

        int contador = 0;

        boolean temCaracterEspecial = false;

        while(contador < senha.length()) { //7
           // System.out.println(senha.charAt(contador)); //senha.charAt(0) = l // senha.charAt(1) = a // senha.charAt(2) = r
            String caracter = String.valueOf(senha.charAt(contador));

            temCaracterEspecial = caracter.equals("@");


            if (temCaracterEspecial == true) {
                break;
            }

            contador++; // 1 // 2
        }

        if (temCaracterEspecial == true) {
            System.out.println("senha válida");
        }else {
            System.out.println("Senha inválida");
        }
       // System.out.println(senha.charAt(0)); // char = character ; at = onde/na

    }
}
