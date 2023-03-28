package projetoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testePaciente {

	public static void main(String[] args) {
		int opcao;
		String nome;
		Scanner leia = new Scanner(System.in);

		List<Paciente> pacientes = new ArrayList<>();

		while (true) {

			// Menu

			System.out.println("Escolha uma opção.");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				// cadastrar paciente
				do {
					int id = 0;
					System.out.println("Para continuar escreva o nome do paciente ou sair para finalizar o programa.");
					nome = leia.next();
					if (!nome.equalsIgnoreCase("sair")) {
						System.out.println("Qual tipo sanguineo?");
						String tipoSanguineo = leia.next();
						System.out.println("Qual o sexo?");
						String genero = leia.next();
						System.out.println("Qual a idade do paciente?");
						int idade = leia.nextInt();
						System.out.println("Qual o peso do paciente?");
						double peso = leia.nextDouble();
						System.out.println("Qual a altura do paciente?");
						double altura = leia.nextDouble();
						pacientes.add(new Paciente(nome, tipoSanguineo, genero, idade, peso, altura, id));
						id++;
					}
				} while (!nome.equalsIgnoreCase("sair"));
				pacientes.forEach(paciente -> paciente.visualizar());
				break;

			case 2:
				if (pacientes.isEmpty()) {
					System.out.println("A lista está vazia.");
				} else {
					for (Paciente loop : pacientes) {
						loop.visualizar();
					}
				}
				break;

			case 3:
				// Atualizar cadastro
				break;

			case 4:
				// Excluir dados
				break;

			case 5:
				// Excluir cadastro
				break;

			case 6:
				// Sair
				break;

			}

		}

	}

}
