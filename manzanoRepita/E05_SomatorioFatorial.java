package manzanoRepita;

import java.util.Scanner;

public class E05_SomatorioFatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte contadora = 1;
		byte valor;
		byte antecessor;
		int fatorial = 1;
		int somatorio = 0;
		
		do {
			
			System.out.println("Informe um valor: ");
			valor = sc.nextByte();
			antecessor = valor;
			fatorial = valor;
			do {
				antecessor--;
				fatorial = fatorial*antecessor;
			} while (antecessor > 1);
				
			somatorio = fatorial+somatorio;
						
			contadora++;
		} while(contadora<=15);
		System.out.println("O somatório das fatoriais correspondentes é: "+somatorio);
		sc.close();
	}

}
