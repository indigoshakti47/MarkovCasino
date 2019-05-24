/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author LENOVO
 */
public class Item {
    private int valor;
    private String carta;

    public Item(int valor, String carta) {
        this.valor = valor;
        this.carta = carta;
    }
    
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return  carta ;
    }
    
    
    
}
