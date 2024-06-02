package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um
 * resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar
 * números ou combinar objetos.
 */
public class ExemploBinaryOperator {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        BinaryOperator<Integer> somar = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer t, Integer u) {
                return t + u;
            }

        };

        BinaryOperator<Integer> somarLambda = (n1, n2) -> n1 + n2;

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        
        System.out.println("o resultado é " + resultado);

    }
}
