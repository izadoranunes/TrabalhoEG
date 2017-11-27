/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import java.util.Scanner;

/**
 *
 * @author aline, hugo, izadora, betania e larissa
 * @since 24/11/2017
 * 
 */
public class testePessoa {
   /** método de laço que retorna a partir do número selecionado pelo usuario
   */
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        
        Scanner info = new Scanner(System.in);
        
        System.out.println("Escolha o numero 1,2 ou 3");
        
        int armazena = info.nextInt();
        
        if (armazena == 1) {
            p.dados1();
        }
        
        if (armazena == 2) {
            p.dados2();
        }
        
        if (armazena == 3) {
            p.dados3();
        }
        
        
    
    }
}
