package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor
 * booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma
 * condição.
 */
public class ExemploPredicate {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> linguagensProgramacao = Arrays.asList("Java", "Kotlin", "Python", "Go", "C", "C++", "Cobol", "Lua",
                "JavaScript", "Visual Basic", "Pascal");

        Predicate<String> maisCincoLetras = new Predicate<String>() {

            @Override
            public boolean test(String t) {
                return t.length() > 5;
            }

        };

        Predicate<String> maisCincoLetrasLambda = lang -> lang.length() > 5;

        List<String> langFiltradas = linguagensProgramacao.stream()
                .filter(lang -> lang.length() > 5)
                .toList();

        langFiltradas.stream().forEach(System.out::println);

    }
}
