package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (tarefas.isEmpty()) {
            System.out.println("A lista está vazia!");
            return;
        }
        List<Tarefa> removeTarefas = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                removeTarefas.add(tarefa);
            }
        }

        tarefas.removeAll(removeTarefas);
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public void obterDescricoesTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("A lista está vazia!");
        }
        else{
            System.out.println(tarefas);
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefa
        ListaTarefas tarefas = new ListaTarefas();

        // Adicionando novas tarefas à lista
        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 2");
        tarefas.adicionarTarefa("Trabalhar");

        // Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + tarefas.obterNumeroTotalTarefas() + " tarefas na lista");

        // Removendo uma tarefa da lista
        tarefas.removerTarefa("Tarefa 1");

        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + tarefas.obterNumeroTotalTarefas() + " tarefas na lista");

        // Exibindo as descrições das tarefas atualizadas na lista
        tarefas.obterDescricoesTarefas();

        // Removendo uma tarefa da lista quando a lista está vazia
        tarefas.removerTarefa("Estudar para o exame");

        // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + tarefas.obterNumeroTotalTarefas() + " tarefas na lista");
    }
}
