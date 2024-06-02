package functional_interface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ExemploConsumer {

    public static void main(String[] args) {

        //Lista de números de 0 a 10;
        List<Integer> numeros = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);

        //Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeros = numero -> {
            if (numero % 2 == 0) {
                System.out.printf("%d ", numero);
            }
        };

        //Usando o Consumer declarado fora 
        numeros.stream().forEach(imprimirNumeros);

        System.out.println();

        //Usando o Consumer declarando na chamada da função
        numeros.stream().forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                if (t % 2 == 0) {
                    System.out.printf("%d ", t);
                }
            }
        });

        System.out.println();

        //Usando o Consumer declarando na chamada da função com Expressão Lambda
        numeros.stream().forEach(numero -> {
            if (numero % 2 == 0) {
                System.out.printf("%d ", numero);
            }
        });

    
    }
}
