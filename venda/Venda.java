package venda;

public class Venda {
    ListNode itensVenda = new ListNode();


    public void addItemVenda(ItemVenda itemVenda) {

        this.itensVenda.add(itemVenda);
    }

    public void print() {

        itensVenda.print();
    }
}
