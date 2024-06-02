package functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class ExemploSupplier {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        

        Supplier<String> saudacao = new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, seja bem vindo!";
            }
        };

        Supplier<String> saudacaoLambda = () -> "Olá, seja bem vindo";


        List<String> saudacoes = Stream.generate( () -> "Olá, seja bem vindo!" )
                .limit(5)
                .toList();
        
        saudacoes.stream().forEach(System.out::println);

    }
}
