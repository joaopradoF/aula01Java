package ProjetosBasicos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		int[] temps = new int[7];
		int escolha, diaMaior = 0, diaMenor = 0;
		boolean preenchido = false;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Olá, vamos fazer o calculo das temperaturas");
		System.out.println("1 - Informar temperaturas. 2 - Fazer o cálculo. 3 - SAIR");
		escolha = ler.nextInt();
		
		while (escolha != 3) { 
			if (escolha == 1) {
			System.out.println("Ok, vamos começar");
			for (int i = 0; i < temps.length; i++) {
					System.out.println("Digite a temperatura do dia " + (i + 1) + " :");
					temps[i] = ler.nextInt();
					preenchido = true;
				}
			} else if (escolha == 2) {
				if (preenchido) {
					int soma = 0;
					int maior = temps[0];
					int menor = temps[0];

					for (int i = 0; i < temps.length; i++) {
					    soma = soma + temps[i];
					    
					    if (temps[i] > maior) {
					    	maior = temps[i];
					    	diaMaior = i;
					    }
					    
					    if (temps[i] < menor) {
					        menor = temps[i];
					        diaMenor = i;
					    }
					}

					double media = soma / 7.0;
					System.out.println("A média das temperaturas é: " + media + "ºC");
					System.out.println("A menor temperatura foi no dia " + (diaMenor + 1) + ". A temperatura foi " + menor + "ºC");
					System.out.println("A maior temperatura foi no dia " + (diaMaior + 1) + ". A temperatura foi "+ maior + "ºC");
				} else {
					System.out.println("Ainda não há valores suficientes!");
				}
			}
			System.out.println("\nO que deseja fazer agora?");
			System.out.println("1 - Informar temperaturas. 2 - Fazer o cálculo. 3 - SAIR");
			escolha = ler.nextInt();
		} System.out.println("Tudo bem, fechando o programa...");
		ler.close();
	}
}