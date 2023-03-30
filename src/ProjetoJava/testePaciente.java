package ProjetoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projeto.util.Cores;

public class testePaciente {

	public static void main(String[] args) { 
		int opcao; 
		boolean repeticao = true;
		Scanner leia = new Scanner(System.in); 
		
		List<Paciente> pacientes = new ArrayList<>();
		
		
		while(repeticao == true) {
			
			System.out.println(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "=====================================================");
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
			System.out.println("                                                     "+ Cores.TEXT_RESET);
			
			System.out.println("Escolha uma opção.");
			opcao = leia.nextInt();
			
			switch(opcao) {
			
			case 1:
				boolean loop = true;
				int op;
				while(loop == true) {
					System.out.println("Nome do paciente: ");
					String nome = leia.next();
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
					pacientes.add(new Paciente(nome, tipoSanguineo, genero, idade, peso, altura));
					System.out.println("Deseja adicionar outro paciente? ");
					System.out.println("[1] Sim \n[2] Não");
					op = leia.nextInt();
					if (op == 1) {
						loop = true;
					}
					else if (op == 2) {
						loop = false;
					}
					else {
						System.out.println("Opção invalida! Digite novamente.");
						op = leia.nextInt();						
					} }
				break;
				
			case 2: //larissa 
				
				if (pacientes.isEmpty()){
					System.out.println("A lista está vazia.");
					}
				else {
					for(Paciente i:pacientes) {
						System.out.println((pacientes.indexOf(i) + 1) + "° paciente");
						i.visualizar(); }
				}	
				break;
			
			case 3: 
				System.out.println("Deseje o indice que deseja editar: ");
				int indice1 = leia.nextInt();
				if(indice1 >= pacientes.size()) {
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
						
						break; 
					case 3:
						System.out.println("Novo genero: ");
						
						break; 
					case 4: 
						System.out.println("Novo peso: ");
						
						break; 
					case 5: 
						System.out.println("Nova altura: ");
						
						break; 
					case 6: 
						System.out.println("Novo tipo sanguineo: ");
						
						break; 
						
							
					}
				}
				
				break;
				
			case 4: 
				
				System.out.println("\nDigite o paciente que deseja remover: ");
				int index = leia.nextInt();
				if(index < pacientes.size()) {
					pacientes.remove(index);	
				}
				else if (pacientes.size() <= index) {
					System.out.println("\nEste paciente não existe!");
				}
				System.out.println("\nPacientes no cadrastro: ");
				System.out.println(index);
				break;
				
			case 5: 
				//Pesquisar paciente
				break;
				
			case 6:
				
				System.out.println("\nDe qual paciente deseja ver o imc: ");
				int indice = leia.nextInt();
				
				
			case 0: // larissa
				System.out.println("Volte sempre!");
				repeticao = false;
				break;
				
			}
			
			
			
		}
		
		

	}

	}
	


