package venda;

public class ItemVenda {

    private int quantidade;
    private int precoUnitario;

    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;
    }

    public int getQuantidade() {

        return this.quantidade;
    }

    public void setPrecoUnitario(int precoUnitario) {

        this.precoUnitario = precoUnitario;
    }

    public int getPrecoUnitario() {

        return this.precoUnitario;
    }

    public String toString() {

        return "Preço Unitário: " + this.getPrecoUnitario() + "\nQuantidade:" + this.getQuantidade();
    }
}