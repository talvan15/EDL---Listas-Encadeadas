
public class Main {
    public static void main(String[] args) {
        ListaEcadeada Lista = new ListaEcadeada();

        Lista.inserirInicio(10);
        Lista.inserirInicio(20);
        Lista.inserirInicio(30);
        Lista.inserirFim(50);
        Lista.inserirInicio(40);

        Lista.exibir();
        Lista.tamanho();
        Lista.ObterProximo(10);
        System.out.println("Valor encontrado: "+ Lista.ObterValor(30));

    }
}