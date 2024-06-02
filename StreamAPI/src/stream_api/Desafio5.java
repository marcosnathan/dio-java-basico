package stream_api;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        IntSummaryStatistics statistics = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
                
        System.out.println("A média dos números maiores que 5  é " + statistics.getAverage());
    }
}
