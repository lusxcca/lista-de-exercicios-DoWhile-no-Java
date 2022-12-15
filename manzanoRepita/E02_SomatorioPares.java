package manzanoRepita;

public class E02_SomatorioPares {

	public static void main(String[] args) {
		
		short contadora = 1;
		int acumuladora = 0;
		do {
			if (contadora%2==0) {
				acumuladora += contadora;
			}
			contadora++;
		} while (contadora<=500);
		System.out.println("O somatório dos valores pares de 1 a 500 é: "+acumuladora);

	}

}
