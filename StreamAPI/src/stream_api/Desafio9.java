package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        long c1 = numeros.stream()
        .distinct().count();
        
        long c2 = numeros.stream().count();

        System.out.println("há itens duplicados? " + (c1 < c2));
    }
}
