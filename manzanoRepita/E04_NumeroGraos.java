package manzanoRepita;

public class E04_NumeroGraos {

	public static void main(String[] args) {
		
		byte contadora = 1;
		float acumuladora = 0;
		do {
			acumuladora = acumuladora + acumuladora + 1;
			System.out.println("O número de grãos no "+contadora+"º quadro é: "+acumuladora);
			contadora++;
		} while(contadora<=64);

	}

}
