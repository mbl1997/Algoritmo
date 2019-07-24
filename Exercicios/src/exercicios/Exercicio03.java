/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;
/**
 *
 * @author marib
 */
public class Exercicio03 {
    
 
public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int numero1, numero2;
		int soma;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = e.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = e.nextInt();
		System.out.print("O resultado da soma é "+(numero1 + numero2));
		
	}// final main
}// final classe

