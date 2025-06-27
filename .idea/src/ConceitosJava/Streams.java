package ConceitosJava;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite uma lista de números inteiros, separados por vírgulas (ex: 1,2,3,4,5):");
        String input = sc.nextLine();


            List<Integer> numeros = Arrays.stream(input.split(","))
                    .map(String::trim) // Remove espaços em branco
                    .map(Integer::parseInt) // Converte para int
                    .collect(Collectors.toList());




            List<Integer> resultado = numeros.stream()
                    .filter(n -> n % 2 != 0)  //filtro de impares
                    .map(n -> n * 2)        //dobra o valor
                    .sorted()
                    .collect(Collectors.toList());


            System.out.println("Números ímpares dobrados e ordenados: " + resultado);


            sc.close();
        }
    }
