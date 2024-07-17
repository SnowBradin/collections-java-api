package main.list.ordenacao2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;
        public CadastroProduto() {
            this.produtoSet = new HashSet<>();

    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
            produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
            Set<Produto> produtosPorPreco= new TreeSet<>(new ComparatorPorPreco());
            produtoSet.addAll(produtoSet);
            return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProduto.adicionarProduto(1L, "Produto 0", 20d, 10);
        cadastroProduto.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProduto.adicionarProduto(1L, "Produto 9", 5d, 4);

        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }
}
