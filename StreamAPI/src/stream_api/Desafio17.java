package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosPrimos = numeros.stream()
                .filter(n -> isPrimo(n))
                .toList();
        System.out.println("Numeros primos: " + numerosPrimos);
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    };
}
