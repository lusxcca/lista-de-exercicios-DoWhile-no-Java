package manzanoRepita;

import java.util.Scanner;

public class E09_MaiorMenorValor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		byte valor;
		byte maior = 0;
		byte menor = 127;
		do {
			System.out.println("Informe um valor: ");
			valor = sc.nextByte();
			if (valor>maior) {
				maior = valor;
			} else if (menor>valor && valor>=0){
				menor = valor;
			}
			
		} while (valor>-1);
		System.out.println("O maior valor informado é: "+maior);
		System.out.println("O menor valor informado é: "+menor);
		sc.close();
	}

}
