/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Series;

/**
 *
 * @author aline, hugo, izadora, betania e larissa
 * @since 24/11/2017
 */

public class Principal {
    
    private String serie;
    private String musica;
    private String livro;

/**
 * @param
 * Método para selecionar de 1 a 3 
 */
    public void escolha1(){
        System.out.println("Teen Wolf " + 
                " Skam " + " The Gifted " + " Sense8 ");
           
}
    public void escolha2(){
        System.out.println("There's Nothing Hold Me Back - Shawn Mendes " + " Shape of You - Ed Sheeran " +
                " Wolves - Selena Gomes  feat. Marshmello " + " ...Ready For It - Taylor Swift " );     
}
    public void escolha3(){
        System.out.println(" A Pedra Filosofal " + " O Ladrão de Raios " + " Naomi e Ely " 
                + " As Vanatgens de Ser Invisivel " );
    
}   
    /** Método obtido com o resultado da seleção de 1 a 3
    */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }
    
    
    
}
