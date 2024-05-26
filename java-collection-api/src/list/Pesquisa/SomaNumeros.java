package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int resultado = 0;
        for (Integer i : numeros) {
            resultado += i;
        }
        return resultado;
    }

    public int encontrarMaiorNumero() {
        if (numeros.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        int maior = numeros.get(0);
        for (Integer numero : numeros) {
            if (numero >= maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        if (numeros.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        int menor = numeros.get(0);
        for (Integer numero : numeros) {
            if (numero <= menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }

    public static void main(String[] args) {

        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
