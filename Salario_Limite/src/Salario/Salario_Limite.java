/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salario;
import java.util.Scanner;
/**
 *
 * @author marib
 */


    /**
     * Aula05
Faça um algoritmo que leia o nome o salário de 5 pessoas.
Após, mostre o nome e o salário da pessoa com o maior salário.
Mostre também a média de salários.
     */
public class Salario_Limite {
    
                   static String nome, nomeMaiorSalario;
	static double salario, maiorSalario=0;

	public static void main(String[] args) {
		double somaSalarios = 0;
		int i;
		for (i = 0; i < 5; i++) {
			recebeDados();
			verificaMaiorSalario();
			somaSalarios = acumulaSalario(somaSalarios);
			
		}// ----------------------
		mostraResultados(somaSalarios);
	}// -------------------------------------

	static void mostraResultados(double somaSalarios){
		System.out.print("\n  Nome maior salario: "+nomeMaiorSalario);
		System.out.print("\n   Salario= "+maiorSalario);
		System.out.print("\n   Média dos salarios: "+calculaMedia(somaSalarios));
	}//----------------------------
	static void recebeDados(){
		Scanner e = new Scanner(System.in);
		System.out.print("\nDigite nome: ");
		nome = e.next(); // entrada para String
		System.out.print("\nDigite salario: ");
		salario = e.nextDouble();
	}//------------------------
	static void verificaMaiorSalario(){
		if (salario > maiorSalario){
			maiorSalario = salario;
		    nomeMaiorSalario = nome;
		}
	}//--------------------------------
	static double acumulaSalario(double salarios){
		return salarios + salario;
	}
}
