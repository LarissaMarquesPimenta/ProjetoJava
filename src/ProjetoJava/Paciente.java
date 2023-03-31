//larissa

package ProjetoJava;

import java.util.Arrays;

public class Paciente {
	
	private String nome; 
	private String tipoSanguineo;
	private String genero; 
	private int idade; 
	private double peso; 
	private double altura;
	private double imc;
	
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
	public double calcular(int indice) {

        double imc = peso / (altura * altura);
        return imc;
   }
   public double getImc() {
       return imc;
   }
   public void setImc(double imc) {
       this.imc = imc;}
		  
   
       public static boolean validarDados(String tipoSanguineo, String genero, int idade, double peso, double altura) {
    	    boolean verificarDados = true;

    	    if (!Arrays.asList("A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-").contains(tipoSanguineo)) {
    	        System.out.println("Tipo sanguíneo inválido. Por favor, digite um tipo sanguíneo válido (A+, A-, B+, B-, AB+, AB-, O+ ou O-).");
    	        verificarDados = false;
    	    }

    	    if (!Arrays.asList("masculino", "feminino").contains(genero)) {
    	        System.out.println("Gênero inválido. Por favor, digite um gênero válido (masculino ou feminino).");
    	        verificarDados = false;
    	    }

    	    if (idade < 0 || idade > 150) {
    	        System.out.println("Idade inválida. Por favor, digite uma idade válida (entre 0 e 150).");
    	        verificarDados = false;
    	    }

    	    if (peso < 0 || peso > 500) {
    	        System.out.println("Peso inválido. Por favor, digite um peso válido (entre 0 e 500).");
    	        verificarDados = false;
    	    }

    	    if (altura < 0 || altura > 3) {
    	        System.out.println("Altura inválida. Por favor, digite uma altura válida (entre 0 e 3 metros).");
    	        verificarDados = false;
    	    }

    	    return verificarDados; 
    	}

	}
   
	
	
	

