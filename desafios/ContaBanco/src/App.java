import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal contaTerminal = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // usado para receber entradas decimais com `.`
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = Integer.parseInt(scanner.nextLine());
    
        System.out.print("Por favor, digite o nome do Cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        scanner.close();
        contaTerminal.setAgencia(agencia);
        contaTerminal.setNumero(numero);
        contaTerminal.setNomeCliente(cliente);
        contaTerminal.setSaldo(saldo);
        String resultado = "Olá " + contaTerminal.getNomeCliente() + ", obrigado por criar uma conta em nosso " +
                            "banco, sua Agência é " + contaTerminal.getAgencia() + 
                            ", conta " + contaTerminal.getNumero() + 
                            " e seu saldo " + contaTerminal.getSaldo()
                            + " já está disponível para saque."; 
        System.out.println(resultado);

    }
}
