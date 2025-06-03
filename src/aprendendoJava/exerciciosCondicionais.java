package aprendendoJava;

import java.util.Scanner;

public class exerciciosCondicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Número negativo");

		} else
			System.out.println("Número não negativo");

	}

}
