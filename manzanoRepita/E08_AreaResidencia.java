package manzanoRepita;

import java.util.Scanner;

public class E08_AreaResidencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char resposta = 's';
		byte altura;
		byte comprimento;
		int areaResidencia;
		int acumuladora = 0;
		do {
			
			System.out.println("Informe o nome do comodo: ");
			String comodo = sc.next();
			System.out.println("Informe a altura em metros do "+comodo);
			altura = sc.nextByte();
			System.out.println("Informe o comprimento em metros do "+comodo);
			comprimento = sc.nextByte();
			areaResidencia = comprimento*altura;
			acumuladora += areaResidencia;
			
			System.out.println("Possui mais algum comodo?");
			resposta = sc.next().charAt(0);
			
		} while (resposta == 's');
		System.out.println("A área total de sua residência é: "+acumuladora+"m²");
		sc.close();
	}

}
