package manzanoRepita;

import java.util.Scanner;

public class E10_DivisaoInteira {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor divisor: ");
		float divisor = sc.nextByte();
		System.out.println("Informe o valor dividendo: ");
		float dividendo = sc.nextByte();

		do {

			divisor = divisor / dividendo;
			System.out.println(divisor);
		} while (divisor >= dividendo);
		sc.close();
	}

}
