package aprendendoJava;

import java.util.Scanner;

public class gerenciandoTarefas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota que você obteve no exame");
		double nota = sc.nextDouble();

		if (nota < 0 || nota > 10) {
			System.out.println("Nota inválida");
		} else if (nota < 5) {
			System.out.println("Infelizmente, você foi reprovado");
		} else if (nota <= 6.9) {
			System.out.println("Você ficou de recuperação");
		} else if (nota <= 8.9) {
			System.out.println("Parabéns! Você foi aprovado");
		} else {
			System.out.println("Parabéns pela excelente nota! Você foi aprovado com louvor");
		}
		sc.close();
	}
}
