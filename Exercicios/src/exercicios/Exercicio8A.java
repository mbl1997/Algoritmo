/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;
import java.util.*;
/**
 *
 * @author marib
 */
public class Exercicio8A {
    
public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro número: ");
		num1 = e.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = e.nextInt();
		System.out.print("Digite o terceiro número: ");
		num3 = e.nextInt();

		if((num1 > num2) && (num1 > num3))
				if (num2 > num3)
					System.out.print("num3:"+num3+" num2:"+num2+" num1:"+num1);
				else
					System.out.print("num2:"+num2+" num3:"+num3+" num1:"+num1);
		else if((num2 > num1) && (num2 > num3))
				if (num1 > num3)
					System.out.print("num3:"+num3+" num1:"+num1+" num2:"+num2);
				else
					System.out.print("num1:"+num1+" num3:"+num3+" num2:"+num2);
		else 
			if (num1 > num2)
				System.out.print("num2:"+num2+" num1:"+num1+" num3:"+num3);
			else
				System.out.print("num1:"+num1+" num2:"+num2+" num3:"+num3);
	}// final main
}// final classe

