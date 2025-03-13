public class Lista {
    Livro cabeça;
    Livro Anterior;

    public void adiciona(Livro livro) {
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
    }
}
