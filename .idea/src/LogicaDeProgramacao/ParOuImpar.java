package LogicaDeProgramacao;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int numero = sc.nextInt();
        if(numero %2==0){
            System.out.println("O numero é Par");
        }else{
            System.out.println("O numero é Impar");
        }
        sc.close();
    }
}
