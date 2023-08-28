package LIST.OperaçõesBasicas.Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private static List<Item> itemList;

    public List<Item> ItemList;

    public CarrinhoDeCompras() {
        this.ItemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.ItemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!ItemList.isEmpty()) {
            for (Item i : ItemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            ItemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!ItemList.isEmpty()) {
            for (Item item : ItemList) {
                double valorItem = item.getPreço() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!ItemList.isEmpty()) {
            System.out.println(this.ItemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + ItemList +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }


    /* public void adicionarItem(String  nome, double  preço, int quantidade) {
        Item item = new Item(nome, preço, quantidade);
        this.itemList.add(item);
       // carrinhoList.add(new Item(String nome,double preço,int quantidade))
    }*/
   /* public static void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item I : itemList){
            if (I.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(I);
            }
        }
        itemList.removeAll(itemParaRemover);
    }*/
    /*public static int obterNumeroTotalItem(){
        return itemList.size();
    }
    public static void obterQuantidadeItem(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarItem("Arroz", 19.00,2);
        System.out.println("O numero total de itens na lista: " + CarrinhoCompras.obterNumeroTotalItem());
    }*/
}
