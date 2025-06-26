package LogicaDeProgramacao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero +  " é " + fatorial);
    }
}
