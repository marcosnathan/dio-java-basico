package stream_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int segundoMaior = numeros.stream()
            .sorted(Collections.reverseOrder())
            .skip(1)
            .findFirst().get();
        System.out.println("O segundo maior número da lista é: ");
        System.out.println(segundoMaior);

    }
}
