package ProjetoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testePaciente {

	public static void main(String[] args) { 
		int opcao; 
		boolean repeticao = true;
		Scanner leia = new Scanner(System.in); 
		
		List<Paciente> pacientes = new ArrayList<>();
		
		
		while(repeticao == true) {
			
			// Menu
			
			System.out.println("Escolha uma opção.");
			opcao = leia.nextInt();
			
			switch(opcao) {
			
			case 1:
				boolean loop = true;
				int op;
				while(loop == true) {
					System.out.println("Para continuar escreva o nome do paciente ou sair para finalizar o programa.");
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
				//Atualizar cadastro
				break;
				
			case 4: 
				leia.nextLine();
				System.out.println("\nDigite o paciente que deseja remover: ");
				int index = leia.nextInt();
				if(index < pacientes.size()) {
					pacientes.remove(index);	
				}
				else if (pacientes.size() < index) {
					System.out.println("\nEste paciente não existe!");
				}
				System.out.println("\nPacientes no cadrastro: ");
				System.out.println(index);
				break;
				
			case 5: 
				//Pesquisar paciente
				break;
				
			case 6: // larissa
				System.out.println("Volte sempre!");
				repeticao = false;
				break;
				
			}
			
			
			
		}
		
		

	}

}
