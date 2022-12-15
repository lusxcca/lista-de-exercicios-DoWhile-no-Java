package manzanoRepita;

public class E03_DivisiveisPor4 {

	public static void main(String[] args) {
		
		short contadora = 0;
		
		do {
			if (contadora%4==0) {
				System.out.println(contadora);
			}
			contadora++;
		} while (contadora<=200);

	}

}
