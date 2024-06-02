package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um
 * resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros
 * valores, ou tipos.
 */
public class ExemploFunction {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 10);

        Function<Integer, Integer> dobrar = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer t) {
                return t * 2;
            }

        };

        Function<Integer, Integer> dobrarLambda = t -> t * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrarLambda)
                .toList();
        
        numerosDobrados.stream().forEach(System.out::println);

        numeros.stream()
                .map(dobrar)
                .forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        numeros.stream()
                .map(dobrarLambda)
                .forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        numeros.stream()
                .map(n -> n * 2)
                .forEach(n -> System.out.printf("%d ", n));

    }
}
