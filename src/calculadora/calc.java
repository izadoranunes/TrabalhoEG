/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author aline, hugo, izadora, betania e larissa
 * @since 24/11/2017
 * 
 */
/** método para calcular a nota com base das 4 operações
 * nota 1 + nota 2 = x
 * nota 1 / nota 2 = y
 * nota 1 - nota 2 = q
 * nota 1 * nota 2 = z
 */
    public class calc {

	private int n1 = 5;
	private int n2 = 5;
	
	
	public void soma(){
		System.out.println("A soma desses números é: " + (n1 + n2));		

	}
	
	public void dividir(){
		System.out.println("A divisão desses números é: " + (n1 / n2));		

	}
	public void subtracao(){
		System.out.println("A subatração desses números é: " + (n1 - n2));		

	}
	public void multiplicacao(){
		System.out.println("A multiplicação desses números é: " + (n1 * n2));		

	}
	
}

