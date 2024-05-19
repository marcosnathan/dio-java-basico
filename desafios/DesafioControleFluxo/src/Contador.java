import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro2 - parametro1;
        for (int i = 1; i <= contagem; i++) {
            System.out.printf("Imprimindo o número %d\n", i);
        }
    }
}
