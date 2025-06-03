package aprendendoJava;

import java.util.Scanner;

public class multiplosNaoMultiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		int numero1 = sc.nextInt();

		System.out.println("Digite o segundo numero");
		int numero2 = sc.nextInt();

		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("Esses números são múltiplos!");
		} else
			System.out.println("Esses números não são múltiplos!");
		sc.close();

	}

}
