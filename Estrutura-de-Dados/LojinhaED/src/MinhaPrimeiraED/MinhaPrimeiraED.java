package MinhaPrimeiraED;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Gabriel 
 */
public class MinhaPrimeiraED {
  private Object[] objetos = new Object[10];
    public int totalDeObjetos = 0;

    public int tamanho() {
        return totalDeObjetos;
    }

    public boolean cheio() {
        return totalDeObjetos == objetos.length;
    }

    public boolean vazio() {
        return totalDeObjetos == 0;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeObjetos; //só posso colocar elemento entre a posição zero entre e o total de elementos
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= totalDeObjetos;
    }

    public void adiciona(Object objeto) {
        if (totalDeObjetos == objetos.length) {
            return; // Não adiciona se estiver cheio
        }
        this.objetos[this.totalDeObjetos] = objeto;
        this.totalDeObjetos++;
    }

    public void adiciona(int posicao, Object objeto) {
        if (!posicaoValida(posicao)) {
            System.out.println("Aviso: Posição inválida!");
        }

        if (totalDeObjetos == objetos.length) {
            garantaEspaco(); // ele só vai aumentar caso estiver cheio
        }

        for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
            objetos[i + 1] = objetos[i]; //vai deslocar para a direita 
        }

        objetos[posicao] = objeto;
        totalDeObjetos++;
    }

    private void garantaEspaco() {
        if (totalDeObjetos == objetos.length) {
            Object[] novoVetor = new Object[objetos.length * 2];
            for (int i = 0; i < objetos.length; i++) {
                novoVetor[i] = objetos[i];
            }
            objetos = novoVetor;
        }
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            System.out.println("Aviso: Posição inválida!");
        }

        for (int i = posicao; i < totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i + 1];
        }

        //this.objetos[totalDeObjetos - 1] = null; está 
        this.totalDeObjetos--;
    }

    public boolean contem(Object objeto) {
        for (int i = 0; i < totalDeObjetos; i++) {
            if (objeto.equals(this.objetos[i])) {
                return true;
            }
        }
        return false;
    }

    public Object getObjeto(int posicao) {
        if (!posicaoOcupada(posicao)) {
            System.out.println("Aviso: Posição inválida!");
        }
        return objetos[posicao];
    }

}
