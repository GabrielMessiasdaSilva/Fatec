package minhaquartaed;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        Livro livro1 = new Livro();
        livro1.setNome("Livro 1");
        livro1.setAno(2021);
        livro1.setPreco(29.99);

        Livro livro2 = new Livro();
        livro2.setNome("Livro 2");
        livro2.setAno(2022);
        livro2.setPreco(39.99);

        lista.adiciona(livro1);
        lista.adiciona(livro2);

        System.out.println("Livros na lista após adição:");
        lista.listarLivros();

        lista.remove();

        System.out.println("Livros na lista após remoção:");
        lista.listarLivros();
    }
}
