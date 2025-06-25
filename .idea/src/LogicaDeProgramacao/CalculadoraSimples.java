package LogicaDeProgramacao;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado = 0;
        int opcao;

        System.out.println("Calculadora Simples");
        System.out.println("Escolha uma opcao de operacao");
        System.out.println("1- Soma");
        System.out.println("2- Subtracao");
        System.out.println("3- Multiplicacao");
        System.out.println("4- Divisao");

        System.out.println("Digite uma opcao");
        opcao = scanner.nextInt();

        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        num2 = scanner.nextInt();

        switch(opcao){
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da sua adicao é: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da sua subtracao é: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da sua multiplicacao é: " + resultado);
                break;

            case 4:
                if(num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado da sua divisao é: " + resultado);
                }else {
                    System.out.println("Erro: Divisao por 0.");
                }
                break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");

        }
        scanner.close();

    }
}
