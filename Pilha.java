public class Pilha <Info>{

    private No<Info> topo;
    private int tamanho; 

    //construtor padrão

    public boolean estaVazia() {
        return topo == null;
    }

    public void push (Info info) {
        No<Info> novo = new No<Info>(info);
        if (!estaVazia()){
            novo.setProximo(topo);
        }
        topo = novo;
        tamanho++;
    }

    public Info pop() {
        if (estaVazia()) return null;
        Info info = topo.getInfo();
        topo = topo.getProximo();
        tamanho--;
        return info;
    }

    public Info peek(){ 
        if(estaVazia()) return null; //precisamos colocar isso para nao tomar uma nullPointerException
        return topo.getInfo();
    }

    public int getTamanho(){
        return tamanho;
    }

    public String estaEstacionado(String placa) {

        if (estaVazia()) return "o carro não se encontra no estacionamento";

        No<Info> aux = topo;
        boolean achou = false;
        int posicao = 1;
        while (aux.getProximo() != null && !achou){
            if(aux.getProximo().getInfo() == placa){
                achou = true;
            }
            aux = aux.getProximo();
            posicao ++;
        }
        Info horarioEntrada = aux.getInfo();
        return "o carro se encontra no estacionamento. \nposicao do carro: " + posicao + "\ne tem horario de entrada " + horarioEntrada ;
    }

    @Override
    public String toString(){
        if (estaVazia() ) return "pilha vazia";
        String s = "";
        No<Info> aux = topo;
        while (aux != null){
            s += aux + "\n";
            aux = aux.getProximo();
        }
        return s;
    }
}

 class No <Info> {
    private Info info;
    private No<Info> proximo;

    public No (Info info){
        this.info = info;
        this.proximo = null;
    }
    public Info getInfo () {
        return info;
    }
    public No<Info> getProximo(){
        return proximo;
    }
    public void setInfo(Info info){
        this.info = info;
    }
    public void setProximo(No<Info> proximo){
        this.proximo = proximo;
    }

    @Override
    public String toString(){
        return "|" + info + "|";
    }

}
