package venda;

public class MainTestVendaProduto {
    
    public static void main(String[] args) {
     
        Estoque e = new Estoque();

        e.addProduto(new Produto("1", "Manteiga Itacolomi"));
        e.addProduto(new Produto("2", "Feijão Carioqinha"));

        e.print();
    }
}
