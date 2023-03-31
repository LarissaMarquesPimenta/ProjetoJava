//larissa

package ProjetoJava;

public class Paciente {
	
	private String nome; 
	private String tipoSanguineo;
	private String genero; 
	private int idade; 
	private double peso; 
	private double altura;
	public Paciente(String nome, String tipoSanguineo, String genero, int idade, double peso, double altura) {
		super();
		this.nome = nome;
		this.tipoSanguineo = tipoSanguineo;
		this.genero = genero;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	} 
	
	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Genero: " + genero);
		System.out.println("Tipo sanguineo: " + tipoSanguineo);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println();
		
	}
	
		  

	public double calcularImc (int iPaciente) {
		
		// Calcular IMC

		
		double imc = peso / (altura * altura);

		System.out.printf("Seu IMC é %.2f\n", imc);

		if (imc < 18.5) {
			System.out.println("O paciente está abaixo do peso.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("O paciente está com o peso normal.");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("O paciente está acima do peso.");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("O paciente está com obesidade grau 1.");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("O paciente está com obesidade grau 2.");
		} else {
			System.out.println("O paciente está com obesidade grau 3.");
		}
		return imc; 
	}
	
}

	
	
	
	
	

