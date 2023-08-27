package LIST.OperaçõesBasicas.Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private static List<Item> carrinhoList;

    public void CarrinhoCompras() {
        this.carrinhoList = new ArrayList<>();
    }
    public void adicionarItem(String  nome, double  preço, int quantidade) {
        carrinhoList.add(new Item(nome, preço, quantidade));
    }
}
