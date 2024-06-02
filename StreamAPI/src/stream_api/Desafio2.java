package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        int resultado = numerosPares.stream()
                .reduce(0, Integer::sum);
            
        System.out.println("a soma dos números pares da lista: " + resultado);
    }
}
