/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojinhaed;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Principal {
    public static void main(String[] args){
        Pizza p1 = new Pizza("mussarela", 50.00);
        Pizza p2 = new Pizza("mussarela", 50.00);
        Pizza p3 = new Pizza("mussarela", 50.00);
        Pizza p4 = new Pizza("mussarela", 50.00);
        Pizza p5 = new Pizza("mussarela", 50.00);
        
        Bebida b1 = new Bebida ("coca-cola", 12.00);
        Bebida b2 = new Bebida ("sprite", 13.00);
        
        CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        c1.adicionaBebida(b2);
        c1.adicionaPizza(p5);
        
        System.out.println("Total a pagar " + c1.getTotal());
        
    }
}
