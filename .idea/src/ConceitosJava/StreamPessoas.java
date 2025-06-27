package ConceitosJava;

import java.util.*;

public class StreamPessoas {
    public static void main(String[] args) {

        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Anna Maria", 1);
        pessoas.put("Fernando Rosa", 39);
        pessoas.put("Lucas Saenger", 38);
        pessoas.put("Pedro Monate", 29);
        pessoas.put("Maria Reis", 25);
        pessoas.put("Leonel Messi", 38);

        Set<String> maioresDeTrinta = new TreeSet<>();

        for(String nome : pessoas.keySet()){
            int idade = pessoas.get(nome);
            if(idade > 30){
                maioresDeTrinta.add(nome);
            }
        }

        System.out.println("Pessoas maiores de 30 anos: ");
        for(String nome : maioresDeTrinta){
            System.out.println(nome);
        }

    }
}
