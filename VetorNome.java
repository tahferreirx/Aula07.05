package Desafios;

import java.util.Scanner;

public class VetorNome {
	public static void main(String[] args) {
		
		String nomes [] = new String [5];
		
		Scanner ler = new Scanner(System.in);
		
		for ( int i = 0; i<5; i++ ) {
			System.out.println("Informe um nome" + i+ "..:");
			nomes [i] = ler.next();
			
		}
		for ( int i = 0; i<5; i++) {
			System.out.println(nomes[i]);
		}
		ler.close();
	}

}
