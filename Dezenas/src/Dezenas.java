/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import  java.util.Scanner ;
/**
 *
 * @author marib
 */
public class Dezenas {
    
   /* Faça um programa que receba um número entre (-1000) e (+9999) e diga se este número pertence as seguintes faixas:
- negativo, 
- zero, 
- unidade
- dezena
- centena
- milhar
Caso o número digitado esteja fora destas faixas a mensagem “***ERRO. Número fora do intervalo desejado.”.
     */
    public static void main(String[] args) {
      Scanner e = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = e.nextInt();
		
		if((num >= -1000)&&(num <= 9999)){
			System.out.print("\n....Este é um número ");
			if (num < 0)
				System.out.println("negativo. ");
			if (num == 0)
				System.out.println("igual a zero.");
			if ((num > 0) && (num < 10))
				System.out.println("de unidade.");
			if ((num > 9)&&(num < 100))
				System.out.println("de dezena.");
			if ((num>99)&&(num < 1000))
				System.out.println("de centena.");
			if ((num > 999)&& (num < 10000))
				System.out.println("de milhar.");
		}
		else System.out.println("\n***ERRO. Número fora do intervalo.");
	}//-------------------------------------
}
