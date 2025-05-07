package Desafios;

import java.util.Scanner;

public class ValorInteiro {
	public static void main(String[] args) {
		
		int vetor [] = new int [5];
		int soma;
		
		Scanner ler = new Scanner(System.in);
		
		for ( int i = 0; i<5; i++ ) {
			System.out.println("Informe um valor " + i+ "..:");
			vetor [i] = ler.nextInt();
			
		}
		
		soma = vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4];
		
		if (soma > 30 ) {
			System.out.println("A soma dos valores é: " + soma);
		
		} 
		else {
			System.out.println("A soma é menor que 30");
		}
		ler.close();
		}
	}




