package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println("Numeros ímpares multiplos de 3 ou 5:");
        numeros.stream()
            .filter(n -> (n % 3 == 0 || n % 5 == 0) && n % 2 == 1 )
            .forEach(n -> System.out.printf("%d ", n));
    }

}
