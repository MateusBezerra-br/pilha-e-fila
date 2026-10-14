package venda;

public class Estoque {
    
    private ListNode produtos = new ListNode();

    public void addProduto(Produto p) {

        this.produtos.add(p);
    }

    public void print() {

        this.produtos.print();
    }
}
