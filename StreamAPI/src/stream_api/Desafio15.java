package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean temNumeroNegativo = numeros
                .stream()
                .filter(n -> n < 0)
                .count() > 0;
                
        System.out.println("Contém 1 número negativo? " + temNumeroNegativo);
    }
}
