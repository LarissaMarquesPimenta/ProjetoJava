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
						System.out.println((pacientes.indexOf(loop) + 1) + "° paciente");
						loop.visualizar(); }
				}	
				break;
			
			case 3: 
				//Atualizar cadastro
				break;
				
			case 4: 
				//Excluir dados
				break;
				
			case 5: 
				//Pesquisar paciente
				break;
				
			case 6: 
				//Sair
				break;
				
			}
			
			
			
		}
		
		

	}

}
