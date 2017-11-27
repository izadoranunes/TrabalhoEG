/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Series;

import java.util.Scanner;

/**
 *
 * @author aline, hugo, izadora, betania e larissa
 * @since 24/11/2017
 */
public class opcoes {
    
    /** método de laço que retorna a partir do número selecionado pelo cliente
     */
    public static void main(String[] args) {
        
        Principal p = new Principal();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a escolha de 1 a 3: ");
        
        int var = sc.nextInt();
               
        if( var == 1){
            p.escolha1();
        }
        if( var == 2){
            p.escolha2();
        }     
        if (var == 3){
            p.escolha3();
        }
       
        
    }
    
    
}
