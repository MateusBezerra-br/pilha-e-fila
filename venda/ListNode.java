package venda;

class ListNode {

    Node begin;

    public void add(Object data) {
        Node novo = new Node();
        novo.data = data;

        novo.next = this.begin;
        this.begin = novo;
    }

    public void print() {
        Node aux = this.begin;

        while (aux != null) {
            System.out.println(aux.data);
            aux = aux.next;
        }
    }

    public void remove(int index){
        Node aux = begin;
        int contador = -1;

        if ( index == 0 ){

            begin = begin.next;
            return;
        }

        while ( aux != null && contador != index - 1 ){

            aux = aux.next;
            contador++;

        }

        if ( aux != null && aux.next != null ){

            aux.next = aux.next.next;

        } else {

            throw new IndexOutOfBoundsException("O índice que você tentou acessar não existe na lista.");

        }
    }

    public int getIndex(Object o) {
        Node aux = this.begin;
        int index = 0;

        while (aux != null && !aux.data.equals(o)) {
            aux = aux.next;
            index++;
        }

        if(aux != null) {
            return index;
        }

        return -1;
    }

    public int lastElementList (){
        Node aux = begin;
        int indiceUltimoElemento = -1;

        while ( aux != null ){

            indiceUltimoElemento++;
            aux = aux.next;

        }

        return indiceUltimoElemento;

    }
}