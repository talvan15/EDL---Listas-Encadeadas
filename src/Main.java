
public class Main {
    public static void main(String[] args) {
        ListaEcadeada Lista = new ListaEcadeada();

        //Inserindo valores na lista
        Lista.inserirInicio(10);
        Lista.inserirFim(20);
        Lista.inserirFim(30);
        Lista.inserirFim(40);
        Lista.inserirFim(50);

        // Exibindo informações da lista.
        Lista.exibir();
        Lista.tamanho();

        //Operações com a lista.
        Lista.ObterProximo(10);
        System.out.println("Valor encontrado: "+ Lista.ObterValor(30));

        Lista.AlterarNo(20, 60);
        Lista.exibir();

    }
}