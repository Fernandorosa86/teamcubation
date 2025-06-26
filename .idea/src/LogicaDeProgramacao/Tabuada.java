package LogicaDeProgramacao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para saber a tabuada dele: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada do numero " + numero + " :" );

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }
}
