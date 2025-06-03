package aprendendoJava;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número aleatório e direi se é par ou ímpar");

		int parImpar = sc.nextInt();

		if (parImpar % 2 == 0) {
			System.out.println("Esse número é par!");
		} else
			System.out.println("Esse número é impar!");

	}

}
