package venda;

import java.util.Objects;

public class Produto {

    String nome;
    String id;

    public Produto() {
    }

    public Produto(String id, String nome) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id: " + this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Produto)) {
            return false;
        }

        Produto p = (Produto) o;
        return Objects.equals(this.id, p.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
}