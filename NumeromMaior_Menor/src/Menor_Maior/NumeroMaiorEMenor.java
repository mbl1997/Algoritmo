/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menor_Maior;
import java.util.Scanner;
/**
 *
 * @author marib
 */
public class NumeroMaiorEMenor {
    
 public static void main(String[] args) {
		int n1, n2;
		Scanner e = new Scanner(System.in);
		char sn;
		
		while(true){
			System.out.print("\nDigite n1: ");
			n1 = e.nextInt();
			if ((n1>0) && (n1<10)){			
				while(true){
					System.out.print("\nDigite n2: ");
					n2 = e.nextInt();
					if((n2>0) && (n2<10)){
						System.out.print("Soma= "+(n1+n2));
						System.out.print("  Subtrai= "+(n1-n2));
						System.out.print("  Multiplica= "+n1*n2);
						System.out.print("  Divide= "+((double)n1/n2));
						break;
					}else
						System.out.print("  Número fora do intervalo.");
				}//-----final 2o while			
			}else
				System.out.print("  Número fora do intervalo.");
			System.out.print("\n...Continuo no laço? s/n: ");
			sn = e.next().charAt(0);
			if(sn == 'n')
				break;
		}//----final do while
	}//------------------------------final main
}//-------------------------final classe

