package controleMedico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controle.util.Cores;

public class testePaciente {

	public static void main(String[] args) {
		
		int opcao; 
		Scanner leia = new Scanner(System.in); 
		
		List<Paciente> pacientes = new ArrayList<>();
	
		
		while(true) {
			
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
			
			opcao = leia.nextInt();
			
			if (opcao == 0) {
				System.out.println(Cores.TEXT_GREEN +Cores.ANSI_BLACK_BACKGROUND +"\nObrigado por utilizar nosso programa!");
				leia.close();
				System.exit(0);
			}

			
			switch(opcao) {
			
			case 1: 
				//cadastrar paciente 
				break;
				
			case 2:
				if (pacientes.isEmpty()){
					System.out.println(Cores.TEXT_RED_BOLD_BRIGHT +Cores.ANSI_BLACK_BACKGROUND +"A lista está vazia.");
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
				//Excluir dados
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
