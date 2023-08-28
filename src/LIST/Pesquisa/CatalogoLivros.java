package LIST.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {


    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    livrosList.add(new Livro(titulo, autor,anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    /*@Override
    public String toString() {
        return "CatalogoLivros{" +
                "livrosList=" + livrosList +
                '}';
    }*/

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Autor 01", 2019);
        catalogo.adicionarLivro("Livro 1", "Autor 02", 2017);
        catalogo.adicionarLivro("Livro 3", "Autor 02", 2018);
        catalogo.adicionarLivro("Livro 1", "Autor 03", 2015);
        catalogo.adicionarLivro("Livro 4", "Autor 01", 2021);
        catalogo.adicionarLivro("Livro 3", "Autor 03", 2020);

        System.out.println(catalogo.pesquisarPorAutor("Autor 02"));

        catalogo.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogo.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogo.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogo.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogo.pesquisarPorIntervaloAnos(2017, 2030));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 04"));

    }
    /*
    pesquisarPorAutor(String autor) ok
    pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) ok
    pesquisarPorTitulo(String titulo)
    */
    }
