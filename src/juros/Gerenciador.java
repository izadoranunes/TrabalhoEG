/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juros;

import java.util.Scanner;

/**
 *
 *  @author aline, hugo, izadora, betania e larissa
 * @since 24/11/2017
 */
public class Gerenciador {
    public static void main(String[] args) {
        
    Banco b = new Banco();
    
    Scanner s = new Scanner(System.in);
    
    //Desconto
    System.out.println("Informe o código do seu produto"); 
    int desconto = s.nextInt();
    b.setN1(desconto);
    System.out.println("Seu desconto é:");
    b.desconto();
    
    //Novo Saldo
    
    System.out.println("Informe o valor do depósito:");
    int saldo = s.nextInt();
    b.setN2(saldo);
    System.out.println("Seu novo saldo é:");
    b.saldo();
    
    //Juros
    
    System.out.println("Informe o número de meses: ");
    int juros = s.nextInt();
    b.setN3(juros);
    System.out.println("Os juros são de: ");
    b.juros();
    
 }
}