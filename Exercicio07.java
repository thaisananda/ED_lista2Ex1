package Exercicios;

import javax.swing.JOptionPane;

import controller.Controller07;

public class Exercicio07 {
	
	public static void main (String[] args) {
		
		Controller07 digitos = new Controller07();
		
		int  N = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
		
		int resultado = digitos.QuantidadeDigitos(N);
		
		System.out.println("A quantidade de dígitos é: " + resultado);
	}
	

}
