package venda;

public class MainTestVenda {
    

    public static void main(String[] args) {
        
        Venda v = new Venda();

        ItemVenda iv = new ItemVenda();
        iv.setPrecoUnitario(2);
        iv.setQuantidade(5);
        
        v.addItemVenda(iv);

        iv = new ItemVenda();
        iv.setPrecoUnitario(4);
        iv.setQuantidade(2);
        
        v.addItemVenda(iv);

        v.print();

    }
}
