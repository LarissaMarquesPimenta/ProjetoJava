package projetoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controle.util.cores;
import projetoJava.Paciente.resultado;

public class testePaciente {

	public static void main(String[] args) {
		int opcao;
		Scanner leia = new Scanner(System.in);

		List<Paciente> pacientes = new ArrayList<>();

		while (true) {

			System.out.println(cores.TEXT_CYAN_BRIGHT + cores.ANSI_BLACK_BACKGROUND
					+ "=====================================================");
			System.out.println("                                                     ");
			System.out.println("                CONTROLE DE PACIENTES                ");
			System.out.println("                                                     ");
			System.out.println("=====================================================");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastro de Novo Paciente            ");
			System.out.println("            2 - Exibir lista de Pacientes            ");
			System.out.println("            3 - Editar dados do Paciente             ");
			System.out.println("            4 - Apagar dados do Paciente             ");
			System.out.println("            5 - Buscar Paciente                      ");
			System.out.println("            6 - Calcular IMC                         ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("=====================================================");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println(
						cores.TEXT_GREEN + cores.ANSI_BLACK_BACKGROUND + "\nObrigado por utilizar nosso programa!");
				leia.close();
				System.exit(0);
				
			}	
			
			switch (opcao) {

			case 1:
				String nome;
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
					System.out
							.println(cores.TEXT_RED_BOLD_BRIGHT + cores.ANSI_BLACK_BACKGROUND + "A lista está vazia.");
				} else {
					for (Paciente loop : pacientes) {
						loop.visualizar();
					}
				}
				break;

		
				// Atualizar cadastro
			case 3: 
				System.out.println("Deseje o indice que deseja editar: ");
				int indice1 = leia.nextInt();
				indice1 = indice1 - 1;
				if(indice1 > pacientes.size()) {
					System.out.println("\nO paciente não existe!");
				}
				else if (pacientes.size() > indice1) {
					System.out.println("O que deseja editar? ");
					System.out.println("1. Nome \n2. Idade \n3. genero \n4. Peso \n5. Altura \n6. Tipo sanguineo  ");
					int op1 = leia.nextInt(); 
					switch(op1) {
					
					case 1: 
						System.out.println("Novo nome: ");
						String novoNome = leia.next();
						pacientes.get(indice1).setNome(novoNome);
						
						break;
					case 2:
						System.out.println("Nova idade: ");
						String novaIdade = leia.next();
						pacientes.get(indice1).setNome(novaIdade);
				
						break; 
					case 3:
						System.out.println("Novo genero: ");
						String novoGenero = leia.next();
						pacientes.get(indice1).setNome(novoGenero);
						
						break; 
					case 4: 
						System.out.println("Novo peso: ");
						String novoPeso = leia.next();
						pacientes.get(indice1).setNome(novoPeso);
						
						break; 
					case 5: 
						System.out.println("Nova altura: ");
						String novaAltura = leia.next();
						pacientes.get(indice1).setNome(novaAltura);
						
						break; 
					case 6: 
						System.out.println("Novo tipo sanguineo: ");
						String novoTipoSanguineo = leia.next();
						pacientes.get(indice1).setNome(novoTipoSanguineo);
						
						break; 
						
							
					}
				}
				
				break;

			case 4:
				// excluir paciente
				System.out.println("Digite o nome do paciente que deseja excluir:");
				String nomeExcluir = leia.next();
				boolean encontrado = false;
				for (int i = 0; i < pacientes.size(); i++) {
					Paciente paciente = pacientes.get(i);
					if (paciente.getNome().equalsIgnoreCase(nomeExcluir)) {
						pacientes.remove(i);
						encontrado = true;
						System.out.println("Paciente " + nomeExcluir + " removido com sucesso.");
						break;
					}
				}
				if (!encontrado) {
					System.out.println("Paciente " + nomeExcluir + " não encontrado.");
				}
				break;

			case 5:
				// Buscar paciente
				System.out.println("\nDigite o nome do paciente que desejar encontar: ");
				String buscarNome = leia.next();
				boolean Encontrado = false;
				for (int i = 0; i < pacientes.size(); i++) {
					Paciente paciente = pacientes.get(i);
					if (paciente.getNome().equalsIgnoreCase(buscarNome)) {
						System.out.println("\nPaciente encontrado: ");
						paciente.visualizar();
						Encontrado = true;
					}
					if (!Encontrado) {
						System.out.println("Paciente " + buscarNome + " não foi encontrado: ");
						break;

					}

				}

				break;

			case 6:
				// Calcular IMC
				String imc;

				System.out.println(resultado.visualizar);

				break;

			default:
				System.out.println("Opção inválida tente novamente!");
			}

		}

	}

}
