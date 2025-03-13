/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minhaquartaed;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Lista {
    Livro cabeça;
    Livro Anterior;

    public void adiciona(Livro livro) {
        livro.setAnterior(cabeça);
        cabeça = livro; 


    }

   public void remove() {
    if (cabeça != null) {
        cabeça = cabeça.getAnterior();
    }
   }

    public Livro getCabeca() {

        return cabeça;
    }

    public void listarLivros() {
        Livro atual = cabeça;

        while (atual != null) {
            System.out.println("Nome: " + atual.getNome() + ", Ano: " + atual.ano + ", Preço: " + atual.preco);
            atual = atual.getAnterior(); 
        }

    }
}
