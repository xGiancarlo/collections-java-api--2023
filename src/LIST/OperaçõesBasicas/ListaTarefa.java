package LIST.OperaçõesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private static List<tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new tarefa(descricao));
    }
    public static void removerTarefa(String descricao){
        List<tarefa> tarefasParaRemover = new ArrayList<>();
        for(tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
       tarefaList.removeAll(tarefasParaRemover);
       //tarefaList.removeAll()
    }
    public static int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public  void obterDescriçõesTarefas(){
        System.out.println(tarefaList);
    }

    public  void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista: "+ ListaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 01" );
        listaTarefa.adicionarTarefa("Tarefa 01" );
        listaTarefa.adicionarTarefa("Tarefa 03" );
        System.out.println("O numero total de elementos na lista:" + ListaTarefa.obterNumeroTotalTarefas());

       ListaTarefa.removerTarefa("Tarefa 01");
        System.out.println("O numero total de elementos na lista:" + ListaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescriçõesTarefas();

    }
}
