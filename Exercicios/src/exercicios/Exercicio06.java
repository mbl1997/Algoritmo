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
public class Exercicio06 {
    
public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = e.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = e.nextInt();
		
		if (numero1 > numero2){
			System.out.print("o primeiro é o maior: "+numero1);	
			System.out.print("ebhaaaa!");
		}// numero1 > numero2
		else if (numero2 > numero1)
				System.out.print("o segundo é o maior: "+numero2);
		else
				System.out.print("numeros iguais: "+numero1);
		
		
		
		
/*
 * 		if (numero1 > numero2)
			System.out.print("o primeiro é o maior: "+numero1);		
		if (numero2 > numero1)
			System.out.print("o segundo é o maior: "+numero2);
		if (numero1 == numero2)
			System.out.print("numeros iguais: "+numero1);

 */		
 
	}// final main
}// final classe
