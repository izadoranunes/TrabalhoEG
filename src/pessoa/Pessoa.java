/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author aline, hugo, izadora, betania e larissa
 * @since 24/11/2017
 * @return int - Dados selecionados
 */
public class Pessoa {
   
    private int dados;

    public int getDados() {
        return dados;
    }

    public void setDados(int dados) {
        this.dados = dados;
    }
    
    /**Método que informa os dados geradas sobre a pessoa selecionada
     */
    public void dados1(){
        System.out.println(""
                + "Olá, meu nome é Ian. Tenho 18 anos, gosto de gatos e adoro cantar.");
    }
    
    public void dados2(){
        System.out.println(""
                + "Olá camarada, meu nome é Bia e eu adoro comida!!!");
    }
    
    public void dados3(){
        System.out.println(""
                + "Olá eu sou o Nick, sou professor e adoro tirar o juizo dos meus alunos!!!");
    }
}
