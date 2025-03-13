/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class EdTeste {

    public static void main(String[] args) {
        MinhaPrimeiraED lista = new MinhaPrimeiraED();

        // Testando se a lista começa vazia
        System.out.println("Lista está vazia? " + lista.vazio());


        lista.adiciona("1");
        lista.adiciona("2");
        lista.adiciona("3");
        exibirLista(lista, "Lista após adições:");


        System.out.println("\nTamanho da lista: " + lista.tamanho());

        
        // Adicionando um item em uma posição específica
        lista.adiciona(1, "Gabriel"); // Esse "Gabriel" deve entrar na posição 1 e empurrar os outros
        exibirLista(lista, "Lista após adicionar 'Gabriel' na posição 1:");

     
        lista.remove(0);
        exibirLista(lista, "Lista após remover o elemento da posição 0:");

        // Verificando se certos elementos estão na lista
        System.out.println("\nA lista contém '2'? " + lista.contem("2")); // Deve ser true
        System.out.println("A lista contém '5'? " + lista.contem("5")); // Deve ser false
        System.out.println("Objeto na posição 1: " + lista.getObjeto(1)); // Aqui deve imprimir "2"

        
        // Adicionando mais elementos pra ver se a lista cresce automaticamente
        for (int i = 4; i <= 15; i++) {
            lista.adiciona(i + "");
        }
        exibirLista(lista, "Lista após adicionar mais elementos:");

       
        System.out.println("\nA lista está cheia? " + lista.cheio()); // Deve ser false porque a lista cresce sozinha

        // Removendo todos os elementos da lista
        while (!lista.vazio()) {
            lista.remove(0); // Vai removendo o primeiro até ficar vazia
        }
        exibirLista(lista, "Lista após remover todos os elementos:");

    
        System.out.println("Lista está vazia? " + lista.vazio());
    }

   
    private static void exibirLista(MinhaPrimeiraED lista, String mensagem) {
        System.out.println("\n" + mensagem);
        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(lista.getObjeto(i));
        }
    }
}
