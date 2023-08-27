package LIST.OperaçõesBasicas;

public class tarefa {
    //Atributo
    public String descricao;

   public tarefa(String descricao){
       this.descricao = descricao;
   }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}

