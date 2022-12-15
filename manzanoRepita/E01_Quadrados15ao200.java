package manzanoRepita;

public class E01_Quadrados15ao200 {

	public static void main(String[] args) {
		
		short contadora = 15;
		
		int numeros;
		
		do {
			numeros = contadora*contadora;
			System.out.println("O quadrado do número "+contadora+" é: "+numeros);
			contadora++;
		} while (contadora<=200);

	}

}
