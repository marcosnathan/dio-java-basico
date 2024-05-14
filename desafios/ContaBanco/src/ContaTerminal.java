
public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }
}