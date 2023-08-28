package LIST.OperaçõesBasicas.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros)
            soma += numero;
        return soma;
    }
    public void encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
            if (!numeros.isEmpty()){
                for (Integer numero : numeros){
                    maiorNumero = numero;
                }
            }
    }
}
