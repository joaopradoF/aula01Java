package aulaJPA.aula01;

import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		
		// Variáveis
        String nome;
        int idade;

        try (// Instanciar classe Scanner
		Scanner ler = new Scanner(System.in)) {
			// Dados
			System.out.println("Informe seu nome: ");
			nome = ler.next();
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
		}

        // Saída
        System.out.println("Seu nome é: " + nome + " e a sua idade é: " + idade);

    }
}
