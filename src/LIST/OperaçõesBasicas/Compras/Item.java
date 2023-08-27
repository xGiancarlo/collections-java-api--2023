package LIST.OperaçõesBasicas.Compras;

public class Item {
    String nome;
    double preço;
    int quantidade;

    public Item(String nome, double preço, int quantidade) {
    }

    public void nome(String nome){
        this.nome = nome;
    }
    public void preço(double preço){
        this.preço = preço;
    }
    public void quantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
