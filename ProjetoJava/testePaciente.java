package projetoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testePaciente {

	public static void main(String[] args) { 
		int opcao; 
		Scanner leia = new Scanner(System.in); 
		
		List<Paciente> pacientes = new ArrayList<>();
	
		
		while(true) {
			
			// Menu
			
			System.out.println("Escolha uma opção.");
			opcao = leia.nextInt();
			
			switch(opcao) {
			
			case 1: 
				//cadastrar paciente 
				break;
				
			case 2:
				if (pacientes.isEmpty()){
					System.out.println("A lista está vazia.");
					}
				else {
					for(Paciente loop:pacientes) {
						loop.visualizar(); }
				}	
				break;
			
			case 3: 
				//Atualizar cadastro
				break;
				
			case 4:
				leia.nextLine();
				System.out.println("\nDigite o paciente que deseja remover: ");
				String paciente = leia.nextLine();
				if(pacientes.contains(paciente)) {
					pacientes.remove(paciente);
					
				}else {
					System.out.println("\nEste paciente não existe!");
				}
				System.out.println("\nPacientes no cadrastro: ");
				System.out.println(paciente);
				break;
				
			case 5: 
				//Excluir cadastro
				break;
				
			case 6: 
				//Sair
				break;
				
			}
			
			
			
		}
		
		

	}

}
